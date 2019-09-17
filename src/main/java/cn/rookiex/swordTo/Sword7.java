package cn.rookiex.swordTo;

/**
 * @Author : Rookiex
 * @Date : Created in 2019/9/16 19:59
 * @Describe : 根据前序遍历和中序遍历建立树
 * [1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
 * <p>
 * 对应输出应该为:
 * <p>
 * {1,2,5,3,4,6,7}
 * @version: 1.0
 */
public class Sword7 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null) {
            return null;
        }

        if (pre.length == 0) {
            return null;
        }
        int root = pre[0];
        TreeNode treeNodes = new TreeNode(root);
        for (int i = 0; i < in.length; i++) {
            int i1 = in[i];
            if (i1 == root) {
                //中序遍历的左边就是左叶节点
                //中序遍历的右边就是右叶节点
                int[] left = getInts(in, 0, i);
                int[] right = getInts(in, i + 1, in.length);
                int[] preLeft = getInts(pre, 1, left.length + 1);
                int[] preRight = getInts(pre, left.length + 1, pre.length);
                treeNodes.left = reConstructBinaryTree(preLeft, left);
                treeNodes.right = reConstructBinaryTree(preRight, right);
                break;
            }
        }
        return treeNodes;
    }

    public int[] getInts(int[] ints, int start, int end) {
        int[] ints1 = new int[end - start];
        for (int i = 0; i < end; i++) {
            if (i >= start) {
                ints1[i - start] = ints[i];
            }
        }
        return ints1;
    }
}

class TreeNode {
    int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

