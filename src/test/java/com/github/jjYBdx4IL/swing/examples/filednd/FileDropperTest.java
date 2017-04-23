package com.github.jjYBdx4IL.swing.examples.filednd;

import com.github.jjYBdx4IL.swing.examples.Utils;
import java.awt.Container;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jjYBdx4IL
 */
public class FileDropperTest {
    
    @BeforeClass
    public static void beforeClass() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
    }
    
    @Test
    public void testFileDropper() throws Exception {
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 0.5;
        c.weighty = 0.5;
        pane.add(new FileDropper(), c);
        frame.pack();
        frame.setVisible(true);
        Utils.waitForFrameClosed(frame);
    }
    
}
