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
}