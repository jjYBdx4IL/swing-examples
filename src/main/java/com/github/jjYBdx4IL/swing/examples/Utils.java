package com.github.jjYBdx4IL.swing.examples;

import com.github.jjYBdx4IL.utils.env.Surefire;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author jjYBdx4IL
 */
public class Utils {

    public static void waitForFrameClosed(JFrame frame) throws Exception {
        if (!Surefire.isSingleTextExecution()) {
            frame.dispose();
            return;
        }
        
        final AtomicBoolean done = new AtomicBoolean(false);
        while(!done.get()) {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    done.set(!frame.isVisible());
                }
            });
        }
    }
}
