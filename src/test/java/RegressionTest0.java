import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        java.lang.Class<?> wildcardClass1 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        java.lang.Class<?> wildcardClass3 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        java.lang.Class<?> wildcardClass31 = node27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.lang.Class<?> wildcardClass21 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        java.lang.Class<?> wildcardClass43 = node40.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = node3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        avltree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        java.lang.Class<?> wildcardClass38 = node34.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass42 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
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
        java.lang.Class<?> wildcardClass31 = node27.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        avltree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        java.lang.Class<?> wildcardClass38 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        aVLTree0.insert((int) '#');
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.find((-1));
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree aVLTree3 = new avltree.AVLTree();
        avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        java.lang.Class<?> wildcardClass21 = node19.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        avltree.AVLTree.Node node14 = aVLTree8.find(100);
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        avltree.AVLTree aVLTree47 = new avltree.AVLTree();
        avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass24 = node21.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        avltree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        int int19 = aVLTree0.getBalance(node18);
        avltree.AVLTree.Node node21 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) 'a');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree12.getBalance(node18);
        avltree.AVLTree.Node node21 = aVLTree12.find((int) ' ');
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        avltree.AVLTree.Node node26 = aVLTree22.find((int) 'a');
        aVLTree22.delete((int) (short) 10);
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        avltree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        int int41 = aVLTree0.height();
        java.lang.Class<?> wildcardClass42 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        avltree.AVLTree.Node node25 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (byte) 10);
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass23 = node21.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        int int18 = aVLTree13.height();
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree19.getBalance(node20);
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        aVLTree25.delete((int) 'a');
        avltree.AVLTree.Node node30 = aVLTree25.getRoot();
        aVLTree25.delete(0);
        avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree25.getBalance(node33);
        int int35 = aVLTree25.height();
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        avltree.AVLTree.Node node39 = aVLTree36.getRoot();
        aVLTree36.delete(100);
        aVLTree36.insert((int) (byte) 10);
        avltree.AVLTree.Node node44 = aVLTree36.getRoot();
        int int45 = aVLTree25.getBalance(node44);
        int int46 = aVLTree19.getBalance(node44);
        int int47 = aVLTree13.getBalance(node44);
        int int48 = aVLTree0.getBalance(node44);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find(0);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        avltree.AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        avltree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        avltree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree23.getBalance(node51);
        avltree.AVLTree.Node node54 = aVLTree23.getRoot();
        int int55 = aVLTree0.getBalance(node54);
        java.lang.Class<?> wildcardClass56 = node54.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree29.getBalance(node32);
        avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        avltree.AVLTree aVLTree35 = new avltree.AVLTree();
        avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.insert((int) (short) 0);
        avltree.AVLTree.Node node41 = aVLTree35.find(100);
        avltree.AVLTree aVLTree42 = new avltree.AVLTree();
        avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        aVLTree42.delete((int) 'a');
        avltree.AVLTree.Node node47 = aVLTree42.getRoot();
        aVLTree42.delete(0);
        avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree42.getBalance(node50);
        int int52 = aVLTree42.height();
        avltree.AVLTree aVLTree53 = new avltree.AVLTree();
        avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        avltree.AVLTree.Node node56 = aVLTree53.getRoot();
        aVLTree53.delete(100);
        aVLTree53.insert((int) (byte) 10);
        avltree.AVLTree.Node node61 = aVLTree53.getRoot();
        int int62 = aVLTree42.getBalance(node61);
        avltree.AVLTree aVLTree63 = new avltree.AVLTree();
        avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        aVLTree63.delete((int) 'a');
        avltree.AVLTree.Node node68 = aVLTree63.getRoot();
        aVLTree63.delete(0);
        avltree.AVLTree.Node node71 = null;
        int int72 = aVLTree63.getBalance(node71);
        int int73 = aVLTree63.height();
        avltree.AVLTree aVLTree74 = new avltree.AVLTree();
        avltree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        avltree.AVLTree.Node node77 = aVLTree74.getRoot();
        aVLTree74.delete(100);
        aVLTree74.insert((int) (byte) 10);
        avltree.AVLTree.Node node82 = aVLTree74.getRoot();
        int int83 = aVLTree63.getBalance(node82);
        int int84 = aVLTree42.getBalance(node82);
        int int85 = aVLTree35.getBalance(node82);
        int int86 = aVLTree29.getBalance(node82);
        int int87 = aVLTree0.getBalance(node82);
        java.lang.Class<?> wildcardClass88 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        avltree.AVLTree.Node node6 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        aVLTree24.delete(1);
        aVLTree24.delete((int) '#');
        aVLTree24.delete((int) (short) -1);
        aVLTree24.insert((int) (short) -1);
        aVLTree24.delete((int) (byte) 100);
        avltree.AVLTree.Node node39 = aVLTree24.getRoot();
        int int40 = aVLTree0.getBalance(node39);
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
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = node8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) ' ');
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        int int31 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.insert(10);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        java.lang.Class<?> wildcardClass24 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
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
        int int29 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass30 = node27.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree33 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree33.getBalance(node43);
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        aVLTree45.delete((int) 'a');
        avltree.AVLTree.Node node50 = aVLTree45.getRoot();
        avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree45.getBalance(node51);
        avltree.AVLTree.Node node54 = aVLTree45.find((int) ' ');
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree55.find((int) 'a');
        aVLTree55.delete((int) (short) 10);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node63 = null;
        int int64 = aVLTree62.getBalance(node63);
        aVLTree62.insert((int) (byte) 100);
        aVLTree62.insert((int) 'a');
        avltree.AVLTree.Node node70 = aVLTree62.find((int) (byte) 100);
        int int71 = aVLTree55.getBalance(node70);
        int int72 = aVLTree45.getBalance(node70);
        int int73 = aVLTree33.getBalance(node70);
        int int74 = aVLTree0.getBalance(node70);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass43 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        avltree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree12.getBalance(node18);
        avltree.AVLTree.Node node21 = aVLTree12.find((int) ' ');
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        avltree.AVLTree.Node node26 = aVLTree22.find((int) 'a');
        aVLTree22.delete((int) (short) 10);
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        avltree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        int int41 = aVLTree0.height();
        avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.find(1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass44 = aVLTree0.getClass();
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
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node10 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((-1));
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete(0);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete(0);
        java.lang.Class<?> wildcardClass53 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) ' ');
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass30 = node27.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree aVLTree3 = new avltree.AVLTree();
        avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        int int30 = aVLTree24.height();
        avltree.AVLTree.Node node32 = aVLTree24.find((int) (short) -1);
        avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        avltree.AVLTree aVLTree54 = new avltree.AVLTree();
        avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        avltree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        avltree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree34.getBalance(node62);
        int int65 = aVLTree24.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) (byte) 1);
        int int69 = aVLTree0.height();
        int int70 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        avltree.AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        avltree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        avltree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree23.getBalance(node51);
        avltree.AVLTree.Node node54 = aVLTree23.getRoot();
        int int55 = aVLTree0.getBalance(node54);
        java.lang.Class<?> wildcardClass56 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) '4');
        avltree.AVLTree.Node node22 = aVLTree14.find(100);
        avltree.AVLTree.Node node23 = aVLTree14.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        java.lang.Class<?> wildcardClass25 = node23.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert((int) '#');
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree49.getBalance(node55);
        avltree.AVLTree.Node node58 = aVLTree49.find((int) ' ');
        aVLTree49.insert((-1));
        avltree.AVLTree.Node node61 = aVLTree49.getRoot();
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        int int67 = aVLTree62.height();
        avltree.AVLTree aVLTree68 = new avltree.AVLTree();
        avltree.AVLTree.Node node69 = null;
        int int70 = aVLTree68.getBalance(node69);
        avltree.AVLTree.Node node71 = aVLTree68.getRoot();
        aVLTree68.insert((int) (byte) 100);
        avltree.AVLTree aVLTree74 = new avltree.AVLTree();
        avltree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        aVLTree74.delete((int) 'a');
        avltree.AVLTree.Node node79 = aVLTree74.getRoot();
        aVLTree74.delete(0);
        avltree.AVLTree.Node node82 = null;
        int int83 = aVLTree74.getBalance(node82);
        int int84 = aVLTree74.height();
        avltree.AVLTree aVLTree85 = new avltree.AVLTree();
        avltree.AVLTree.Node node87 = aVLTree85.find((int) '4');
        avltree.AVLTree.Node node88 = aVLTree85.getRoot();
        aVLTree85.delete(100);
        aVLTree85.insert((int) (byte) 10);
        avltree.AVLTree.Node node93 = aVLTree85.getRoot();
        int int94 = aVLTree74.getBalance(node93);
        int int95 = aVLTree68.getBalance(node93);
        int int96 = aVLTree62.getBalance(node93);
        int int97 = aVLTree49.getBalance(node93);
        avltree.AVLTree.Node node98 = aVLTree49.getRoot();
        int int99 = aVLTree0.getBalance(node98);
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
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(node98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 0 + "'", int99 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        int int15 = aVLTree0.height();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        int int15 = aVLTree0.height();
        avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        avltree.AVLTree.Node node18 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find(100);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        int int22 = aVLTree0.height();
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (short) -1);
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
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
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree2 = new avltree.AVLTree();
        avltree.AVLTree.Node node4 = aVLTree2.find((int) '4');
        avltree.AVLTree.Node node5 = aVLTree2.getRoot();
        avltree.AVLTree.Node node7 = aVLTree2.find((int) (short) -1);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree8.getRoot();
        aVLTree8.delete(0);
        avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree8.getBalance(node16);
        int int18 = aVLTree8.height();
        aVLTree8.delete(100);
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree8.getBalance(node29);
        int int31 = aVLTree2.getBalance(node29);
        int int32 = aVLTree0.getBalance(node29);
        java.lang.Class<?> wildcardClass33 = node29.getClass();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        aVLTree9.delete((int) (byte) -1);
        aVLTree9.delete((int) (byte) 0);
        aVLTree9.insert((int) (byte) -1);
        aVLTree9.insert(1);
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        aVLTree18.insert((int) (short) 0);
        avltree.AVLTree.Node node24 = aVLTree18.find(100);
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        aVLTree25.delete((int) 'a');
        avltree.AVLTree.Node node30 = aVLTree25.getRoot();
        aVLTree25.delete(0);
        avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree25.getBalance(node33);
        int int35 = aVLTree25.height();
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        avltree.AVLTree.Node node39 = aVLTree36.getRoot();
        aVLTree36.delete(100);
        aVLTree36.insert((int) (byte) 10);
        avltree.AVLTree.Node node44 = aVLTree36.getRoot();
        int int45 = aVLTree25.getBalance(node44);
        avltree.AVLTree aVLTree46 = new avltree.AVLTree();
        avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        aVLTree46.delete((int) 'a');
        avltree.AVLTree.Node node51 = aVLTree46.getRoot();
        aVLTree46.delete(0);
        avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree46.getBalance(node54);
        int int56 = aVLTree46.height();
        avltree.AVLTree aVLTree57 = new avltree.AVLTree();
        avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        avltree.AVLTree.Node node60 = aVLTree57.getRoot();
        aVLTree57.delete(100);
        aVLTree57.insert((int) (byte) 10);
        avltree.AVLTree.Node node65 = aVLTree57.getRoot();
        int int66 = aVLTree46.getBalance(node65);
        int int67 = aVLTree25.getBalance(node65);
        int int68 = aVLTree18.getBalance(node65);
        int int69 = aVLTree9.getBalance(node65);
        int int70 = aVLTree0.getBalance(node65);
        java.lang.Class<?> wildcardClass71 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree33 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree33.getBalance(node43);
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        aVLTree45.delete((int) 'a');
        avltree.AVLTree.Node node50 = aVLTree45.getRoot();
        avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree45.getBalance(node51);
        avltree.AVLTree.Node node54 = aVLTree45.find((int) ' ');
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree55.find((int) 'a');
        aVLTree55.delete((int) (short) 10);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node63 = null;
        int int64 = aVLTree62.getBalance(node63);
        aVLTree62.insert((int) (byte) 100);
        aVLTree62.insert((int) 'a');
        avltree.AVLTree.Node node70 = aVLTree62.find((int) (byte) 100);
        int int71 = aVLTree55.getBalance(node70);
        int int72 = aVLTree45.getBalance(node70);
        int int73 = aVLTree33.getBalance(node70);
        int int74 = aVLTree0.getBalance(node70);
        aVLTree0.delete((int) '4');
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        avltree.AVLTree.Node node13 = aVLTree0.find(0);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree23.getBalance(node29);
        avltree.AVLTree.Node node32 = aVLTree23.find((int) ' ');
        avltree.AVLTree aVLTree33 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        avltree.AVLTree.Node node37 = aVLTree33.find((int) 'a');
        aVLTree33.delete((int) (short) 10);
        avltree.AVLTree aVLTree40 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.insert((int) (byte) 100);
        aVLTree40.insert((int) 'a');
        avltree.AVLTree.Node node48 = aVLTree40.find((int) (byte) 100);
        int int49 = aVLTree33.getBalance(node48);
        int int50 = aVLTree23.getBalance(node48);
        int int51 = aVLTree14.getBalance(node48);
        avltree.AVLTree aVLTree52 = new avltree.AVLTree();
        avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        avltree.AVLTree.Node node56 = aVLTree52.find((int) 'a');
        avltree.AVLTree.Node node57 = aVLTree52.getRoot();
        avltree.AVLTree.Node node58 = aVLTree52.getRoot();
        avltree.AVLTree.Node node59 = aVLTree52.getRoot();
        avltree.AVLTree aVLTree60 = new avltree.AVLTree();
        avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        avltree.AVLTree aVLTree63 = new avltree.AVLTree();
        avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        avltree.AVLTree.Node node66 = aVLTree63.getRoot();
        aVLTree63.insert((int) (byte) 100);
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        avltree.AVLTree.Node node72 = null;
        int int73 = aVLTree69.getBalance(node72);
        aVLTree69.insert((int) (short) 100);
        avltree.AVLTree.Node node77 = aVLTree69.find((int) ' ');
        int int78 = aVLTree69.height();
        avltree.AVLTree.Node node79 = aVLTree69.getRoot();
        int int80 = aVLTree63.getBalance(node79);
        int int81 = aVLTree60.getBalance(node79);
        int int82 = aVLTree52.getBalance(node79);
        int int83 = aVLTree14.getBalance(node79);
        int int84 = aVLTree0.getBalance(node79);
        java.lang.Class<?> wildcardClass85 = node79.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        avltree.AVLTree.Node node15 = aVLTree10.getRoot();
        avltree.AVLTree.Node node16 = aVLTree10.getRoot();
        avltree.AVLTree.Node node17 = aVLTree10.getRoot();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.insert((int) (byte) 100);
        avltree.AVLTree aVLTree27 = new avltree.AVLTree();
        avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree27.getBalance(node30);
        aVLTree27.insert((int) (short) 100);
        avltree.AVLTree.Node node35 = aVLTree27.find((int) ' ');
        int int36 = aVLTree27.height();
        avltree.AVLTree.Node node37 = aVLTree27.getRoot();
        int int38 = aVLTree21.getBalance(node37);
        int int39 = aVLTree18.getBalance(node37);
        int int40 = aVLTree10.getBalance(node37);
        int int41 = aVLTree0.getBalance(node37);
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        aVLTree0.delete((int) (short) 1);
        int int17 = aVLTree0.height();
        aVLTree0.delete((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) '#');
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        int int15 = aVLTree12.height();
        int int16 = aVLTree12.height();
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        aVLTree26.delete((int) 'a');
        avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete(0);
        avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree26.getBalance(node34);
        int int36 = aVLTree26.height();
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        avltree.AVLTree.Node node45 = aVLTree37.getRoot();
        int int46 = aVLTree26.getBalance(node45);
        int int47 = aVLTree17.getBalance(node45);
        int int48 = aVLTree12.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        int int50 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        avltree.AVLTree.Node node22 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass4 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        int int13 = aVLTree0.height();
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) ' ');
        avltree.AVLTree.Node node18 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree6.getBalance(node25);
        avltree.AVLTree aVLTree27 = new avltree.AVLTree();
        avltree.AVLTree.Node node29 = aVLTree27.find((-1));
        int int30 = aVLTree27.height();
        avltree.AVLTree.Node node31 = aVLTree27.getRoot();
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        avltree.AVLTree.Node node46 = aVLTree41.getRoot();
        aVLTree41.delete(0);
        avltree.AVLTree.Node node49 = null;
        int int50 = aVLTree41.getBalance(node49);
        int int51 = aVLTree41.height();
        avltree.AVLTree aVLTree52 = new avltree.AVLTree();
        avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        avltree.AVLTree.Node node55 = aVLTree52.getRoot();
        aVLTree52.delete(100);
        aVLTree52.insert((int) (byte) 10);
        avltree.AVLTree.Node node60 = aVLTree52.getRoot();
        int int61 = aVLTree41.getBalance(node60);
        int int62 = aVLTree32.getBalance(node60);
        avltree.AVLTree.Node node63 = aVLTree32.getRoot();
        int int64 = aVLTree27.getBalance(node63);
        int int65 = aVLTree6.getBalance(node63);
        int int66 = aVLTree0.getBalance(node63);
        java.lang.Class<?> wildcardClass67 = node63.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree aVLTree3 = new avltree.AVLTree();
        avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        java.lang.Class<?> wildcardClass22 = node19.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) 100);
        int int6 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.insert(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree29.getBalance(node32);
        avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        avltree.AVLTree aVLTree35 = new avltree.AVLTree();
        avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.insert((int) (short) 0);
        avltree.AVLTree.Node node41 = aVLTree35.find(100);
        avltree.AVLTree aVLTree42 = new avltree.AVLTree();
        avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        aVLTree42.delete((int) 'a');
        avltree.AVLTree.Node node47 = aVLTree42.getRoot();
        aVLTree42.delete(0);
        avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree42.getBalance(node50);
        int int52 = aVLTree42.height();
        avltree.AVLTree aVLTree53 = new avltree.AVLTree();
        avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        avltree.AVLTree.Node node56 = aVLTree53.getRoot();
        aVLTree53.delete(100);
        aVLTree53.insert((int) (byte) 10);
        avltree.AVLTree.Node node61 = aVLTree53.getRoot();
        int int62 = aVLTree42.getBalance(node61);
        avltree.AVLTree aVLTree63 = new avltree.AVLTree();
        avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        aVLTree63.delete((int) 'a');
        avltree.AVLTree.Node node68 = aVLTree63.getRoot();
        aVLTree63.delete(0);
        avltree.AVLTree.Node node71 = null;
        int int72 = aVLTree63.getBalance(node71);
        int int73 = aVLTree63.height();
        avltree.AVLTree aVLTree74 = new avltree.AVLTree();
        avltree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        avltree.AVLTree.Node node77 = aVLTree74.getRoot();
        aVLTree74.delete(100);
        aVLTree74.insert((int) (byte) 10);
        avltree.AVLTree.Node node82 = aVLTree74.getRoot();
        int int83 = aVLTree63.getBalance(node82);
        int int84 = aVLTree42.getBalance(node82);
        int int85 = aVLTree35.getBalance(node82);
        int int86 = aVLTree29.getBalance(node82);
        int int87 = aVLTree0.getBalance(node82);
        int int88 = aVLTree0.height();
        java.lang.Class<?> wildcardClass89 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find(0);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        avltree.AVLTree.Node node51 = aVLTree0.find(0);
        avltree.AVLTree.Node node53 = aVLTree0.find(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass54 = node53.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) 'a');
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass7 = node6.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find(0);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        avltree.AVLTree.Node node51 = aVLTree0.find(0);
        avltree.AVLTree.Node node53 = aVLTree0.find(1);
        java.lang.Class<?> wildcardClass54 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree0.getBalance(node21);
        avltree.AVLTree.Node node24 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int12 = aVLTree0.height();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node10 = aVLTree0.find(0);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        avltree.AVLTree.Node node25 = aVLTree0.find((int) ' ');
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree33 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree33.getBalance(node43);
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        aVLTree45.delete((int) 'a');
        avltree.AVLTree.Node node50 = aVLTree45.getRoot();
        avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree45.getBalance(node51);
        avltree.AVLTree.Node node54 = aVLTree45.find((int) ' ');
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree55.find((int) 'a');
        aVLTree55.delete((int) (short) 10);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node63 = null;
        int int64 = aVLTree62.getBalance(node63);
        aVLTree62.insert((int) (byte) 100);
        aVLTree62.insert((int) 'a');
        avltree.AVLTree.Node node70 = aVLTree62.find((int) (byte) 100);
        int int71 = aVLTree55.getBalance(node70);
        int int72 = aVLTree45.getBalance(node70);
        int int73 = aVLTree33.getBalance(node70);
        int int74 = aVLTree0.getBalance(node70);
        java.lang.Class<?> wildcardClass75 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.insert((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        int int22 = aVLTree0.height();
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete((int) (short) 10);
        avltree.AVLTree.Node node31 = aVLTree23.getRoot();
        avltree.AVLTree.Node node32 = aVLTree23.getRoot();
        aVLTree23.insert((int) (byte) 100);
        avltree.AVLTree.Node node35 = aVLTree23.getRoot();
        int int36 = aVLTree0.getBalance(node35);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        aVLTree0.delete((int) (byte) -1);
        int int26 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        avltree.AVLTree.Node node29 = aVLTree23.find((int) ' ');
        avltree.AVLTree.Node node31 = aVLTree23.find(0);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        aVLTree32.delete(1);
        aVLTree32.delete((int) '#');
        aVLTree32.delete((int) (short) -1);
        avltree.AVLTree.Node node43 = aVLTree32.getRoot();
        avltree.AVLTree.Node node45 = aVLTree32.find((int) (byte) 100);
        int int46 = aVLTree32.height();
        avltree.AVLTree aVLTree47 = new avltree.AVLTree();
        avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.insert((int) (byte) 100);
        avltree.AVLTree aVLTree53 = new avltree.AVLTree();
        avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        avltree.AVLTree.Node node57 = aVLTree53.find((int) 'a');
        aVLTree53.delete((int) (short) 10);
        avltree.AVLTree aVLTree60 = new avltree.AVLTree();
        avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.insert((int) (byte) 100);
        aVLTree60.insert((int) 'a');
        avltree.AVLTree.Node node68 = aVLTree60.find((int) (byte) 100);
        int int69 = aVLTree53.getBalance(node68);
        int int70 = aVLTree47.getBalance(node68);
        int int71 = aVLTree32.getBalance(node68);
        int int72 = aVLTree23.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        avltree.AVLTree.Node node74 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.find((-1));
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree9.getBalance(node19);
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree21.getBalance(node27);
        avltree.AVLTree.Node node30 = aVLTree21.find((int) ' ');
        avltree.AVLTree aVLTree31 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        aVLTree31.delete((int) (short) 10);
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.insert((int) 'a');
        avltree.AVLTree.Node node46 = aVLTree38.find((int) (byte) 100);
        int int47 = aVLTree31.getBalance(node46);
        int int48 = aVLTree21.getBalance(node46);
        int int49 = aVLTree9.getBalance(node46);
        int int50 = aVLTree0.getBalance(node46);
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        int int30 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        avltree.AVLTree.Node node21 = aVLTree0.getRoot();
        avltree.AVLTree.Node node22 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        aVLTree6.insert((int) (byte) 100);
        aVLTree6.insert((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree6.find((int) (byte) 100);
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        int int36 = aVLTree6.getBalance(node34);
        avltree.AVLTree.Node node37 = aVLTree6.getRoot();
        int int38 = aVLTree0.getBalance(node37);
        java.lang.Class<?> wildcardClass39 = node37.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node7 = aVLTree0.find((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) (short) 0);
        java.lang.Class<?> wildcardClass50 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        avltree.AVLTree.Node node17 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.delete((int) (short) -1);
        avltree.AVLTree aVLTree16 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.insert((int) (short) 0);
        avltree.AVLTree.Node node22 = aVLTree16.find(100);
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        avltree.AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        avltree.AVLTree aVLTree44 = new avltree.AVLTree();
        avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        aVLTree44.delete((int) 'a');
        avltree.AVLTree.Node node49 = aVLTree44.getRoot();
        aVLTree44.delete(0);
        avltree.AVLTree.Node node52 = null;
        int int53 = aVLTree44.getBalance(node52);
        int int54 = aVLTree44.height();
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        avltree.AVLTree.Node node58 = aVLTree55.getRoot();
        aVLTree55.delete(100);
        aVLTree55.insert((int) (byte) 10);
        avltree.AVLTree.Node node63 = aVLTree55.getRoot();
        int int64 = aVLTree44.getBalance(node63);
        int int65 = aVLTree23.getBalance(node63);
        int int66 = aVLTree16.getBalance(node63);
        int int67 = aVLTree8.getBalance(node63);
        int int68 = aVLTree0.getBalance(node63);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree.Node node7 = aVLTree0.find((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node21 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        int int5 = aVLTree0.height();
        avltree.AVLTree.Node node7 = aVLTree0.find((-1));
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        int int16 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete((int) '4');
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree21.getBalance(node27);
        avltree.AVLTree.Node node30 = aVLTree21.find((int) ' ');
        avltree.AVLTree.Node node31 = aVLTree21.getRoot();
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.insert((int) (byte) 100);
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree38.getBalance(node41);
        aVLTree38.insert((int) (short) 100);
        avltree.AVLTree.Node node46 = aVLTree38.find((int) ' ');
        int int47 = aVLTree38.height();
        avltree.AVLTree.Node node48 = aVLTree38.getRoot();
        int int49 = aVLTree32.getBalance(node48);
        int int50 = aVLTree21.getBalance(node48);
        int int51 = aVLTree0.getBalance(node48);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass17 = node16.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        avltree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        java.lang.Class<?> wildcardClass45 = node40.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.find(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.insert((int) (short) 0);
        avltree.AVLTree.Node node12 = aVLTree6.find(100);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree13.getBalance(node32);
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        avltree.AVLTree.Node node39 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree34.getBalance(node42);
        int int44 = aVLTree34.height();
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        avltree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        int int55 = aVLTree13.getBalance(node53);
        int int56 = aVLTree6.getBalance(node53);
        int int57 = aVLTree0.getBalance(node53);
        int int58 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        java.lang.Class<?> wildcardClass61 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find(100);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.delete((int) 'a');
        avltree.AVLTree.Node node15 = aVLTree10.getRoot();
        aVLTree10.delete(0);
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree10.getBalance(node18);
        int int20 = aVLTree10.height();
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree10.getBalance(node29);
        avltree.AVLTree aVLTree31 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        avltree.AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        int int41 = aVLTree31.height();
        avltree.AVLTree aVLTree42 = new avltree.AVLTree();
        avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        avltree.AVLTree.Node node50 = aVLTree42.getRoot();
        int int51 = aVLTree31.getBalance(node50);
        int int52 = aVLTree10.getBalance(node50);
        int int53 = aVLTree0.getBalance(node50);
        aVLTree0.insert(100);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node15 = aVLTree11.find((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree11.find((int) ' ');
        avltree.AVLTree.Node node19 = aVLTree11.find((int) '#');
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree20.getBalance(node23);
        aVLTree20.insert((int) (short) 100);
        avltree.AVLTree.Node node28 = aVLTree20.find((int) ' ');
        int int29 = aVLTree20.height();
        avltree.AVLTree.Node node30 = aVLTree20.getRoot();
        int int31 = aVLTree11.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        int int33 = aVLTree0.height();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        int int40 = aVLTree34.height();
        avltree.AVLTree.Node node42 = aVLTree34.find((int) (short) -1);
        avltree.AVLTree.Node node43 = aVLTree34.getRoot();
        avltree.AVLTree.Node node44 = aVLTree34.getRoot();
        aVLTree34.insert((int) (byte) 1);
        avltree.AVLTree.Node node47 = aVLTree34.getRoot();
        int int48 = aVLTree0.getBalance(node47);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        int int13 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 100);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        int int47 = aVLTree0.height();
        avltree.AVLTree aVLTree48 = new avltree.AVLTree();
        avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        aVLTree48.delete(1);
        aVLTree48.delete((int) '#');
        aVLTree48.delete((int) (short) -1);
        avltree.AVLTree.Node node59 = aVLTree48.getRoot();
        aVLTree48.insert(10);
        aVLTree48.delete(1);
        avltree.AVLTree.Node node64 = aVLTree48.getRoot();
        int int65 = aVLTree0.getBalance(node64);
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
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete((-1));
        aVLTree0.insert((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree6.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        avltree.AVLTree.Node node15 = aVLTree12.getRoot();
        aVLTree12.insert((int) (byte) 100);
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree18.find((int) 'a');
        aVLTree18.delete((int) (short) 10);
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        aVLTree25.insert((int) (byte) 100);
        aVLTree25.insert((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree25.find((int) (byte) 100);
        int int34 = aVLTree18.getBalance(node33);
        int int35 = aVLTree12.getBalance(node33);
        int int36 = aVLTree0.getBalance(node33);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass48 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        avltree.AVLTree.Node node21 = aVLTree0.getRoot();
        avltree.AVLTree.Node node23 = aVLTree0.find((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        avltree.AVLTree.Node node6 = aVLTree0.find(100);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.delete(100);
        aVLTree7.insert((int) (byte) 10);
        avltree.AVLTree.Node node15 = aVLTree7.getRoot();
        int int16 = aVLTree0.getBalance(node15);
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node9 = aVLTree0.find(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        int int12 = aVLTree0.height();
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        avltree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        java.lang.Class<?> wildcardClass45 = node40.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        avltree.AVLTree.Node node18 = aVLTree0.find((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = node18.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        int int16 = aVLTree0.height();
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.insert((int) (byte) 100);
        int int23 = aVLTree17.height();
        aVLTree17.insert(1);
        aVLTree17.insert(0);
        avltree.AVLTree.Node node28 = aVLTree17.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        int int11 = aVLTree0.height();
        aVLTree0.insert(0);
        avltree.AVLTree.Node node15 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        avltree.AVLTree.Node node19 = aVLTree13.find((int) ' ');
        avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree22.getRoot();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        avltree.AVLTree.Node node29 = aVLTree24.find((int) (short) -1);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        aVLTree30.delete(100);
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree30.getBalance(node51);
        int int53 = aVLTree24.getBalance(node51);
        int int54 = aVLTree22.getBalance(node51);
        int int55 = aVLTree13.getBalance(node51);
        int int56 = aVLTree0.getBalance(node51);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) '#');
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        java.lang.Class<?> wildcardClass51 = node47.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        aVLTree0.delete((int) (byte) 100);
        avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        avltree.AVLTree.Node node46 = aVLTree0.getRoot();
        avltree.AVLTree.Node node48 = aVLTree0.find(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass49 = node48.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        avltree.AVLTree.Node node46 = aVLTree0.find(100);
        avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete((int) (short) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        avltree.AVLTree.Node node22 = aVLTree13.getRoot();
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree23.getBalance(node24);
        aVLTree23.insert((int) (byte) 100);
        aVLTree23.insert((int) 'a');
        avltree.AVLTree.Node node31 = aVLTree23.find((int) (byte) 100);
        int int32 = aVLTree13.getBalance(node31);
        int int33 = aVLTree0.getBalance(node31);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) '4');
        avltree.AVLTree.Node node22 = aVLTree14.find(100);
        avltree.AVLTree.Node node23 = aVLTree14.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        aVLTree0.insert((-1));
        aVLTree0.delete((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete(0);
        aVLTree0.delete(10);
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        avltree.AVLTree.Node node25 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass26 = node25.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert(0);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        avltree.AVLTree.Node node18 = aVLTree0.find(0);
        aVLTree0.insert((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node8 = aVLTree0.find(10);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        int int27 = aVLTree21.height();
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        avltree.AVLTree aVLTree60 = new avltree.AVLTree();
        avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree28.getBalance(node68);
        int int71 = aVLTree21.getBalance(node68);
        int int72 = aVLTree0.getBalance(node68);
        avltree.AVLTree.Node node73 = aVLTree0.getRoot();
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node73);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = node5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = node6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (short) 100);
        avltree.AVLTree.Node node26 = aVLTree18.find((int) ' ');
        int int27 = aVLTree18.height();
        avltree.AVLTree.Node node28 = aVLTree18.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        aVLTree0.delete((int) (short) -1);
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) '#');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        avltree.AVLTree.Node node14 = aVLTree8.find(100);
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        avltree.AVLTree aVLTree47 = new avltree.AVLTree();
        avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        avltree.AVLTree.Node node63 = aVLTree0.find((int) (byte) 0);
        java.lang.Class<?> wildcardClass64 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) 'a');
        java.lang.Class<?> wildcardClass25 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        avltree.AVLTree.Node node20 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree0.find((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = node24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node15 = aVLTree11.find((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree11.find((int) ' ');
        avltree.AVLTree.Node node19 = aVLTree11.find((int) '#');
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree20.getBalance(node23);
        aVLTree20.insert((int) (short) 100);
        avltree.AVLTree.Node node28 = aVLTree20.find((int) ' ');
        int int29 = aVLTree20.height();
        avltree.AVLTree.Node node30 = aVLTree20.getRoot();
        int int31 = aVLTree11.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        int int33 = aVLTree0.height();
        java.lang.Class<?> wildcardClass34 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        avltree.AVLTree.Node node25 = aVLTree0.find((int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = aVLTree0.getClass();
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete((int) ' ');
        avltree.AVLTree.Node node33 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find(0);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        avltree.AVLTree.Node node53 = null;
        int int54 = aVLTree0.getBalance(node53);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) 1);
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.insert(0);
        avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass14 = node13.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        int int21 = aVLTree12.height();
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.insert((int) (short) 0);
        avltree.AVLTree.Node node28 = aVLTree22.find(100);
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        aVLTree29.insert((int) (byte) 10);
        avltree.AVLTree.Node node37 = aVLTree29.getRoot();
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        java.lang.Class<?> wildcardClass41 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        avltree.AVLTree.Node node20 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass23 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) '#');
        avltree.AVLTree aVLTree48 = new avltree.AVLTree();
        avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        aVLTree48.insert((int) (short) 1);
        avltree.AVLTree.Node node56 = aVLTree48.find((int) ' ');
        aVLTree48.insert((int) (short) 10);
        aVLTree48.insert(0);
        avltree.AVLTree.Node node61 = aVLTree48.getRoot();
        int int62 = aVLTree0.getBalance(node61);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        avltree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        aVLTree0.delete((-1));
        java.lang.Class<?> wildcardClass47 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree31 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        int int36 = aVLTree31.height();
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.insert((int) (byte) 100);
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        avltree.AVLTree aVLTree54 = new avltree.AVLTree();
        avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        avltree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        avltree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree37.getBalance(node62);
        int int65 = aVLTree31.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        int int67 = aVLTree0.height();
        java.lang.Class<?> wildcardClass68 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree4 = new avltree.AVLTree();
        avltree.AVLTree.Node node6 = aVLTree4.find((int) '4');
        avltree.AVLTree.Node node8 = aVLTree4.find((int) 'a');
        aVLTree4.insert((int) (short) -1);
        int int11 = aVLTree4.height();
        avltree.AVLTree.Node node12 = aVLTree4.getRoot();
        int int13 = aVLTree0.getBalance(node12);
        java.lang.Class<?> wildcardClass14 = node12.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        aVLTree0.insert(1);
        aVLTree0.insert((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        avltree.AVLTree aVLTree16 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.delete((int) 'a');
        avltree.AVLTree.Node node21 = aVLTree16.getRoot();
        aVLTree16.delete(0);
        avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree16.getBalance(node24);
        int int26 = aVLTree16.height();
        avltree.AVLTree aVLTree27 = new avltree.AVLTree();
        avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        avltree.AVLTree.Node node30 = aVLTree27.getRoot();
        aVLTree27.delete(100);
        aVLTree27.insert((int) (byte) 10);
        avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree16.getBalance(node35);
        int int37 = aVLTree7.getBalance(node35);
        avltree.AVLTree.Node node38 = aVLTree7.getRoot();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        avltree.AVLTree.Node node45 = aVLTree39.find((int) ' ');
        avltree.AVLTree.Node node47 = aVLTree39.find(0);
        avltree.AVLTree aVLTree48 = new avltree.AVLTree();
        avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        aVLTree48.delete(1);
        aVLTree48.delete((int) '#');
        aVLTree48.delete((int) (short) -1);
        avltree.AVLTree.Node node59 = aVLTree48.getRoot();
        avltree.AVLTree.Node node61 = aVLTree48.find((int) (byte) 100);
        int int62 = aVLTree48.height();
        avltree.AVLTree aVLTree63 = new avltree.AVLTree();
        avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        avltree.AVLTree.Node node66 = aVLTree63.getRoot();
        aVLTree63.insert((int) (byte) 100);
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        avltree.AVLTree aVLTree76 = new avltree.AVLTree();
        avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree63.getBalance(node84);
        int int87 = aVLTree48.getBalance(node84);
        int int88 = aVLTree39.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        java.lang.Class<?> wildcardClass91 = node84.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
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
        int int29 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass30 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        avltree.AVLTree.Node node13 = aVLTree7.find(100);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node29 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree0.getBalance(node15);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        avltree.AVLTree.Node node15 = aVLTree9.find((int) ' ');
        avltree.AVLTree.Node node17 = aVLTree9.find((int) (byte) 100);
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree18.getRoot();
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        avltree.AVLTree.Node node25 = aVLTree20.find((int) (short) -1);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        aVLTree26.delete((int) 'a');
        avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete(0);
        avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree26.getBalance(node34);
        int int36 = aVLTree26.height();
        aVLTree26.delete(100);
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree26.getBalance(node47);
        int int49 = aVLTree20.getBalance(node47);
        int int50 = aVLTree18.getBalance(node47);
        int int51 = aVLTree9.getBalance(node47);
        aVLTree9.delete(10);
        avltree.AVLTree aVLTree54 = new avltree.AVLTree();
        avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree54.getBalance(node57);
        aVLTree54.insert(0);
        aVLTree54.insert((int) (short) 10);
        avltree.AVLTree.Node node63 = aVLTree54.getRoot();
        avltree.AVLTree aVLTree64 = new avltree.AVLTree();
        avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        aVLTree64.insert((int) (byte) 100);
        aVLTree64.insert((int) 'a');
        avltree.AVLTree.Node node72 = aVLTree64.find((int) (byte) 100);
        avltree.AVLTree aVLTree73 = new avltree.AVLTree();
        avltree.AVLTree.Node node75 = aVLTree73.find((int) '4');
        aVLTree73.delete((int) 'a');
        avltree.AVLTree.Node node78 = aVLTree73.getRoot();
        aVLTree73.delete(0);
        avltree.AVLTree.Node node81 = null;
        int int82 = aVLTree73.getBalance(node81);
        int int83 = aVLTree73.height();
        avltree.AVLTree aVLTree84 = new avltree.AVLTree();
        avltree.AVLTree.Node node86 = aVLTree84.find((int) '4');
        avltree.AVLTree.Node node87 = aVLTree84.getRoot();
        aVLTree84.delete(100);
        aVLTree84.insert((int) (byte) 10);
        avltree.AVLTree.Node node92 = aVLTree84.getRoot();
        int int93 = aVLTree73.getBalance(node92);
        int int94 = aVLTree64.getBalance(node92);
        int int95 = aVLTree54.getBalance(node92);
        int int96 = aVLTree9.getBalance(node92);
        int int97 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        aVLTree0.insert((int) (byte) 0);
        avltree.AVLTree.Node node20 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.insert((int) (byte) 100);
        aVLTree14.insert((int) 'a');
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree21.getBalance(node24);
        aVLTree21.insert((int) (short) 100);
        avltree.AVLTree.Node node29 = aVLTree21.find((int) ' ');
        int int30 = aVLTree21.height();
        avltree.AVLTree.Node node31 = aVLTree21.getRoot();
        int int32 = aVLTree14.getBalance(node31);
        avltree.AVLTree aVLTree33 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        int int43 = aVLTree33.height();
        aVLTree33.delete(100);
        avltree.AVLTree aVLTree46 = new avltree.AVLTree();
        avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        avltree.AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        avltree.AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree33.getBalance(node54);
        int int56 = aVLTree14.getBalance(node54);
        int int57 = aVLTree0.getBalance(node54);
        java.lang.Class<?> wildcardClass58 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        avltree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        avltree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 1);
        avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass17 = node16.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.find(10);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        aVLTree11.delete(0);
        avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree11.getBalance(node19);
        int int21 = aVLTree11.height();
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        avltree.AVLTree.Node node25 = aVLTree22.getRoot();
        aVLTree22.delete(100);
        aVLTree22.insert((int) (byte) 10);
        avltree.AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree11.getBalance(node30);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        avltree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        avltree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree11.getBalance(node51);
        int int54 = aVLTree0.getBalance(node51);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        avltree.AVLTree.Node node15 = aVLTree9.getRoot();
        avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        aVLTree9.delete((int) (byte) 10);
        int int19 = aVLTree9.height();
        avltree.AVLTree.Node node21 = aVLTree9.find((int) (short) 10);
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        avltree.AVLTree.Node node25 = aVLTree22.getRoot();
        aVLTree22.delete(100);
        aVLTree22.insert((int) (byte) 10);
        avltree.AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree9.getBalance(node30);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        avltree.AVLTree.Node node40 = aVLTree32.find(0);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        avltree.AVLTree aVLTree56 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree9.getBalance(node77);
        int int83 = aVLTree0.getBalance(node77);
        java.lang.Class<?> wildcardClass84 = node77.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        java.lang.Class<?> wildcardClass43 = node38.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree.Node node14 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        avltree.AVLTree.Node node16 = aVLTree10.find(100);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree13.getBalance(node32);
        int int34 = aVLTree0.getBalance(node32);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete((int) ' ');
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        int int51 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree.Node node54 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass55 = node54.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete((int) (short) 10);
        avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        avltree.AVLTree.Node node15 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        avltree.AVLTree.Node node18 = aVLTree6.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        java.lang.Class<?> wildcardClass20 = node18.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete(10);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree0.getBalance(node14);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node8 = aVLTree0.find((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node46 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass47 = node46.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) '#');
        int int12 = aVLTree0.height();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.insert((int) (short) 0);
        avltree.AVLTree.Node node12 = aVLTree6.find(100);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree13.getBalance(node32);
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        avltree.AVLTree.Node node39 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree34.getBalance(node42);
        int int44 = aVLTree34.height();
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        avltree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        int int55 = aVLTree13.getBalance(node53);
        int int56 = aVLTree6.getBalance(node53);
        int int57 = aVLTree0.getBalance(node53);
        int int58 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) '4');
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        avltree.AVLTree.Node node12 = aVLTree7.find((int) (short) -1);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        aVLTree13.delete(100);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree13.getBalance(node34);
        int int36 = aVLTree7.getBalance(node34);
        avltree.AVLTree.Node node37 = aVLTree7.getRoot();
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node40 = aVLTree38.find((-1));
        int int41 = aVLTree38.height();
        avltree.AVLTree.Node node42 = aVLTree38.getRoot();
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.delete(100);
        avltree.AVLTree aVLTree47 = new avltree.AVLTree();
        avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        avltree.AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        avltree.AVLTree aVLTree59 = new avltree.AVLTree();
        avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        avltree.AVLTree.Node node68 = aVLTree59.find((int) ' ');
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        avltree.AVLTree aVLTree76 = new avltree.AVLTree();
        avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree38.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        java.lang.Class<?> wildcardClass91 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete(0);
        aVLTree0.delete(10);
        aVLTree0.insert(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree5 = new avltree.AVLTree();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        int int24 = aVLTree14.height();
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        avltree.AVLTree.Node node28 = aVLTree25.getRoot();
        aVLTree25.delete(100);
        aVLTree25.insert((int) (byte) 10);
        avltree.AVLTree.Node node33 = aVLTree25.getRoot();
        int int34 = aVLTree14.getBalance(node33);
        int int35 = aVLTree5.getBalance(node33);
        avltree.AVLTree.Node node36 = aVLTree5.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        java.lang.Class<?> wildcardClass38 = node36.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (short) 1);
        aVLTree0.insert(0);
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree aVLTree3 = new avltree.AVLTree();
        avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.insert((int) (byte) 100);
        aVLTree24.insert((int) 'a');
        avltree.AVLTree.Node node32 = aVLTree24.find((int) (byte) 100);
        avltree.AVLTree aVLTree33 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        int int43 = aVLTree33.height();
        avltree.AVLTree aVLTree44 = new avltree.AVLTree();
        avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        avltree.AVLTree.Node node47 = aVLTree44.getRoot();
        aVLTree44.delete(100);
        aVLTree44.insert((int) (byte) 10);
        avltree.AVLTree.Node node52 = aVLTree44.getRoot();
        int int53 = aVLTree33.getBalance(node52);
        int int54 = aVLTree24.getBalance(node52);
        avltree.AVLTree.Node node55 = aVLTree24.getRoot();
        int int56 = aVLTree0.getBalance(node55);
        aVLTree0.delete((int) 'a');
        int int59 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree10.getBalance(node13);
        aVLTree10.insert(0);
        aVLTree10.insert((int) (short) 10);
        int int19 = aVLTree10.height();
        aVLTree10.delete((-1));
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) (byte) -1);
        int int27 = aVLTree22.height();
        int int28 = aVLTree22.height();
        avltree.AVLTree.Node node30 = aVLTree22.find((int) '#');
        avltree.AVLTree aVLTree31 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        aVLTree31.delete((int) (short) 10);
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.insert((int) 'a');
        avltree.AVLTree.Node node46 = aVLTree38.find((int) (byte) 100);
        int int47 = aVLTree31.getBalance(node46);
        int int48 = aVLTree22.getBalance(node46);
        int int49 = aVLTree10.getBalance(node46);
        int int50 = aVLTree0.getBalance(node46);
        java.lang.Class<?> wildcardClass51 = node46.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        aVLTree0.delete((-1));
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete((int) ' ');
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree2 = new avltree.AVLTree();
        avltree.AVLTree.Node node4 = aVLTree2.find((int) '4');
        avltree.AVLTree.Node node5 = aVLTree2.getRoot();
        avltree.AVLTree.Node node7 = aVLTree2.find((int) (short) -1);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree8.getRoot();
        aVLTree8.delete(0);
        avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree8.getBalance(node16);
        int int18 = aVLTree8.height();
        aVLTree8.delete(100);
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree8.getBalance(node29);
        int int31 = aVLTree2.getBalance(node29);
        int int32 = aVLTree0.getBalance(node29);
        avltree.AVLTree.Node node34 = aVLTree0.find(10);
        int int35 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        avltree.AVLTree.Node node20 = aVLTree11.find((int) ' ');
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        avltree.AVLTree.Node node25 = aVLTree21.find((int) 'a');
        aVLTree21.delete((int) (short) 10);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((int) 'a');
        avltree.AVLTree.Node node36 = aVLTree28.find((int) (byte) 100);
        int int37 = aVLTree21.getBalance(node36);
        int int38 = aVLTree11.getBalance(node36);
        int int39 = aVLTree0.getBalance(node36);
        avltree.AVLTree.Node node40 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(10);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass44 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.find(1);
        avltree.AVLTree.Node node9 = aVLTree0.find(10);
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) (byte) -1);
        int int15 = aVLTree10.height();
        int int16 = aVLTree10.height();
        avltree.AVLTree.Node node18 = aVLTree10.find((int) '#');
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree10.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        avltree.AVLTree.Node node38 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        int int15 = aVLTree0.height();
        avltree.AVLTree aVLTree16 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree25.getBalance(node28);
        aVLTree25.insert((int) (short) 100);
        avltree.AVLTree.Node node33 = aVLTree25.find((int) ' ');
        int int34 = aVLTree25.height();
        avltree.AVLTree.Node node35 = aVLTree25.getRoot();
        int int36 = aVLTree19.getBalance(node35);
        int int37 = aVLTree16.getBalance(node35);
        avltree.AVLTree.Node node39 = aVLTree16.find((int) 'a');
        avltree.AVLTree aVLTree40 = new avltree.AVLTree();
        avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        int int46 = aVLTree40.height();
        avltree.AVLTree.Node node48 = aVLTree40.find((int) (short) -1);
        avltree.AVLTree.Node node49 = aVLTree40.getRoot();
        avltree.AVLTree aVLTree50 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        aVLTree50.insert((int) (byte) 100);
        aVLTree50.insert((int) 'a');
        avltree.AVLTree.Node node58 = aVLTree50.find((int) (byte) 100);
        avltree.AVLTree aVLTree59 = new avltree.AVLTree();
        avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        aVLTree59.delete(0);
        avltree.AVLTree.Node node67 = null;
        int int68 = aVLTree59.getBalance(node67);
        int int69 = aVLTree59.height();
        avltree.AVLTree aVLTree70 = new avltree.AVLTree();
        avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        avltree.AVLTree.Node node73 = aVLTree70.getRoot();
        aVLTree70.delete(100);
        aVLTree70.insert((int) (byte) 10);
        avltree.AVLTree.Node node78 = aVLTree70.getRoot();
        int int79 = aVLTree59.getBalance(node78);
        int int80 = aVLTree50.getBalance(node78);
        int int81 = aVLTree40.getBalance(node78);
        int int82 = aVLTree16.getBalance(node78);
        int int83 = aVLTree0.getBalance(node78);
        java.lang.Class<?> wildcardClass84 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree.Node node14 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        int int29 = aVLTree0.height();
        avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        avltree.AVLTree.Node node16 = aVLTree10.find(100);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        avltree.AVLTree.Node node31 = aVLTree28.getRoot();
        aVLTree28.delete(100);
        aVLTree28.insert((int) (byte) 10);
        avltree.AVLTree.Node node36 = aVLTree28.getRoot();
        int int37 = aVLTree17.getBalance(node36);
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        aVLTree38.delete((int) 'a');
        avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        aVLTree38.delete(0);
        avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree38.getBalance(node46);
        int int48 = aVLTree38.height();
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.delete(100);
        aVLTree49.insert((int) (byte) 10);
        avltree.AVLTree.Node node57 = aVLTree49.getRoot();
        int int58 = aVLTree38.getBalance(node57);
        int int59 = aVLTree17.getBalance(node57);
        int int60 = aVLTree10.getBalance(node57);
        avltree.AVLTree.Node node61 = aVLTree10.getRoot();
        int int62 = aVLTree0.getBalance(node61);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.find(10);
        avltree.AVLTree.Node node13 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        aVLTree0.insert((int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (short) 100);
        avltree.AVLTree.Node node26 = aVLTree18.find((int) ' ');
        int int27 = aVLTree18.height();
        avltree.AVLTree.Node node28 = aVLTree18.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        int int15 = aVLTree0.height();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        avltree.AVLTree.Node node18 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.insert(0);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        aVLTree26.delete((int) 'a');
        avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete(0);
        avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree26.getBalance(node34);
        int int36 = aVLTree26.height();
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        avltree.AVLTree.Node node45 = aVLTree37.getRoot();
        int int46 = aVLTree26.getBalance(node45);
        int int47 = aVLTree17.getBalance(node45);
        avltree.AVLTree.Node node48 = aVLTree17.getRoot();
        avltree.AVLTree.Node node49 = aVLTree17.getRoot();
        int int50 = aVLTree0.getBalance(node49);
        avltree.AVLTree.Node node52 = aVLTree0.find((int) 'a');
        int int53 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        avltree.AVLTree.Node node40 = aVLTree32.find(0);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        avltree.AVLTree aVLTree56 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        avltree.AVLTree.Node node84 = aVLTree0.find((int) (short) 10);
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree22.getRoot();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        avltree.AVLTree.Node node29 = aVLTree24.find((int) (short) -1);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        aVLTree30.delete(100);
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree30.getBalance(node51);
        int int53 = aVLTree24.getBalance(node51);
        int int54 = aVLTree22.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        java.lang.Class<?> wildcardClass56 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        int int11 = aVLTree0.height();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node11 = aVLTree7.find((int) 'a');
        int int12 = aVLTree7.height();
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.insert((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree13.getBalance(node38);
        int int41 = aVLTree7.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree5 = new avltree.AVLTree();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        int int24 = aVLTree14.height();
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        avltree.AVLTree.Node node28 = aVLTree25.getRoot();
        aVLTree25.delete(100);
        aVLTree25.insert((int) (byte) 10);
        avltree.AVLTree.Node node33 = aVLTree25.getRoot();
        int int34 = aVLTree14.getBalance(node33);
        int int35 = aVLTree5.getBalance(node33);
        avltree.AVLTree.Node node36 = aVLTree5.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        int int14 = aVLTree8.height();
        avltree.AVLTree.Node node16 = aVLTree8.find((int) (short) -1);
        avltree.AVLTree.Node node17 = aVLTree8.getRoot();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert(0);
        aVLTree18.insert((int) (short) 10);
        int int27 = aVLTree18.height();
        aVLTree18.delete((-1));
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) (byte) -1);
        int int35 = aVLTree30.height();
        int int36 = aVLTree30.height();
        avltree.AVLTree.Node node38 = aVLTree30.find((int) '#');
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        aVLTree39.delete((int) (short) 10);
        avltree.AVLTree aVLTree46 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree39.getBalance(node54);
        int int56 = aVLTree30.getBalance(node54);
        int int57 = aVLTree18.getBalance(node54);
        int int58 = aVLTree8.getBalance(node54);
        int int59 = aVLTree0.getBalance(node54);
        java.lang.Class<?> wildcardClass60 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        avltree.AVLTree.Node node40 = aVLTree32.find(0);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        avltree.AVLTree aVLTree56 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        aVLTree0.delete(1);
        avltree.AVLTree.Node node86 = aVLTree0.find(0);
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
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(node86);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert(0);
        avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        java.lang.Class<?> wildcardClass18 = node16.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert(0);
        avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        avltree.AVLTree.Node node16 = aVLTree10.find(100);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node14 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        avltree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree38.find((int) 'a');
        avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        avltree.AVLTree.Node node44 = aVLTree38.getRoot();
        avltree.AVLTree.Node node45 = aVLTree38.getRoot();
        avltree.AVLTree aVLTree46 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.insert((int) (byte) 100);
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree55.getBalance(node58);
        aVLTree55.insert((int) (short) 100);
        avltree.AVLTree.Node node63 = aVLTree55.find((int) ' ');
        int int64 = aVLTree55.height();
        avltree.AVLTree.Node node65 = aVLTree55.getRoot();
        int int66 = aVLTree49.getBalance(node65);
        int int67 = aVLTree46.getBalance(node65);
        int int68 = aVLTree38.getBalance(node65);
        int int69 = aVLTree0.getBalance(node65);
        avltree.AVLTree.Node node70 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        avltree.AVLTree.Node node74 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        avltree.AVLTree.Node node24 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node26 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree aVLTree5 = new avltree.AVLTree();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) (short) 100);
        avltree.AVLTree.Node node20 = aVLTree12.find((int) ' ');
        int int21 = aVLTree12.height();
        avltree.AVLTree.Node node22 = aVLTree12.getRoot();
        int int23 = aVLTree5.getBalance(node22);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        aVLTree24.delete(100);
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        avltree.AVLTree.Node node45 = aVLTree37.getRoot();
        int int46 = aVLTree24.getBalance(node45);
        int int47 = aVLTree5.getBalance(node45);
        avltree.AVLTree.Node node48 = aVLTree5.getRoot();
        int int49 = aVLTree0.getBalance(node48);
        avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        int int9 = aVLTree0.height();
        avltree.AVLTree.Node node11 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        int int18 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        int int21 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        aVLTree9.delete((int) (short) 10);
        avltree.AVLTree aVLTree16 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.insert((int) (byte) 100);
        aVLTree16.insert((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree16.find((int) (byte) 100);
        int int25 = aVLTree9.getBalance(node24);
        int int26 = aVLTree0.getBalance(node24);
        aVLTree0.insert((int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((-1));
        int int11 = aVLTree8.height();
        avltree.AVLTree.Node node12 = aVLTree8.getRoot();
        aVLTree8.insert((int) (byte) 100);
        aVLTree8.delete(100);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree17.getBalance(node27);
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree29.getBalance(node35);
        avltree.AVLTree.Node node38 = aVLTree29.find((int) ' ');
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        aVLTree39.delete((int) (short) 10);
        avltree.AVLTree aVLTree46 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree39.getBalance(node54);
        int int56 = aVLTree29.getBalance(node54);
        int int57 = aVLTree17.getBalance(node54);
        int int58 = aVLTree8.getBalance(node54);
        int int59 = aVLTree0.getBalance(node54);
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass7 = node6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete((int) (short) 10);
        avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        avltree.AVLTree.Node node15 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        avltree.AVLTree.Node node18 = aVLTree6.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree5 = new avltree.AVLTree();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        int int24 = aVLTree14.height();
        avltree.AVLTree aVLTree25 = new avltree.AVLTree();
        avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        avltree.AVLTree.Node node28 = aVLTree25.getRoot();
        aVLTree25.delete(100);
        aVLTree25.insert((int) (byte) 10);
        avltree.AVLTree.Node node33 = aVLTree25.getRoot();
        int int34 = aVLTree14.getBalance(node33);
        int int35 = aVLTree5.getBalance(node33);
        avltree.AVLTree.Node node36 = aVLTree5.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        avltree.AVLTree.Node node38 = aVLTree0.getRoot();
        avltree.AVLTree.Node node40 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete(0);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        int int30 = aVLTree0.height();
        aVLTree0.insert(100);
        avltree.AVLTree.Node node34 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node36 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.delete((int) (short) -1);
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.insert((int) (short) 0);
        avltree.AVLTree.Node node27 = aVLTree21.find(100);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        avltree.AVLTree aVLTree60 = new avltree.AVLTree();
        avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree28.getBalance(node68);
        int int71 = aVLTree21.getBalance(node68);
        int int72 = aVLTree13.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.insert((int) (byte) 100);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        aVLTree13.delete((int) (short) 10);
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        avltree.AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        int int29 = aVLTree13.getBalance(node28);
        int int30 = aVLTree7.getBalance(node28);
        avltree.AVLTree.Node node31 = aVLTree7.getRoot();
        int int32 = aVLTree0.getBalance(node31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        avltree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        aVLTree0.delete((int) (short) 1);
        java.lang.Class<?> wildcardClass26 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree aVLTree3 = new avltree.AVLTree();
        avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert(100);
        avltree.AVLTree.Node node26 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        aVLTree0.delete((int) (byte) 100);
        avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        avltree.AVLTree.Node node46 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree47 = new avltree.AVLTree();
        avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        int int53 = aVLTree47.height();
        avltree.AVLTree.Node node55 = aVLTree47.find((int) (short) -1);
        avltree.AVLTree aVLTree56 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        avltree.AVLTree.Node node59 = null;
        int int60 = aVLTree56.getBalance(node59);
        aVLTree56.insert(0);
        avltree.AVLTree.Node node63 = aVLTree56.getRoot();
        int int64 = aVLTree47.getBalance(node63);
        int int65 = aVLTree0.getBalance(node63);
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
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (byte) 100);
        avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        avltree.AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
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
        int int29 = aVLTree0.getBalance(node27);
        avltree.AVLTree.Node node31 = aVLTree0.find((int) (byte) 100);
        int int32 = aVLTree0.height();
        java.lang.Class<?> wildcardClass33 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        int int16 = aVLTree0.height();
        int int17 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = node18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) ' ');
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        int int21 = aVLTree12.height();
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.insert((int) (short) 0);
        avltree.AVLTree.Node node28 = aVLTree22.find(100);
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        aVLTree29.insert((int) (byte) 10);
        avltree.AVLTree.Node node37 = aVLTree29.getRoot();
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        java.lang.Class<?> wildcardClass41 = node37.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        int int13 = aVLTree0.height();
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node18 = aVLTree14.find((int) 'a');
        avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        avltree.AVLTree.Node node20 = aVLTree14.getRoot();
        avltree.AVLTree.Node node21 = aVLTree14.getRoot();
        aVLTree14.delete((int) (byte) 10);
        int int24 = aVLTree14.height();
        avltree.AVLTree.Node node26 = aVLTree14.find((int) (short) 10);
        avltree.AVLTree aVLTree27 = new avltree.AVLTree();
        avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        avltree.AVLTree.Node node30 = aVLTree27.getRoot();
        aVLTree27.delete(100);
        aVLTree27.insert((int) (byte) 10);
        avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree14.getBalance(node35);
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        avltree.AVLTree aVLTree46 = new avltree.AVLTree();
        avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        aVLTree46.delete((int) 'a');
        avltree.AVLTree.Node node51 = aVLTree46.getRoot();
        aVLTree46.delete(0);
        avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree46.getBalance(node54);
        int int56 = aVLTree46.height();
        avltree.AVLTree aVLTree57 = new avltree.AVLTree();
        avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        avltree.AVLTree.Node node60 = aVLTree57.getRoot();
        aVLTree57.delete(100);
        aVLTree57.insert((int) (byte) 10);
        avltree.AVLTree.Node node65 = aVLTree57.getRoot();
        int int66 = aVLTree46.getBalance(node65);
        int int67 = aVLTree37.getBalance(node65);
        avltree.AVLTree.Node node68 = aVLTree37.getRoot();
        int int69 = aVLTree14.getBalance(node68);
        int int70 = aVLTree0.getBalance(node68);
        int int71 = aVLTree0.height();
        int int72 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.delete((int) (short) -1);
        avltree.AVLTree aVLTree16 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.insert((int) (short) 0);
        avltree.AVLTree.Node node22 = aVLTree16.find(100);
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        avltree.AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        avltree.AVLTree aVLTree44 = new avltree.AVLTree();
        avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        aVLTree44.delete((int) 'a');
        avltree.AVLTree.Node node49 = aVLTree44.getRoot();
        aVLTree44.delete(0);
        avltree.AVLTree.Node node52 = null;
        int int53 = aVLTree44.getBalance(node52);
        int int54 = aVLTree44.height();
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        avltree.AVLTree.Node node58 = aVLTree55.getRoot();
        aVLTree55.delete(100);
        aVLTree55.insert((int) (byte) 10);
        avltree.AVLTree.Node node63 = aVLTree55.getRoot();
        int int64 = aVLTree44.getBalance(node63);
        int int65 = aVLTree23.getBalance(node63);
        int int66 = aVLTree16.getBalance(node63);
        int int67 = aVLTree8.getBalance(node63);
        int int68 = aVLTree0.getBalance(node63);
        avltree.AVLTree.Node node69 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node69);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert((int) ' ');
        avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree aVLTree3 = new avltree.AVLTree();
        avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        int int30 = aVLTree24.height();
        avltree.AVLTree.Node node32 = aVLTree24.find((int) (short) -1);
        avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        avltree.AVLTree aVLTree54 = new avltree.AVLTree();
        avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        avltree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        avltree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree34.getBalance(node62);
        int int65 = aVLTree24.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) (byte) 1);
        int int69 = aVLTree0.height();
        avltree.AVLTree.Node node70 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node76 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node76);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 0);
        avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree4 = new avltree.AVLTree();
        avltree.AVLTree.Node node6 = aVLTree4.find((int) '4');
        avltree.AVLTree.Node node8 = aVLTree4.find((int) 'a');
        aVLTree4.insert((int) (short) -1);
        int int11 = aVLTree4.height();
        avltree.AVLTree.Node node12 = aVLTree4.getRoot();
        int int13 = aVLTree0.getBalance(node12);
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        avltree.AVLTree.Node node16 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        avltree.AVLTree.Node node13 = aVLTree7.find(100);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = aVLTree22.getRoot();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        avltree.AVLTree.Node node29 = aVLTree24.find((int) (short) -1);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        aVLTree30.delete(100);
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree30.getBalance(node51);
        int int53 = aVLTree24.getBalance(node51);
        int int54 = aVLTree22.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        aVLTree0.delete((-1));
        int int58 = aVLTree0.height();
        int int59 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree32.getBalance(node35);
        aVLTree32.insert((int) (short) 100);
        avltree.AVLTree.Node node40 = aVLTree32.find((int) ' ');
        int int41 = aVLTree32.height();
        avltree.AVLTree.Node node42 = aVLTree32.getRoot();
        avltree.AVLTree aVLTree43 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 100);
        int int54 = aVLTree43.height();
        aVLTree43.delete((int) (byte) 0);
        avltree.AVLTree.Node node58 = aVLTree43.find(0);
        int int59 = aVLTree43.height();
        avltree.AVLTree.Node node61 = aVLTree43.find((int) (short) 10);
        int int62 = aVLTree32.getBalance(node61);
        int int63 = aVLTree0.getBalance(node61);
        avltree.AVLTree.Node node65 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(node65);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        avltree.AVLTree.Node node46 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) ' ');
        avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node15 = aVLTree11.find((int) 'a');
        aVLTree11.delete((int) (short) 10);
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        avltree.AVLTree.Node node26 = aVLTree18.find((int) (byte) 100);
        int int27 = aVLTree11.getBalance(node26);
        avltree.AVLTree.Node node28 = aVLTree11.getRoot();
        avltree.AVLTree.Node node29 = aVLTree11.getRoot();
        aVLTree11.insert((int) (short) 100);
        avltree.AVLTree.Node node32 = aVLTree11.getRoot();
        int int33 = aVLTree0.getBalance(node32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find(0);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        avltree.AVLTree.Node node51 = aVLTree0.find(0);
        avltree.AVLTree.Node node53 = aVLTree0.find(1);
        int int54 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        avltree.AVLTree.Node node13 = aVLTree7.find(100);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        java.lang.Class<?> wildcardClass25 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        int int15 = aVLTree0.height();
        avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node18 = aVLTree0.find((int) (short) 1);
        avltree.AVLTree.Node node19 = aVLTree0.getRoot();
        int int20 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        aVLTree0.insert((int) (short) 1);
        int int20 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        aVLTree8.delete(1);
        aVLTree8.delete((int) '#');
        aVLTree8.delete((int) (short) -1);
        avltree.AVLTree.Node node19 = aVLTree8.getRoot();
        aVLTree8.insert(10);
        aVLTree8.delete(1);
        avltree.AVLTree.Node node24 = aVLTree8.getRoot();
        int int25 = aVLTree8.height();
        aVLTree8.delete((int) 'a');
        avltree.AVLTree.Node node28 = aVLTree8.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        java.lang.Class<?> wildcardClass30 = node28.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.insert(10);
        aVLTree0.delete((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (byte) 100);
        avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete((-1));
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        avltree.AVLTree.Node node18 = aVLTree0.find((int) (byte) 10);
        avltree.AVLTree.Node node20 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        avltree.AVLTree aVLTree16 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        avltree.AVLTree.Node node19 = aVLTree16.getRoot();
        avltree.AVLTree.Node node21 = aVLTree16.find((int) (short) -1);
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.delete((int) 'a');
        avltree.AVLTree.Node node27 = aVLTree22.getRoot();
        aVLTree22.delete(0);
        avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree22.getBalance(node30);
        int int32 = aVLTree22.height();
        aVLTree22.delete(100);
        avltree.AVLTree aVLTree35 = new avltree.AVLTree();
        avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree22.getBalance(node43);
        int int45 = aVLTree16.getBalance(node43);
        avltree.AVLTree.Node node46 = aVLTree16.getRoot();
        avltree.AVLTree aVLTree47 = new avltree.AVLTree();
        avltree.AVLTree.Node node49 = aVLTree47.find((-1));
        int int50 = aVLTree47.height();
        avltree.AVLTree.Node node51 = aVLTree47.getRoot();
        aVLTree47.insert((int) (byte) 100);
        aVLTree47.delete(100);
        avltree.AVLTree aVLTree56 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        aVLTree56.delete((int) 'a');
        avltree.AVLTree.Node node61 = aVLTree56.getRoot();
        aVLTree56.delete(0);
        avltree.AVLTree.Node node64 = null;
        int int65 = aVLTree56.getBalance(node64);
        avltree.AVLTree.Node node66 = null;
        int int67 = aVLTree56.getBalance(node66);
        avltree.AVLTree aVLTree68 = new avltree.AVLTree();
        avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        aVLTree68.delete((int) 'a');
        avltree.AVLTree.Node node73 = aVLTree68.getRoot();
        avltree.AVLTree.Node node74 = null;
        int int75 = aVLTree68.getBalance(node74);
        avltree.AVLTree.Node node77 = aVLTree68.find((int) ' ');
        avltree.AVLTree aVLTree78 = new avltree.AVLTree();
        avltree.AVLTree.Node node80 = aVLTree78.find((int) '4');
        avltree.AVLTree.Node node82 = aVLTree78.find((int) 'a');
        aVLTree78.delete((int) (short) 10);
        avltree.AVLTree aVLTree85 = new avltree.AVLTree();
        avltree.AVLTree.Node node86 = null;
        int int87 = aVLTree85.getBalance(node86);
        aVLTree85.insert((int) (byte) 100);
        aVLTree85.insert((int) 'a');
        avltree.AVLTree.Node node93 = aVLTree85.find((int) (byte) 100);
        int int94 = aVLTree78.getBalance(node93);
        int int95 = aVLTree68.getBalance(node93);
        int int96 = aVLTree56.getBalance(node93);
        int int97 = aVLTree47.getBalance(node93);
        int int98 = aVLTree16.getBalance(node93);
        int int99 = aVLTree0.getBalance(node93);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert(0);
        avltree.AVLTree.Node node16 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        avltree.AVLTree.Node node13 = aVLTree7.find(100);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        int int25 = aVLTree0.height();
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass28 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        avltree.AVLTree.Node node21 = aVLTree12.getRoot();
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.insert((int) (byte) 100);
        aVLTree22.insert((int) 'a');
        avltree.AVLTree.Node node30 = aVLTree22.find((int) (byte) 100);
        int int31 = aVLTree12.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree aVLTree35 = new avltree.AVLTree();
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.insert((int) (byte) 100);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        avltree.AVLTree.Node node46 = aVLTree41.getRoot();
        aVLTree41.delete(0);
        avltree.AVLTree.Node node49 = null;
        int int50 = aVLTree41.getBalance(node49);
        int int51 = aVLTree41.height();
        avltree.AVLTree aVLTree52 = new avltree.AVLTree();
        avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        avltree.AVLTree.Node node55 = aVLTree52.getRoot();
        aVLTree52.delete(100);
        aVLTree52.insert((int) (byte) 10);
        avltree.AVLTree.Node node60 = aVLTree52.getRoot();
        int int61 = aVLTree41.getBalance(node60);
        int int62 = aVLTree35.getBalance(node60);
        aVLTree35.insert((int) (byte) 0);
        avltree.AVLTree.Node node66 = aVLTree35.find(100);
        int int67 = aVLTree0.getBalance(node66);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        int int24 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        avltree.AVLTree.Node node14 = aVLTree8.find(100);
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        avltree.AVLTree aVLTree47 = new avltree.AVLTree();
        avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        avltree.AVLTree.Node node45 = aVLTree0.find(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        int int27 = aVLTree21.height();
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        avltree.AVLTree aVLTree60 = new avltree.AVLTree();
        avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree28.getBalance(node68);
        int int71 = aVLTree21.getBalance(node68);
        int int72 = aVLTree0.getBalance(node68);
        avltree.AVLTree.Node node73 = aVLTree0.getRoot();
        avltree.AVLTree.Node node74 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node11 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        java.lang.Class<?> wildcardClass46 = node42.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert(0);
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        avltree.AVLTree.Node node28 = aVLTree11.find((int) (short) 100);
        aVLTree11.delete((int) (short) -1);
        avltree.AVLTree.Node node32 = aVLTree11.find(0);
        int int33 = aVLTree0.getBalance(node32);
        aVLTree0.insert(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = node47.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree13.getBalance(node19);
        avltree.AVLTree.Node node22 = aVLTree13.find((int) ' ');
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        aVLTree23.delete((int) (short) 10);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree30.find((int) (byte) 100);
        int int39 = aVLTree23.getBalance(node38);
        int int40 = aVLTree13.getBalance(node38);
        avltree.AVLTree.Node node42 = aVLTree13.find((int) (short) 0);
        aVLTree13.delete((int) (short) 0);
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        avltree.AVLTree.Node node49 = aVLTree45.find((int) 'a');
        avltree.AVLTree.Node node50 = aVLTree45.getRoot();
        avltree.AVLTree.Node node51 = aVLTree45.getRoot();
        avltree.AVLTree.Node node52 = aVLTree45.getRoot();
        avltree.AVLTree aVLTree53 = new avltree.AVLTree();
        avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        avltree.AVLTree aVLTree56 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree62.getBalance(node65);
        aVLTree62.insert((int) (short) 100);
        avltree.AVLTree.Node node70 = aVLTree62.find((int) ' ');
        int int71 = aVLTree62.height();
        avltree.AVLTree.Node node72 = aVLTree62.getRoot();
        int int73 = aVLTree56.getBalance(node72);
        int int74 = aVLTree53.getBalance(node72);
        int int75 = aVLTree45.getBalance(node72);
        int int76 = aVLTree13.getBalance(node72);
        int int77 = aVLTree0.getBalance(node72);
        java.lang.Class<?> wildcardClass78 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        avltree.AVLTree.Node node15 = aVLTree9.getRoot();
        avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        aVLTree9.delete((int) (byte) 10);
        int int19 = aVLTree9.height();
        avltree.AVLTree.Node node21 = aVLTree9.find((int) (short) 10);
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        avltree.AVLTree.Node node25 = aVLTree22.getRoot();
        aVLTree22.delete(100);
        aVLTree22.insert((int) (byte) 10);
        avltree.AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree9.getBalance(node30);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        avltree.AVLTree.Node node40 = aVLTree32.find(0);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        avltree.AVLTree aVLTree56 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        avltree.AVLTree aVLTree62 = new avltree.AVLTree();
        avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree9.getBalance(node77);
        int int83 = aVLTree0.getBalance(node77);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 10);
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete(10);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 100);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        int int18 = aVLTree13.height();
        aVLTree13.delete(1);
        aVLTree13.insert((int) 'a');
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        avltree.AVLTree.Node node26 = aVLTree23.getRoot();
        aVLTree23.delete(100);
        int int29 = aVLTree23.height();
        avltree.AVLTree.Node node31 = aVLTree23.find((int) (short) -1);
        avltree.AVLTree.Node node32 = aVLTree23.getRoot();
        avltree.AVLTree aVLTree33 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.insert((int) (byte) 100);
        aVLTree33.insert((int) 'a');
        avltree.AVLTree.Node node41 = aVLTree33.find((int) (byte) 100);
        avltree.AVLTree aVLTree42 = new avltree.AVLTree();
        avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        aVLTree42.delete((int) 'a');
        avltree.AVLTree.Node node47 = aVLTree42.getRoot();
        aVLTree42.delete(0);
        avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree42.getBalance(node50);
        int int52 = aVLTree42.height();
        avltree.AVLTree aVLTree53 = new avltree.AVLTree();
        avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        avltree.AVLTree.Node node56 = aVLTree53.getRoot();
        aVLTree53.delete(100);
        aVLTree53.insert((int) (byte) 10);
        avltree.AVLTree.Node node61 = aVLTree53.getRoot();
        int int62 = aVLTree42.getBalance(node61);
        int int63 = aVLTree33.getBalance(node61);
        int int64 = aVLTree23.getBalance(node61);
        int int65 = aVLTree13.getBalance(node61);
        int int66 = aVLTree0.getBalance(node61);
        avltree.AVLTree aVLTree67 = new avltree.AVLTree();
        avltree.AVLTree.Node node69 = aVLTree67.find((int) '4');
        avltree.AVLTree.Node node70 = aVLTree67.getRoot();
        aVLTree67.delete(100);
        aVLTree67.insert((int) (byte) 10);
        avltree.AVLTree.Node node75 = aVLTree67.getRoot();
        avltree.AVLTree.Node node77 = aVLTree67.find((int) (byte) 0);
        aVLTree67.delete((int) (byte) 10);
        avltree.AVLTree aVLTree80 = new avltree.AVLTree();
        avltree.AVLTree.Node node82 = aVLTree80.find((int) '4');
        avltree.AVLTree.Node node83 = aVLTree80.getRoot();
        aVLTree80.insert((int) (byte) 100);
        int int86 = aVLTree80.height();
        aVLTree80.insert(1);
        aVLTree80.insert((int) (short) 10);
        avltree.AVLTree.Node node92 = aVLTree80.find((int) (short) 1);
        int int93 = aVLTree67.getBalance(node92);
        int int94 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        avltree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        avltree.AVLTree.Node node19 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree14.getBalance(node24);
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        avltree.AVLTree.Node node30 = aVLTree26.find((int) 'a');
        avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete((int) (short) 10);
        avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        avltree.AVLTree.Node node35 = aVLTree26.getRoot();
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.insert((int) (byte) 100);
        aVLTree36.insert((int) 'a');
        avltree.AVLTree.Node node44 = aVLTree36.find((int) (byte) 100);
        int int45 = aVLTree26.getBalance(node44);
        int int46 = aVLTree14.getBalance(node44);
        int int47 = aVLTree0.getBalance(node44);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) ' ');
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass46 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(0);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree12.getBalance(node18);
        avltree.AVLTree.Node node21 = aVLTree12.find((int) ' ');
        aVLTree12.insert((-1));
        avltree.AVLTree.Node node24 = aVLTree12.getRoot();
        aVLTree12.delete((int) (byte) -1);
        aVLTree12.insert(0);
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        avltree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        aVLTree38.delete((int) 'a');
        avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        aVLTree38.delete(0);
        avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree38.getBalance(node46);
        int int48 = aVLTree38.height();
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.delete(100);
        aVLTree49.insert((int) (byte) 10);
        avltree.AVLTree.Node node57 = aVLTree49.getRoot();
        int int58 = aVLTree38.getBalance(node57);
        int int59 = aVLTree29.getBalance(node57);
        avltree.AVLTree.Node node60 = aVLTree29.getRoot();
        avltree.AVLTree.Node node61 = aVLTree29.getRoot();
        int int62 = aVLTree12.getBalance(node61);
        avltree.AVLTree.Node node63 = aVLTree12.getRoot();
        int int64 = aVLTree0.getBalance(node63);
        int int65 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.insert((int) (byte) 100);
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        avltree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        aVLTree23.delete((int) (short) 10);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((int) 'a');
        avltree.AVLTree.Node node38 = aVLTree30.find((int) (byte) 100);
        int int39 = aVLTree23.getBalance(node38);
        int int40 = aVLTree17.getBalance(node38);
        avltree.AVLTree.Node node41 = aVLTree17.getRoot();
        avltree.AVLTree aVLTree42 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.insert((int) (byte) 100);
        avltree.AVLTree aVLTree51 = new avltree.AVLTree();
        avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree51.getBalance(node54);
        aVLTree51.insert((int) (short) 100);
        avltree.AVLTree.Node node59 = aVLTree51.find((int) ' ');
        int int60 = aVLTree51.height();
        avltree.AVLTree.Node node61 = aVLTree51.getRoot();
        int int62 = aVLTree45.getBalance(node61);
        int int63 = aVLTree42.getBalance(node61);
        avltree.AVLTree.Node node65 = aVLTree42.find((int) 'a');
        avltree.AVLTree aVLTree66 = new avltree.AVLTree();
        avltree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        aVLTree66.delete((int) 'a');
        aVLTree66.delete(1);
        aVLTree66.delete((int) '#');
        aVLTree66.delete((int) (short) -1);
        avltree.AVLTree.Node node77 = aVLTree66.getRoot();
        aVLTree66.insert(10);
        aVLTree66.delete(1);
        avltree.AVLTree.Node node82 = aVLTree66.getRoot();
        int int83 = aVLTree66.height();
        aVLTree66.delete((int) 'a');
        avltree.AVLTree.Node node86 = aVLTree66.getRoot();
        int int87 = aVLTree42.getBalance(node86);
        int int88 = aVLTree17.getBalance(node86);
        int int89 = aVLTree0.getBalance(node86);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) '#');
        int int48 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree aVLTree6 = new avltree.AVLTree();
        avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        int int30 = aVLTree0.height();
        aVLTree0.insert(100);
        avltree.AVLTree.Node node34 = aVLTree0.find((int) ' ');
        int int35 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        aVLTree0.delete((int) (byte) 100);
        avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        avltree.AVLTree.Node node47 = aVLTree0.find((int) (short) -1);
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
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        int int13 = aVLTree0.height();
        avltree.AVLTree.Node node15 = aVLTree0.find(10);
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        avltree.AVLTree aVLTree18 = new avltree.AVLTree();
        avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        int int51 = aVLTree0.height();
        int int52 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        avltree.AVLTree aVLTree32 = new avltree.AVLTree();
        avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
    }
}

