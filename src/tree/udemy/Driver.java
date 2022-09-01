package tree.udemy;

/**
 * @author abhishek on 9/2/22
 */
public class Driver {
    public static void main(String[] args) {
        Tree bst = new Tree();

        bst.insert(25);
        bst.insert(20);
        bst.insert(15);
        bst.insert(27);
        bst.insert(30);
        bst.insert(29);
        bst.insert(26);
        bst.insert(22);
        bst.insert(32);

        bst.traverseInOrder();
        bst.traversePreOrder();
        bst.traversePostOrder();
    }
}
