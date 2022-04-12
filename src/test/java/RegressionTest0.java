import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        java.lang.Class<?> wildcardClass1 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        java.lang.Class<?> wildcardClass3 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        int int2 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        avltree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        avltree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree aVLTree5 = new avltree.AVLTree();
        avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree aVLTree3 = new avltree.AVLTree();
        avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = node8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

