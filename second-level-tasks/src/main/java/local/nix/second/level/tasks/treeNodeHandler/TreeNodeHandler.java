package local.nix.second.level.tasks.treeNodeHandler;

public class TreeNodeHandler {

    public static int getMaxDepthOfTreeNode(TreeNode root) {

        if (root == null) return 0;
        int Left = getMaxDepthOfTreeNode(root.left);
        int Right = getMaxDepthOfTreeNode(root.right);
        return Math.max(Left,Right) + 1;
    }
}
