package com.github.jjYBdx4IL.swing.examples.scrollable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jjYBdx4IL
 */
public class CustomPanel extends JPanel {

    private static final Logger LOG = LoggerFactory.getLogger(CustomPanel.class);
    
    public CustomPanel() {
        super();
        setPreferredSize(new Dimension(1000000, 1000000));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        Rectangle b = g.getClipBounds().getBounds();
        g.fillRect(b.x, b.y, b.width, b.height);
        LOG.info(b.toString());
    }
}
