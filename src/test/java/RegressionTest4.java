import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        avltree.AVLTree.Node node20 = aVLTree11.find((int) ' ');
        aVLTree11.insert((-1));
        avltree.AVLTree.Node node23 = aVLTree11.getRoot();
        aVLTree11.delete((int) (byte) -1);
        aVLTree11.insert(0);
        aVLTree11.delete((int) (byte) -1);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        avltree.AVLTree aVLTree35 = new avltree.AVLTree();
        avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.insert((int) (byte) 100);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree41.getBalance(node44);
        aVLTree41.insert((int) (short) 100);
        avltree.AVLTree.Node node49 = aVLTree41.find((int) ' ');
        int int50 = aVLTree41.height();
        avltree.AVLTree.Node node51 = aVLTree41.getRoot();
        int int52 = aVLTree35.getBalance(node51);
        int int53 = aVLTree30.getBalance(node51);
        int int54 = aVLTree11.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree aVLTree58 = new avltree.AVLTree();
        avltree.AVLTree.Node node60 = aVLTree58.find((int) '4');
        avltree.AVLTree.Node node61 = aVLTree58.getRoot();
        aVLTree58.insert((int) (byte) 100);
        int int64 = aVLTree58.height();
        aVLTree58.insert(1);
        aVLTree58.insert(0);
        avltree.AVLTree.Node node69 = aVLTree58.getRoot();
        avltree.AVLTree.Node node70 = aVLTree58.getRoot();
        int int71 = aVLTree0.getBalance(node70);
        java.lang.Class<?> wildcardClass72 = node70.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        aVLTree0.delete((int) (short) 0);
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
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(2);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete(0);
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        aVLTree0.delete(0);
        avltree.AVLTree.Node node35 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) ' ');
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
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        int int11 = aVLTree0.height();
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        avltree.AVLTree.Node node15 = aVLTree12.getRoot();
        aVLTree12.delete(100);
        aVLTree12.delete((int) (short) -1);
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.insert((int) (short) 0);
        avltree.AVLTree.Node node26 = aVLTree20.find(100);
        avltree.AVLTree aVLTree27 = new avltree.AVLTree();
        avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        aVLTree27.delete(0);
        avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree27.getBalance(node35);
        int int37 = aVLTree27.height();
        avltree.AVLTree aVLTree38 = new avltree.AVLTree();
        avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        avltree.AVLTree.Node node41 = aVLTree38.getRoot();
        aVLTree38.delete(100);
        aVLTree38.insert((int) (byte) 10);
        avltree.AVLTree.Node node46 = aVLTree38.getRoot();
        int int47 = aVLTree27.getBalance(node46);
        avltree.AVLTree aVLTree48 = new avltree.AVLTree();
        avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        avltree.AVLTree.Node node53 = aVLTree48.getRoot();
        aVLTree48.delete(0);
        avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree48.getBalance(node56);
        int int58 = aVLTree48.height();
        avltree.AVLTree aVLTree59 = new avltree.AVLTree();
        avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        avltree.AVLTree.Node node62 = aVLTree59.getRoot();
        aVLTree59.delete(100);
        aVLTree59.insert((int) (byte) 10);
        avltree.AVLTree.Node node67 = aVLTree59.getRoot();
        int int68 = aVLTree48.getBalance(node67);
        int int69 = aVLTree27.getBalance(node67);
        int int70 = aVLTree20.getBalance(node67);
        int int71 = aVLTree12.getBalance(node67);
        aVLTree12.insert(1);
        int int74 = aVLTree12.height();
        avltree.AVLTree.Node node75 = aVLTree12.getRoot();
        int int76 = aVLTree0.getBalance(node75);
        aVLTree0.insert((int) (short) 100);
        aVLTree0.delete((int) ' ');
        avltree.AVLTree aVLTree81 = new avltree.AVLTree();
        avltree.AVLTree.Node node83 = aVLTree81.find((int) '4');
        avltree.AVLTree.Node node84 = aVLTree81.getRoot();
        aVLTree81.insert((int) (byte) 100);
        int int87 = aVLTree81.height();
        aVLTree81.delete((int) (byte) 10);
        aVLTree81.delete((int) (byte) 1);
        aVLTree81.delete((int) ' ');
        avltree.AVLTree.Node node95 = aVLTree81.find((int) (byte) 10);
        avltree.AVLTree.Node node96 = aVLTree81.getRoot();
        int int97 = aVLTree0.getBalance(node96);
        avltree.AVLTree.Node node99 = aVLTree0.find((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(node95);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(node99);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.delete((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree20.getRoot();
        avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree20.getBalance(node26);
        avltree.AVLTree.Node node29 = aVLTree20.find((int) ' ');
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
        int int47 = aVLTree20.getBalance(node45);
        int int48 = aVLTree11.getBalance(node45);
        avltree.AVLTree aVLTree49 = new avltree.AVLTree();
        avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        avltree.AVLTree.Node node53 = aVLTree49.find((int) 'a');
        avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        avltree.AVLTree.Node node55 = aVLTree49.getRoot();
        avltree.AVLTree.Node node56 = aVLTree49.getRoot();
        avltree.AVLTree aVLTree57 = new avltree.AVLTree();
        avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        avltree.AVLTree aVLTree60 = new avltree.AVLTree();
        avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.insert((int) (byte) 100);
        avltree.AVLTree aVLTree66 = new avltree.AVLTree();
        avltree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        avltree.AVLTree.Node node69 = null;
        int int70 = aVLTree66.getBalance(node69);
        aVLTree66.insert((int) (short) 100);
        avltree.AVLTree.Node node74 = aVLTree66.find((int) ' ');
        int int75 = aVLTree66.height();
        avltree.AVLTree.Node node76 = aVLTree66.getRoot();
        int int77 = aVLTree60.getBalance(node76);
        int int78 = aVLTree57.getBalance(node76);
        int int79 = aVLTree49.getBalance(node76);
        int int80 = aVLTree11.getBalance(node76);
        int int81 = aVLTree0.getBalance(node76);
        avltree.AVLTree aVLTree82 = new avltree.AVLTree();
        avltree.AVLTree.Node node84 = aVLTree82.find((int) '4');
        aVLTree82.insert((int) (short) 0);
        avltree.AVLTree.Node node88 = aVLTree82.find(100);
        int int89 = aVLTree82.height();
        avltree.AVLTree.Node node90 = aVLTree82.getRoot();
        int int91 = aVLTree0.getBalance(node90);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(node84);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.insert(2);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) 100);
        avltree.AVLTree.Node node7 = aVLTree0.find(0);
        aVLTree0.delete((-1));
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree10.getBalance(node13);
        aVLTree10.insert(0);
        aVLTree10.insert((int) (short) 10);
        int int19 = aVLTree10.height();
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((-1));
        int int23 = aVLTree20.height();
        avltree.AVLTree.Node node24 = aVLTree20.getRoot();
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert(1);
        avltree.AVLTree.Node node29 = aVLTree20.getRoot();
        int int30 = aVLTree10.getBalance(node29);
        int int31 = aVLTree0.getBalance(node29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        aVLTree0.delete(1);
        aVLTree0.delete((int) (byte) 100);
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
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        avltree.AVLTree.Node node58 = aVLTree0.find((int) (byte) 100);
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
        org.junit.Assert.assertNull(node58);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        int int14 = aVLTree9.height();
        aVLTree9.delete(1);
        aVLTree9.insert((int) 'a');
        avltree.AVLTree aVLTree19 = new avltree.AVLTree();
        avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        int int25 = aVLTree19.height();
        avltree.AVLTree.Node node27 = aVLTree19.find((int) (short) -1);
        avltree.AVLTree.Node node28 = aVLTree19.getRoot();
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
        int int60 = aVLTree19.getBalance(node57);
        int int61 = aVLTree9.getBalance(node57);
        int int62 = aVLTree0.getBalance(node57);
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        avltree.AVLTree aVLTree16 = new avltree.AVLTree();
        avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.delete((int) 'a');
        aVLTree16.delete(1);
        aVLTree16.delete((int) '#');
        aVLTree16.delete((int) (short) -1);
        avltree.AVLTree.Node node27 = aVLTree16.getRoot();
        avltree.AVLTree.Node node29 = aVLTree16.find((int) (byte) 100);
        int int30 = aVLTree16.height();
        avltree.AVLTree aVLTree31 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        avltree.AVLTree.Node node34 = aVLTree31.getRoot();
        aVLTree31.insert((int) (byte) 100);
        avltree.AVLTree aVLTree37 = new avltree.AVLTree();
        avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        avltree.AVLTree.Node node41 = aVLTree37.find((int) 'a');
        aVLTree37.delete((int) (short) 10);
        avltree.AVLTree aVLTree44 = new avltree.AVLTree();
        avltree.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.insert((int) (byte) 100);
        aVLTree44.insert((int) 'a');
        avltree.AVLTree.Node node52 = aVLTree44.find((int) (byte) 100);
        int int53 = aVLTree37.getBalance(node52);
        int int54 = aVLTree31.getBalance(node52);
        int int55 = aVLTree16.getBalance(node52);
        int int56 = aVLTree0.getBalance(node52);
        int int57 = aVLTree0.height();
        avltree.AVLTree aVLTree58 = new avltree.AVLTree();
        avltree.AVLTree.Node node60 = aVLTree58.find((int) '4');
        avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree58.getBalance(node61);
        aVLTree58.insert((int) (short) 100);
        avltree.AVLTree.Node node66 = aVLTree58.find((int) ' ');
        int int67 = aVLTree58.height();
        avltree.AVLTree.Node node68 = aVLTree58.getRoot();
        int int69 = aVLTree0.getBalance(node68);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        avltree.AVLTree.Node node12 = aVLTree0.find((-1));
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        aVLTree13.delete(1);
        aVLTree13.delete((int) '#');
        aVLTree13.delete((int) (short) -1);
        avltree.AVLTree.Node node24 = aVLTree13.getRoot();
        avltree.AVLTree.Node node26 = aVLTree13.find((int) (byte) 100);
        int int27 = aVLTree13.height();
        avltree.AVLTree aVLTree28 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        avltree.AVLTree.Node node31 = aVLTree28.getRoot();
        aVLTree28.insert((int) (byte) 100);
        avltree.AVLTree aVLTree34 = new avltree.AVLTree();
        avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        avltree.AVLTree.Node node38 = aVLTree34.find((int) 'a');
        aVLTree34.delete((int) (short) 10);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.insert((int) (byte) 100);
        aVLTree41.insert((int) 'a');
        avltree.AVLTree.Node node49 = aVLTree41.find((int) (byte) 100);
        int int50 = aVLTree34.getBalance(node49);
        int int51 = aVLTree28.getBalance(node49);
        int int52 = aVLTree13.getBalance(node49);
        avltree.AVLTree aVLTree53 = new avltree.AVLTree();
        avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        aVLTree53.delete((int) 'a');
        avltree.AVLTree.Node node58 = aVLTree53.getRoot();
        aVLTree53.delete(0);
        avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree53.getBalance(node61);
        int int63 = aVLTree53.height();
        avltree.AVLTree aVLTree64 = new avltree.AVLTree();
        avltree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        avltree.AVLTree.Node node67 = aVLTree64.getRoot();
        aVLTree64.delete(100);
        aVLTree64.insert((int) (byte) 10);
        avltree.AVLTree.Node node72 = aVLTree64.getRoot();
        int int73 = aVLTree53.getBalance(node72);
        aVLTree53.insert(0);
        avltree.AVLTree aVLTree76 = new avltree.AVLTree();
        avltree.AVLTree.Node node78 = aVLTree76.find((-1));
        int int79 = aVLTree76.height();
        avltree.AVLTree.Node node81 = aVLTree76.find((int) (byte) 100);
        aVLTree76.insert(0);
        avltree.AVLTree.Node node84 = aVLTree76.getRoot();
        int int85 = aVLTree53.getBalance(node84);
        int int86 = aVLTree13.getBalance(node84);
        int int87 = aVLTree0.getBalance(node84);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        int int13 = aVLTree0.height();
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
        avltree.AVLTree aVLTree35 = new avltree.AVLTree();
        avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.delete((int) 'a');
        avltree.AVLTree.Node node40 = aVLTree35.getRoot();
        aVLTree35.delete(0);
        avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree35.getBalance(node43);
        int int45 = aVLTree35.height();
        avltree.AVLTree aVLTree46 = new avltree.AVLTree();
        avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        avltree.AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        avltree.AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree35.getBalance(node54);
        int int56 = aVLTree14.getBalance(node54);
        avltree.AVLTree.Node node57 = aVLTree14.getRoot();
        avltree.AVLTree.Node node58 = aVLTree14.getRoot();
        avltree.AVLTree.Node node60 = aVLTree14.find((int) (short) 1);
        avltree.AVLTree.Node node61 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        avltree.AVLTree.Node node65 = aVLTree14.find((-1));
        avltree.AVLTree aVLTree66 = new avltree.AVLTree();
        avltree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        avltree.AVLTree.Node node69 = aVLTree66.getRoot();
        aVLTree66.delete(100);
        int int72 = aVLTree66.height();
        avltree.AVLTree.Node node74 = aVLTree66.find((int) (short) -1);
        avltree.AVLTree.Node node75 = aVLTree66.getRoot();
        avltree.AVLTree.Node node77 = aVLTree66.find(1);
        avltree.AVLTree.Node node78 = aVLTree66.getRoot();
        avltree.AVLTree aVLTree79 = new avltree.AVLTree();
        avltree.AVLTree.Node node81 = aVLTree79.find((-1));
        aVLTree79.delete(100);
        avltree.AVLTree aVLTree84 = new avltree.AVLTree();
        avltree.AVLTree.Node node85 = null;
        int int86 = aVLTree84.getBalance(node85);
        aVLTree84.insert((int) (byte) 100);
        aVLTree84.insert((int) 'a');
        avltree.AVLTree.Node node92 = aVLTree84.find((int) (byte) 100);
        int int93 = aVLTree79.getBalance(node92);
        int int94 = aVLTree66.getBalance(node92);
        int int95 = aVLTree14.getBalance(node92);
        int int96 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        avltree.AVLTree aVLTree26 = new avltree.AVLTree();
        avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        int int29 = aVLTree26.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.insert((int) (short) 1);
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
        int int89 = aVLTree30.getBalance(node84);
        int int90 = aVLTree26.getBalance(node84);
        int int91 = aVLTree0.getBalance(node84);
        int int92 = aVLTree0.height();
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
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
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
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete(10);
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.delete(2);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        aVLTree14.delete((int) 'a');
        aVLTree14.insert((int) (short) 1);
        aVLTree14.insert((int) '#');
        aVLTree14.delete(10);
        avltree.AVLTree.Node node25 = aVLTree14.getRoot();
        avltree.AVLTree.Node node26 = aVLTree14.getRoot();
        int int27 = aVLTree0.getBalance(node26);
        avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        avltree.AVLTree.Node node9 = aVLTree0.find(10);
        avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((-1));
        int int16 = aVLTree13.height();
        avltree.AVLTree.Node node18 = aVLTree13.find((int) (byte) 100);
        aVLTree13.delete((int) (short) 100);
        int int21 = aVLTree13.height();
        avltree.AVLTree aVLTree22 = new avltree.AVLTree();
        avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree22.getBalance(node25);
        aVLTree22.insert(0);
        avltree.AVLTree aVLTree29 = new avltree.AVLTree();
        avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        avltree.AVLTree.Node node36 = aVLTree29.getRoot();
        int int37 = aVLTree22.getBalance(node36);
        avltree.AVLTree.Node node39 = aVLTree22.find((int) (short) 100);
        aVLTree22.delete((int) (short) -1);
        avltree.AVLTree.Node node43 = aVLTree22.find(0);
        int int44 = aVLTree13.getBalance(node43);
        int int45 = aVLTree0.getBalance(node43);
        aVLTree0.delete((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        int int53 = aVLTree0.height();
        int int54 = aVLTree0.height();
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.insert((int) (byte) 100);
        aVLTree55.delete((int) '4');
        aVLTree55.delete((int) (byte) 0);
        avltree.AVLTree.Node node64 = aVLTree55.getRoot();
        int int65 = aVLTree0.getBalance(node64);
        aVLTree0.delete((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        aVLTree9.insert((int) (short) -1);
        avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        int int19 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find(100);
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete(10);
        avltree.AVLTree.Node node15 = aVLTree0.find(10);
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        avltree.AVLTree.Node node10 = aVLTree0.find(10);
        aVLTree0.insert((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        avltree.AVLTree aVLTree14 = new avltree.AVLTree();
        avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert(0);
        aVLTree14.insert((int) (short) 10);
        avltree.AVLTree.Node node23 = aVLTree14.getRoot();
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
        int int55 = aVLTree14.getBalance(node52);
        avltree.AVLTree.Node node57 = aVLTree14.find((int) (byte) -1);
        avltree.AVLTree.Node node59 = aVLTree14.find((int) (byte) -1);
        aVLTree14.insert((int) (short) -1);
        aVLTree14.delete((int) ' ');
        int int64 = aVLTree14.height();
        avltree.AVLTree aVLTree65 = new avltree.AVLTree();
        avltree.AVLTree.Node node67 = aVLTree65.find((int) '4');
        avltree.AVLTree.Node node69 = aVLTree65.find((int) 'a');
        aVLTree65.insert((int) (short) -1);
        avltree.AVLTree aVLTree72 = new avltree.AVLTree();
        avltree.AVLTree.Node node74 = aVLTree72.find((int) '4');
        aVLTree72.insert((int) (short) 0);
        avltree.AVLTree.Node node78 = aVLTree72.find(100);
        avltree.AVLTree aVLTree79 = new avltree.AVLTree();
        avltree.AVLTree.Node node81 = aVLTree79.find((int) '4');
        avltree.AVLTree.Node node82 = aVLTree79.getRoot();
        aVLTree79.delete(100);
        aVLTree79.insert((int) (byte) 10);
        avltree.AVLTree.Node node87 = aVLTree79.getRoot();
        int int88 = aVLTree72.getBalance(node87);
        int int89 = aVLTree65.getBalance(node87);
        avltree.AVLTree.Node node90 = aVLTree65.getRoot();
        int int91 = aVLTree14.getBalance(node90);
        int int92 = aVLTree0.getBalance(node90);
        java.lang.Class<?> wildcardClass93 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node23);
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) ' ');
        int int7 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree9 = new avltree.AVLTree();
        avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.insert((int) '4');
        avltree.AVLTree.Node node17 = aVLTree9.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        java.lang.Class<?> wildcardClass19 = node17.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree24.getBalance(node27);
        aVLTree24.insert((int) (short) 100);
        avltree.AVLTree.Node node32 = aVLTree24.find((int) ' ');
        aVLTree24.delete((int) (byte) 1);
        avltree.AVLTree.Node node35 = aVLTree24.getRoot();
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree36.getBalance(node39);
        aVLTree36.insert(0);
        aVLTree36.insert((int) (short) 10);
        avltree.AVLTree.Node node45 = aVLTree36.getRoot();
        avltree.AVLTree.Node node47 = aVLTree36.find((int) (short) 0);
        int int48 = aVLTree24.getBalance(node47);
        int int49 = aVLTree0.getBalance(node47);
        int int50 = aVLTree0.height();
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
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.delete(100);
        int int13 = aVLTree7.height();
        avltree.AVLTree.Node node15 = aVLTree7.find((int) (short) -1);
        avltree.AVLTree.Node node16 = aVLTree7.getRoot();
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
        int int48 = aVLTree7.getBalance(node45);
        aVLTree7.insert(1);
        int int51 = aVLTree7.height();
        avltree.AVLTree aVLTree52 = new avltree.AVLTree();
        avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        avltree.AVLTree.Node node56 = aVLTree52.find((int) 'a');
        avltree.AVLTree.Node node57 = aVLTree52.getRoot();
        avltree.AVLTree.Node node58 = aVLTree52.getRoot();
        int int59 = aVLTree52.height();
        aVLTree52.insert((int) 'a');
        aVLTree52.insert((int) (short) 100);
        avltree.AVLTree.Node node64 = aVLTree52.getRoot();
        int int65 = aVLTree7.getBalance(node64);
        int int66 = aVLTree0.getBalance(node64);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        avltree.AVLTree.Node node62 = aVLTree0.find(100);
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
        org.junit.Assert.assertNull(node62);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) 10);
        avltree.AVLTree.Node node18 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        avltree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) '#');
        avltree.AVLTree.Node node22 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        int int43 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        avltree.AVLTree.Node node47 = aVLTree0.find((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(node47);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree0.getBalance(node22);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        aVLTree24.delete(1);
        avltree.AVLTree.Node node31 = aVLTree24.getRoot();
        avltree.AVLTree.Node node33 = aVLTree24.find((int) (byte) 10);
        avltree.AVLTree.Node node34 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        aVLTree24.insert((int) (short) 1);
        avltree.AVLTree.Node node39 = aVLTree24.getRoot();
        int int40 = aVLTree0.getBalance(node39);
        aVLTree0.delete(2);
        avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
        avltree.AVLTree.Node node18 = aVLTree10.find((int) (short) -1);
        aVLTree10.insert(0);
        avltree.AVLTree.Node node21 = aVLTree10.getRoot();
        avltree.AVLTree.Node node23 = aVLTree10.find((int) (byte) 0);
        int int24 = aVLTree0.getBalance(node23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node11 = aVLTree0.find(0);
        int int12 = aVLTree0.height();
        avltree.AVLTree aVLTree13 = new avltree.AVLTree();
        avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        int int19 = aVLTree13.height();
        avltree.AVLTree aVLTree20 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.delete((int) 'a');
        avltree.AVLTree.Node node25 = aVLTree20.getRoot();
        aVLTree20.delete(0);
        avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree20.getBalance(node28);
        int int30 = aVLTree20.height();
        avltree.AVLTree aVLTree31 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        avltree.AVLTree.Node node34 = aVLTree31.getRoot();
        aVLTree31.delete(100);
        aVLTree31.insert((int) (byte) 10);
        avltree.AVLTree.Node node39 = aVLTree31.getRoot();
        int int40 = aVLTree20.getBalance(node39);
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
        int int62 = aVLTree20.getBalance(node60);
        int int63 = aVLTree13.getBalance(node60);
        aVLTree13.delete((-1));
        aVLTree13.insert((int) (short) -1);
        avltree.AVLTree.Node node68 = aVLTree13.getRoot();
        int int69 = aVLTree0.getBalance(node68);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        aVLTree0.delete((int) (short) 100);
        avltree.AVLTree.Node node63 = aVLTree0.find((int) (byte) -1);
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
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        avltree.AVLTree aVLTree7 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.delete(100);
        aVLTree7.insert((int) (byte) 10);
        avltree.AVLTree.Node node15 = aVLTree7.getRoot();
        aVLTree7.insert((int) (byte) 100);
        int int18 = aVLTree7.height();
        aVLTree7.delete(100);
        avltree.AVLTree aVLTree21 = new avltree.AVLTree();
        avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree24.getBalance(node27);
        aVLTree24.insert((int) '4');
        avltree.AVLTree.Node node32 = aVLTree24.find((int) '#');
        avltree.AVLTree.Node node34 = aVLTree24.find((int) (byte) 0);
        int int35 = aVLTree24.height();
        avltree.AVLTree.Node node37 = aVLTree24.find((int) '4');
        int int38 = aVLTree21.getBalance(node37);
        int int39 = aVLTree7.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        java.lang.Class<?> wildcardClass41 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        avltree.AVLTree.Node node33 = aVLTree0.find((int) ' ');
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete(0);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        aVLTree11.delete((int) (byte) 1);
        avltree.AVLTree.Node node22 = aVLTree11.getRoot();
        avltree.AVLTree aVLTree23 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree23.getBalance(node26);
        aVLTree23.insert(0);
        aVLTree23.insert((int) (short) 10);
        avltree.AVLTree.Node node32 = aVLTree23.getRoot();
        avltree.AVLTree.Node node34 = aVLTree23.find((int) (short) 0);
        int int35 = aVLTree11.getBalance(node34);
        int int36 = aVLTree0.getBalance(node34);
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        avltree.AVLTree.Node node42 = aVLTree0.getRoot();
        int int43 = aVLTree0.height();
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass46 = aVLTree0.getClass();
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
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        aVLTree0.delete((-1));
        avltree.AVLTree aVLTree12 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.delete((int) (byte) -1);
        int int17 = aVLTree12.height();
        int int18 = aVLTree12.height();
        avltree.AVLTree.Node node20 = aVLTree12.find((int) '#');
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
        int int38 = aVLTree12.getBalance(node36);
        int int39 = aVLTree0.getBalance(node36);
        java.lang.Class<?> wildcardClass40 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        avltree.AVLTree.Node node6 = aVLTree0.find(100);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert(0);
        aVLTree45.insert((int) (short) 10);
        avltree.AVLTree.Node node54 = aVLTree45.getRoot();
        avltree.AVLTree aVLTree55 = new avltree.AVLTree();
        avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.insert((int) (byte) 100);
        aVLTree55.insert((int) 'a');
        avltree.AVLTree.Node node63 = aVLTree55.find((int) (byte) 100);
        avltree.AVLTree aVLTree64 = new avltree.AVLTree();
        avltree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        aVLTree64.delete((int) 'a');
        avltree.AVLTree.Node node69 = aVLTree64.getRoot();
        aVLTree64.delete(0);
        avltree.AVLTree.Node node72 = null;
        int int73 = aVLTree64.getBalance(node72);
        int int74 = aVLTree64.height();
        avltree.AVLTree aVLTree75 = new avltree.AVLTree();
        avltree.AVLTree.Node node77 = aVLTree75.find((int) '4');
        avltree.AVLTree.Node node78 = aVLTree75.getRoot();
        aVLTree75.delete(100);
        aVLTree75.insert((int) (byte) 10);
        avltree.AVLTree.Node node83 = aVLTree75.getRoot();
        int int84 = aVLTree64.getBalance(node83);
        int int85 = aVLTree55.getBalance(node83);
        int int86 = aVLTree45.getBalance(node83);
        int int87 = aVLTree0.getBalance(node83);
        aVLTree0.delete((int) ' ');
        avltree.AVLTree.Node node90 = aVLTree0.getRoot();
        avltree.AVLTree.Node node92 = aVLTree0.find((int) '#');
        int int93 = aVLTree0.height();
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
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        avltree.AVLTree.Node node8 = aVLTree0.find(10);
        aVLTree0.delete(10);
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert(1);
        int int9 = aVLTree0.height();
        avltree.AVLTree.Node node11 = aVLTree0.find((int) (byte) -1);
        int int12 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        aVLTree0.delete((int) (short) -1);
        int int23 = aVLTree0.height();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        aVLTree0.delete(2);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        avltree.AVLTree.Node node14 = aVLTree0.find((-1));
        int int15 = aVLTree0.height();
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        avltree.AVLTree.Node node33 = aVLTree0.getRoot();
        avltree.AVLTree.Node node34 = aVLTree0.getRoot();
        int int35 = aVLTree0.height();
        aVLTree0.delete((int) ' ');
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
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        aVLTree0.delete((int) (short) 100);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) (byte) -1);
        avltree.AVLTree.Node node24 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        aVLTree0.insert(0);
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        avltree.AVLTree.Node node44 = aVLTree41.getRoot();
        aVLTree41.delete(100);
        aVLTree41.insert((int) (byte) 10);
        avltree.AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree30.getBalance(node49);
        int int51 = aVLTree0.getBalance(node49);
        avltree.AVLTree.Node node52 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        aVLTree0.delete(0);
        aVLTree0.insert((int) (byte) 0);
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
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) (byte) 1);
        avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        avltree.AVLTree.Node node6 = aVLTree0.find(100);
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
        avltree.AVLTree.Node node52 = aVLTree0.find(1);
        int int53 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
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
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        int int54 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node13 = aVLTree0.find((int) ' ');
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        int int13 = aVLTree0.height();
        avltree.AVLTree.Node node15 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        int int9 = aVLTree0.height();
        avltree.AVLTree.Node node11 = aVLTree0.find(10);
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        avltree.AVLTree aVLTree15 = new avltree.AVLTree();
        avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        aVLTree15.insert((int) (short) 1);
        avltree.AVLTree.Node node23 = aVLTree15.find((int) ' ');
        aVLTree15.insert((int) (short) 10);
        aVLTree15.insert(0);
        avltree.AVLTree.Node node28 = aVLTree15.getRoot();
        int int29 = aVLTree15.height();
        avltree.AVLTree aVLTree30 = new avltree.AVLTree();
        avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        avltree.AVLTree.Node node36 = aVLTree30.find((int) ' ');
        aVLTree30.delete((int) '4');
        aVLTree30.delete((int) (short) 100);
        avltree.AVLTree aVLTree41 = new avltree.AVLTree();
        avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        avltree.AVLTree.Node node45 = aVLTree41.find((int) 'a');
        avltree.AVLTree.Node node47 = aVLTree41.find((int) ' ');
        avltree.AVLTree.Node node49 = aVLTree41.find((int) '#');
        avltree.AVLTree aVLTree50 = new avltree.AVLTree();
        avltree.AVLTree.Node node52 = aVLTree50.find((int) '4');
        avltree.AVLTree.Node node53 = null;
        int int54 = aVLTree50.getBalance(node53);
        aVLTree50.insert((int) (short) 100);
        avltree.AVLTree.Node node58 = aVLTree50.find((int) ' ');
        int int59 = aVLTree50.height();
        avltree.AVLTree.Node node60 = aVLTree50.getRoot();
        int int61 = aVLTree41.getBalance(node60);
        int int62 = aVLTree30.getBalance(node60);
        int int63 = aVLTree15.getBalance(node60);
        int int64 = aVLTree0.getBalance(node60);
        int int65 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        int int44 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) '#');
        avltree.AVLTree.Node node14 = aVLTree0.find(0);
        avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree0.getBalance(node15);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        aVLTree0.insert((int) '#');
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        int int31 = aVLTree0.height();
        aVLTree0.delete(10);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        aVLTree0.delete((int) '#');
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
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) (short) 10);
        avltree.AVLTree aVLTree11 = new avltree.AVLTree();
        avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        avltree.AVLTree aVLTree17 = new avltree.AVLTree();
        avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        avltree.AVLTree.Node node21 = aVLTree17.find((int) 'a');
        aVLTree17.delete((int) (short) 10);
        avltree.AVLTree aVLTree24 = new avltree.AVLTree();
        avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.insert((int) (byte) 100);
        aVLTree24.insert((int) 'a');
        avltree.AVLTree.Node node32 = aVLTree24.find((int) (byte) 100);
        int int33 = aVLTree17.getBalance(node32);
        int int34 = aVLTree11.getBalance(node32);
        avltree.AVLTree.Node node35 = aVLTree11.getRoot();
        avltree.AVLTree aVLTree36 = new avltree.AVLTree();
        avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        avltree.AVLTree aVLTree39 = new avltree.AVLTree();
        avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.insert((int) (byte) 100);
        avltree.AVLTree aVLTree45 = new avltree.AVLTree();
        avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert((int) (short) 100);
        avltree.AVLTree.Node node53 = aVLTree45.find((int) ' ');
        int int54 = aVLTree45.height();
        avltree.AVLTree.Node node55 = aVLTree45.getRoot();
        int int56 = aVLTree39.getBalance(node55);
        int int57 = aVLTree36.getBalance(node55);
        avltree.AVLTree.Node node59 = aVLTree36.find((int) 'a');
        avltree.AVLTree aVLTree60 = new avltree.AVLTree();
        avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        aVLTree60.delete((int) 'a');
        aVLTree60.delete(1);
        aVLTree60.delete((int) '#');
        aVLTree60.delete((int) (short) -1);
        avltree.AVLTree.Node node71 = aVLTree60.getRoot();
        aVLTree60.insert(10);
        aVLTree60.delete(1);
        avltree.AVLTree.Node node76 = aVLTree60.getRoot();
        int int77 = aVLTree60.height();
        aVLTree60.delete((int) 'a');
        avltree.AVLTree.Node node80 = aVLTree60.getRoot();
        int int81 = aVLTree36.getBalance(node80);
        int int82 = aVLTree11.getBalance(node80);
        int int83 = aVLTree0.getBalance(node80);
        int int84 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree aVLTree8 = new avltree.AVLTree();
        avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        aVLTree8.insert((int) (byte) 100);
        aVLTree8.insert((int) 'a');
        avltree.AVLTree.Node node16 = aVLTree8.find((int) (byte) 100);
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
        int int38 = aVLTree8.getBalance(node36);
        avltree.AVLTree.Node node39 = aVLTree8.getRoot();
        avltree.AVLTree.Node node40 = aVLTree8.getRoot();
        avltree.AVLTree.Node node42 = aVLTree8.find((int) (byte) 100);
        int int43 = aVLTree0.getBalance(node42);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        avltree.AVLTree.Node node21 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        int int19 = aVLTree0.height();
        int int20 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.insert((int) '#');
        avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        avltree.AVLTree aVLTree10 = new avltree.AVLTree();
        avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
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
        avltree.AVLTree aVLTree61 = new avltree.AVLTree();
        avltree.AVLTree.Node node63 = aVLTree61.find((int) '4');
        aVLTree61.delete((int) 'a');
        avltree.AVLTree.Node node66 = aVLTree61.getRoot();
        aVLTree61.delete((int) (byte) 1);
        avltree.AVLTree aVLTree69 = new avltree.AVLTree();
        avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        avltree.AVLTree aVLTree72 = new avltree.AVLTree();
        avltree.AVLTree.Node node74 = aVLTree72.find((int) '4');
        avltree.AVLTree.Node node75 = aVLTree72.getRoot();
        aVLTree72.insert((int) (byte) 100);
        avltree.AVLTree aVLTree78 = new avltree.AVLTree();
        avltree.AVLTree.Node node80 = aVLTree78.find((int) '4');
        avltree.AVLTree.Node node81 = null;
        int int82 = aVLTree78.getBalance(node81);
        aVLTree78.insert((int) (short) 100);
        avltree.AVLTree.Node node86 = aVLTree78.find((int) ' ');
        int int87 = aVLTree78.height();
        avltree.AVLTree.Node node88 = aVLTree78.getRoot();
        int int89 = aVLTree72.getBalance(node88);
        int int90 = aVLTree69.getBalance(node88);
        int int91 = aVLTree61.getBalance(node88);
        int int92 = aVLTree10.getBalance(node88);
        int int93 = aVLTree0.getBalance(node88);
        int int94 = aVLTree0.height();
        aVLTree0.insert(0);
        int int97 = aVLTree0.height();
        java.lang.Class<?> wildcardClass98 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
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
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        aVLTree0.insert((int) '#');
        int int13 = aVLTree0.height();
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        avltree.AVLTree.Node node30 = aVLTree0.find((int) '4');
        avltree.AVLTree aVLTree31 = new avltree.AVLTree();
        avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree31.getBalance(node34);
        aVLTree31.insert(0);
        aVLTree31.insert((int) (short) 10);
        avltree.AVLTree.Node node40 = aVLTree31.getRoot();
        int int41 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (short) 1);
        int int44 = aVLTree0.height();
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
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        avltree.AVLTree.Node node49 = aVLTree0.find((int) (byte) 10);
        avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        aVLTree0.insert(2);
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
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 100);
        avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node12);
    }
}

