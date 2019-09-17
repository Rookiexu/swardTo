package cn.rookiex.swordTo;

import java.util.Stack;

/**
 * @Author : Rookiex
 * @Date : Created in 2019/9/17 10:54
 * @Describe :
 * @version: 1.0
 */
public class Sword8 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
