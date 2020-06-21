package local.nix.second.level.task;

import local.nix.second.level.tasks.treeNodeHandler.TreeNode;
import local.nix.second.level.tasks.treeNodeHandler.TreeNodeHandler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeNodeHandlerTest {

    @Test
    public void getMaxDepthOfTreeNodeTest() {

        TreeNode tree = new TreeNode(5);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(4);
        tree.left = left1;
        tree.right = right1;
        TreeNode left11 = new TreeNode(7);
        TreeNode right11 = new TreeNode(9);
        left1.left = left11;
        left1.right = right11;
        TreeNode left12 = new TreeNode(7);
        TreeNode right12 = new TreeNode(9);
        right1.left = left12;
        right1.right = right12;
        TreeNode left111 = new TreeNode(7);
        TreeNode right111 = new TreeNode(9);
        right11.left = left111;
        right11.right = right111;

        assertEquals(TreeNodeHandler.getMaxDepthOfTreeNode(tree), 4);

    }

}
