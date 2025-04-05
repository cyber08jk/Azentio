class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class TreeDiameter {
    static class TreeInfo {
        int height;
        int Dm;

        TreeInfo(int height, int Dm) {
            this.height = height;
            this.Dm = Dm;
        }
    }

    public static int DmOfTree(TreeNode root) {
        return calDm(root).Dm;
    }

    private static TreeInfo calDm(TreeNode node) {
        if (node == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo Li = calDm(node.left);
        TreeInfo Ri = calDm(node.right);

        int height = 1 + Math.max(Li.height, Ri.height);

        int Dm = Math.max(Li.Dm, Math.max(Ri.Dm, Li.height + Ri.height));

        return new TreeInfo(height, Dm);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("diameter of the tree: " + DmOfTree(root));
    }
}