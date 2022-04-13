import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(10);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.insert(0);
        avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        avltree.AVLTree aVLTree0 = new avltree.AVLTree();
        avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete((int) (byte) 0);
    }
}

