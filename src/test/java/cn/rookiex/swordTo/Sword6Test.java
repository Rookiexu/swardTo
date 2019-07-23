package cn.rookiex.swordTo;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author : Rookiex
 * @Date : 2019/07/23
 * @Describe :
 */
public class Sword6Test {

    @Test
    public void run() {
        int size = 5;
        List<Integer> objects = Lists.newArrayList();
        for (int i = 0; i < size; i++) {
            objects.add(i);
        }

        objects.forEach(integer -> {
            System.out.println("init num ==> " + integer);
        });

        Sword6 sword6 = new Sword6();
        List<Integer> run = sword6.run(objects);

        run.forEach(integer -> {
            System.out.println("run num ==> " + integer);
        });
    }
}