package cn.rookiex.swordTo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author : Rookiex
 * @Date : 2019/07/21
 * @Describe :
 */
public class Sword5Test {

    @Test
    public void run() {
        Sword5 sword5 = new Sword5();
        String s = "hello world   ";
        String run = sword5.run(new StringBuffer(s));
        Assert.assertEquals(run,"hello%20world%20%20%20");
    }
}