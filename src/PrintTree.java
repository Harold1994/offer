import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class PrintTree {
    public static void main(String[] args) {
        BinaryTreeNode treeNode = new BinaryTreeNode(8);
        treeNode.left = new BinaryTreeNode(6);
        treeNode.right = new BinaryTreeNode(10);
        treeNode.left.left = new BinaryTreeNode(5);
        treeNode.left.right = new BinaryTreeNode(7);
        treeNode.right.left = new BinaryTreeNode(9);
        treeNode.right.right = new BinaryTreeNode(11);
        printTree(treeNode);
    }

    public static void printTree(BinaryTreeNode tree) {
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        ((LinkedList<BinaryTreeNode>) queue).add(tree);
        int toPoint = 1;
        int nextLevel = 0;
        while (!queue.isEmpty()) {
            BinaryTreeNode tmp = queue.poll();
            System.out.print(tmp.val + " ");
            toPoint--;
            if (tmp.left!=null) {
                ((LinkedList<BinaryTreeNode>) queue).add(tmp.left);
                nextLevel++;
            }
            if (tmp.right!=null) {
                ((LinkedList<BinaryTreeNode>) queue).add(tmp.right);
                nextLevel++;
            }
            if (toPoint == 0) {
                System.out.println();
                toPoint = nextLevel;
                nextLevel=0;
            }
            Lock
        }
    }
}
