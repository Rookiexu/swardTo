package cn.rookiex.swordTo;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author : Rookiex
 * @Date : 2019/07/23
 * @Describe : 从尾到头打印链表 ,可以用递归,也可以用栈来实现
 */
public class Sword6 {
    public List<Integer> run(List<Integer> list) {
        List<Integer> objects = Lists.newArrayList();
        if (list.size() > 0) {
            Integer integer = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            objects.add(integer);
            objects.addAll(run(list));
        }
        return objects;
    }
}
