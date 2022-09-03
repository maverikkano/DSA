package tree.udemy;

/**
 * @author abhishek on 9/2/22
 */
public class Tree {
    private TreeNode root;

    public void insert(int value){
        if(root == null)
            root = new TreeNode(value);
        else
            root.insert(value);
    }

    public void traverseInOrder(){
        System.out.println("Inorder Traversal: ");
        if(root != null)
            root.traverseInOrder();
        System.out.println();
    }

    public void traversePreOrder(){
        System.out.println("PreOrder Traversal: ");
        if(root != null)
            root.traversePreOrder();

        System.out.println();
    }

    public void traversePostOrder(){
        System.out.println("PostOrder Traversal: ");
        if(root != null)
            root.traversePostOrder();

        System.out.println();
    }

    public TreeNode get(int value){
        if(root != null)
            return root.get(value);

        return null;
    }

    public int min(){
        if(root != null)
            return root.min();
        else
            return Integer.MIN_VALUE;
    }

    public int max(){
        if(root != null)
            return root.max();
        else
            return Integer.MAX_VALUE;
    }

    /**
     * @param value value to be deleted
     * @implSpec Approach 1: All nodes leading to the target nodes are processed. Modify a deep chain of nodes.
     * Can be optimized further.
     */
    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), value));
        }
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), value));
        }
        else {
            // Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeft() == null) {
                return subtreeRoot.getRight();
            }
            else if (subtreeRoot.getRight() == null) {
                return subtreeRoot.getLeft();
            }

            // case 3: node has 2 children
            // replace VALUE of the node to be deleted with left's max or right's min
//            subtreeRoot.setData(subtreeRoot.getLeft().max());
            subtreeRoot.setData(subtreeRoot.getRight().min());

//            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), subtreeRoot.getData()));
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), subtreeRoot.getData()));
        }

        return subtreeRoot;
    }
}