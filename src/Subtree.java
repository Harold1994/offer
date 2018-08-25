class BinaryTreeNode {
    double val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int val) {
        this.val = val;
    }
}
public class Subtree {
    public static boolean DoesTree1HasTree2(BinaryTreeNode tree1, BinaryTreeNode tree2) {
        if (tree2 == null)
            return true;
        if (tree1 == null)
            return false;
        if (tree1.val != tree2.val)
            return false;
        return DoesTree1HasTree2(tree1.left, tree2.left) && DoesTree1HasTree2(tree1.right, tree2.right);
    }
    public static boolean hasSubTree(BinaryTreeNode tree1, BinaryTreeNode tree2)
    {
        boolean ans = false;
        if (!(tree1 == null || tree2 == null)) {
            if (tree1.val == tree2.val)
                ans = DoesTree1HasTree2(tree1, tree2);
            if (!ans)
                ans = hasSubTree(tree1.left, tree2);
            if (!ans)
                ans = hasSubTree(tree1.right, tree2);
        }
        return ans;
    }
    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(8);
        tree.left = new BinaryTreeNode(8);
        tree.left.left = new BinaryTreeNode(9);
        tree.left.right = new BinaryTreeNode(2);
        tree.left.right.left = new BinaryTreeNode(4);
        tree.left.right.right = new BinaryTreeNode(7);
        tree.right = new BinaryTreeNode(7);

        BinaryTreeNode tree2 = new BinaryTreeNode(8);
        tree2.left = new BinaryTreeNode(9);
        tree2.right = new BinaryTreeNode(2);
        System.out.println(hasSubTree(tree, tree2));
    }
}
