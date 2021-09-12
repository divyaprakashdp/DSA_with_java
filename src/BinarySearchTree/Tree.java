package BinarySearchTree;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root==null){
            root = new TreeNode(value);
        }else {
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

    public TreeNode get(int input){
        if (root != null){
            return root.get(input);
        }
        return null;
    }

    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }else{
            return root.max();
        }
    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }else{
            return root.min();
        }
    }
}
