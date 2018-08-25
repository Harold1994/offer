public class SymmerticalTree {
    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(8);
        tree.left = new BinaryTreeNode(6);
        tree.right = new BinaryTreeNode(6);
        tree.left.left = new BinaryTreeNode(5);
        tree.left.right = new BinaryTreeNode(7);
        tree.right.left = new BinaryTreeNode(7);
        tree.right.right = new BinaryTreeNode(5);
        System.out.println(isSymmetric(tree));
    }

    public static boolean isSymmetric(BinaryTreeNode tree) {
        return isSymmetric(tree, tree);
    }

    public static boolean isSymmetric(BinaryTreeNode tree1, BinaryTreeNode tree2) {
        if (tree1==null && tree2 == null)
            return true;
        if (tree1==null || tree2== null)
            return false;
        if (tree1.val != tree2.val)
            return false;
        return isSymmetric(tree1.left,tree2.right) && isSymmetric(tree1.right, tree2.left);
    }
}
