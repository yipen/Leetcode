package tree;

public class ValidBSTree {
    public boolean isValidBSTree(TreeNode root){
        return helper(root);
    }

    public boolean helper(TreeNode node){
        if(node == null) return true;
        boolean left=true, right=true;
        if(node.left!=null){
            if(node.left.val>=node.val){
                left = false;
            }
        }
        if(node.right!=null){
            if(node.right.val<=node.val){
                right=false;
            }
        }
        if(left&&right){
            return helper(node.left)&&helper(node.right);
        }
        return false;
    }
}
