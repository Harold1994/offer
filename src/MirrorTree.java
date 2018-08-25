public class MirrorTree {
    public static void MirrorRecursively(BinaryTreeNode tree) {
        if (tree == null)
            return;
        if (tree.left == null && tree.right == null)
            return;
        BinaryTreeNode tmp = tree.left;
        tree.left = tree.right;
        tree.right = tmp;
        MirrorRecursively(tree.left);
        MirrorRecursively(tree.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(8);
        tree.left = new BinaryTreeNode(6);
        tree.right = new BinaryTreeNode(10);
        tree.left.left = new BinaryTreeNode(5);
        tree.left.right = new BinaryTreeNode(7);
        tree.right.left = new BinaryTreeNode(9);
        tree.right.right = new BinaryTreeNode(11);
        MirrorRecursively(tree);
        mlr(tree);
    }

    public static void mlr(BinaryTreeNode tree) {
        if (tree == null)
            return;
        System.out.println(tree.val);
        mlr(tree.left);
        mlr(tree.right);
    }
}
