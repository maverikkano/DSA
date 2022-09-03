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

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
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

    public TreeNode get(int value){
        if(value == data)
            return this;

        if(value < data)
            if(left != null)
                return left.get(value);

        if(value > data)
            if(right != null)
                return right.get(value);

        return null;
    }

    public int min(){
        if(left == null)
            return data;
        else
            return left.min();
    }

    public int max(){
        if(right == null)
            return data;
        else
            return right.max();
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}