package cn.rookiex.swardTo;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author : Rookiex
 * @Date : 2019/07/21
 * @Describe :
 */
public class Sward5Test {

    @Test
    public void run() {
        Sward5 sward5 = new Sward5();
        String s = "hello world   ";
        String run = sward5.run(new StringBuffer(s));
        Assert.assertEquals(run,"hello%20world%20%20%20");
    }
}