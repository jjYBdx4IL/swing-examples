package com.github.jjYBdx4IL.swing.examples.scrollable;

import com.github.jjYBdx4IL.swing.examples.Utils;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import javax.swing.SwingUtilities;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assume;

/**
 *
 * @author jjYBdx4IL
 */
public class EfficientRepaintTest {
    
    @BeforeClass
    public static void beforeClass() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
    }
    
    @Test
    public void test() throws Exception {
        final AppFrame frame = new AppFrame("app frame");
        
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                frame.setPreferredSize(new Dimension(400, 300));
                frame.pack();
                frame.setVisible(true);
            }
        });
        Utils.waitForFrameClosed(frame);
    }

}
