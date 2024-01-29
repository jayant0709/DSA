import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Binary_Tree_Preorder_Traversal {
    static public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        l = preorderTree2arr(root, l);
        return l;
    }

    static private List<Integer> preorderTree2arr(TreeNode root, List<Integer> l) {
        if (root == null) {
            return l;
        }
        l.add(root.val);
        preorderTree2arr(root.left, l);
        preorderTree2arr(root.right, l);
        return l;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> l = new ArrayList<>();
        l = preorderTraversal(root);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
}
