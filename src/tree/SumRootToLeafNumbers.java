package tree;

public class SumRootToLeafNumbers {
//    public static void main(String[] args){
//        TreeNode root = new TreeNode(1);
//        TreeNode left = new TreeNode(2);
//        TreeNode right = new TreeNode(3);
//        root.left=left;
//        root.right=right;
//        System.out.println(sumNumbers(root));
//    }

    public static int sumNumbers(TreeNode root) {
        return sumHelper(root, 0);
    }

    public static int sumHelper(TreeNode node, int value){
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null) return value*10+node.val;
        return sumHelper(node.left, value*10+node.val)+sumHelper(node.right, value*10+node.val);
    }
}
