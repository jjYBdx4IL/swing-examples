package com.github.jjYBdx4IL.swing.examples;

import javax.swing.SwingUtilities;

import org.junit.Test;

/**
 *
 * @author jjYBdx4IL
 */
public class DumpUIHierarchyTest extends ExampleJFrameBase {

    @Test
    public void test() {
        SwingUtilities.getRoot(frame).list();
    }

}
