public class Main {
    public static void main(String[] args) {
        Tree<Character> binarySearchTree = new Tree<>();

        binarySearchTree.insertNode('F');
        binarySearchTree.insertNode('E');
        binarySearchTree.insertNode('H');
        binarySearchTree.insertNode('D');
        binarySearchTree.insertNode('G');
        binarySearchTree.insertNode('C');
        binarySearchTree.insertNode('B');
        binarySearchTree.insertNode('H');
        binarySearchTree.insertNode('K');
        binarySearchTree.insertNode('J');

        binarySearchTree.searchBST('K');
        binarySearchTree.searchBST('A');
    }
}
