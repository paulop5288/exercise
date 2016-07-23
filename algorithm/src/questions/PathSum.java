package questions;

/**
 * Created by Paul on 2016/7/23.
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.val == sum && root.left == null && root.right == null) return true;

        boolean hasPathSum = false;
        if (root.left != null) {
            hasPathSum |= hasPathSum(root.left, sum - root.val);
        }
        if (root.right != null && hasPathSum == false) {
            hasPathSum |= hasPathSum(root.right, sum - root.val);
        }
        return hasPathSum;
    }




    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
