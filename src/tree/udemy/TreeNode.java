package tree.udemy;

/**
 * @author abhishek on 9/2/22
 */
public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value){
        // no duplicates allowed
        if(value == data)
            return;
        else if(value < data){
            if(left == null)
                left = new TreeNode(value);
            else
                left.insert(value);
        }
        else{
            if(right == null)
                right = new TreeNode(value);
            else
                right.insert(value);
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void traverseInOrder(){
        if(left != null)
            left.traverseInOrder();

        System.out.print(data+" ");

        if(right != null)
            right.traverseInOrder();
    }

    public void traversePreOrder(){
        System.out.print(data+" ");
        if(left != null)
            left.traversePreOrder();
        if(right != null)
            right.traversePreOrder();
    }

    public void traversePostOrder(){
        if(left != null)
            left.traversePreOrder();

        if(right != null){
            right.traversePostOrder();
        }
        System.out.print(data+" ");
    }
}