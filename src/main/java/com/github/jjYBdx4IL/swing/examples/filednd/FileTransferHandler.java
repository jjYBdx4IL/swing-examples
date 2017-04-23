package com.github.jjYBdx4IL.swing.examples.filednd;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.TransferHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jjYBdx4IL
 */
public class FileTransferHandler extends TransferHandler {

    private static final Logger LOG = LoggerFactory.getLogger(FileTransferHandler.class);

    private final DefaultListModel listModel;
    
    public FileTransferHandler(JList list) {
        super();
        listModel = (DefaultListModel) list.getModel();
    }
    
    @Override
    public boolean canImport(TransferHandler.TransferSupport info) {
        // we only import FileList
        if (!info.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean importData(TransferHandler.TransferSupport info) {
        if (!info.isDrop()) {
            return false;
        }

        // Check for FileList flavor
        if (!info.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
            displayDropLocation("List doesn't accept a drop of this type.");
            return false;
        }

        // Get the fileList that is being dropped.
        Transferable t = info.getTransferable();
        List<File> data;
        try {
            data = (List<File>) t.getTransferData(DataFlavor.javaFileListFlavor);
        } catch (Exception e) {
            return false;
        }
        for (File file : data) {
            listModel.addElement(file);
        }
        return true;
    }

    private void displayDropLocation(String string) {
        LOG.info(string);
    }
}
