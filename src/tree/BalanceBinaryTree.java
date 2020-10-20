package tree;

public class BalanceBinaryTree {
    public boolean isBalance(TreeNode root) {
        if (root == null) return true;

        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        if (Math.abs(left - right) > 1) return false;
        return isBalance(root.left) && isBalance(root.right);
    }

    public int treeDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(treeDepth(node.left), treeDepth(node.right)) + 1;
    }

    public boolean isBalanceTree(TreeNode root) {
        int depth = 0;
        return isBalanceHelper(root, depth);
    }

    public boolean isBalanceHelper(TreeNode node, int depth) {
        if (node == null) {
            depth = 0;
            return true;
        }
        int left = 0, right = 0;
        if (isBalanceHelper(node.left, left) && isBalanceHelper(node.right, right)) {
            if(Math.abs(left-right)<=1){
                depth = Math.max(left, right)+1;
                return true;
            }
        }
        return false;
    }

}
