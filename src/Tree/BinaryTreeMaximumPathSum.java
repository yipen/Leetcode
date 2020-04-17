package Tree;

public class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxNodeSum(root);
        return max;
    }

    public int maxNodeSum(TreeNode node){
        if(node==null) return 0;
        int maxLeft = Math.max(0, maxNodeSum(node.left));
        int maxRight = Math.max(0,maxNodeSum(node.right));
        max = Math.max(max, maxLeft+maxRight+node.val);
        return Math.max(maxLeft,maxRight)+node.val;
    }
}
