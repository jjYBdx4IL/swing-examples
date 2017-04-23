package com.github.jjYBdx4IL.swing.examples.scrollable;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author jjYBdx4IL
 */
public class AppFrame extends JFrame {

    public AppFrame(String title) {
        super(title);
        
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        pane.add(new JScrollPane(new CustomPanel(), JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
    }
}
