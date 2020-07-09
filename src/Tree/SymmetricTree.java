package Tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        return isSymmetricHelper(root.left, root.right);
    }

    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        if(left!=null && right !=null){
            if(left.val==right.val){
                return isSymmetricHelper(left.left, right.right)&&
                        isSymmetricHelper(left.right, right.left);
            }
        }
        return false;
    }
}
