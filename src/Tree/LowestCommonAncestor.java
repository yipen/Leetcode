package Tree;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return helper(root,p,q);
    }

    public TreeNode helper(TreeNode node, TreeNode p, TreeNode q){
        if(node==p||node==q||node==null) return node;
        TreeNode left = helper(node.left,p,q);
        TreeNode right = helper(node.right, p, q);
        if(left!=null&&right!=null) return node;
        if(left==null&&right!=null) return right;
        return left;
    }
}
