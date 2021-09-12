package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(23);
        intTree.insert(15);
        intTree.insert(7);
        intTree.insert(76);
        intTree.insert(12);
        intTree.insert(9);

        intTree.traverseInOrder();

        System.out.println(intTree.get(7).getData());
        System.out.println(intTree.get(17).getData());

    }
}
