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
}