package com.github.jjYBdx4IL.swing.examples.filednd;

import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author jjYBdx4IL
 */
public class FileDropper extends JList {

    private final FileTransferHandler handler;
    
    public FileDropper() {
        super(new DefaultListModel());
        setDragEnabled(true);
        handler = new FileTransferHandler(this);
        setTransferHandler(handler);
        setPreferredSize(new Dimension(800,600));
    }
    
}
