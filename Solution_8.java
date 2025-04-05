class Solution_8 {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isBalanced(TreeNode root) {
        return cHt(root) != -1;
    }

    private static int cHt(TreeNode node) {
        if (node == null) return 0;
        int lHeight = cHt(node.left);
        if (lHeight == -1) return -1;
        int rHeight = cHt(node.right);
        if (rHeight == -1) return -1;
        if (Math.abs(lHeight - rHeight) > 1) return -1;
        return Math.max(lHeight, rHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("tree blanced :"+isBalanced(root));
    }
}