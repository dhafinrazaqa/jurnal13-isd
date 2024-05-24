public class Tree<E extends Comparable<E>> {
    TreeNode<E> root;

    public Tree() {
        root = null;
    }

    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void searchBST(E key) {
        boolean hasil = searchBSTHelper(root, key);
        if (hasil) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    public boolean searchBSTHelper(TreeNode<E> node, E key) {
        boolean result = false;

        if (node != null) {
            if (key.equals(node.getData())) {
                result = true;
            } else if (key.compareTo(node.getData()) < 0) {
                result = searchBSTHelper(node.getLeftNode(), key);
            } else {
                result = searchBSTHelper(node.getRightNode(), key);
            }
        }
        return result;
    }
}
