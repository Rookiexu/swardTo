package cn.rookiex.swordTo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sword7Test {

    @Test
    public void reConstructBinaryTree() {
        int[] ints = {1,2,3,4,5,6,7};
        int[] ints2 = {3,2,4,1,6,5,7};
        Sword7 sword7 = new Sword7();
        TreeNode treeNode = sword7.reConstructBinaryTree(ints, ints2);
        System.out.println(treeNode.val);
    }

    @Test
    public void getInts() {
    }
}