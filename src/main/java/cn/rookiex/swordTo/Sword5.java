package cn.rookiex.swordTo;

/**
 * @Author : Rookiex
 * @Date : 2019/07/21
 * @Describe : 题目是替换空格,为"%20" 解决办法,先遍历一遍,因为字符变多,所以一个空格需要在后面加两个空字符串,然后用两个指针,
 * 一个指向加空格之前的数据,一个指向加空格之后的数据吧数据往后移,如果遇到空格就改成移需要替换的字符串
 */
public class Sword5 {
    public String run(StringBuffer str) {

        int P1 = str.length() - 1;
        for (int c = 0; c <= P1; c++)
            if (str.charAt(c) == ' ')
                str.append("  ");

        int j = str.length() - 1;
        for(int k = P1;k>0;k--){
            if(str.charAt(k) == ' '){
                str.setCharAt(j--,'0');
                str.setCharAt(j--,'2');
                str.setCharAt(j--,'%');

                //注意顺序,倒序插入的,所以顺序注意不要错了
            }else{
                str.setCharAt(j,str.charAt(k));
                j--;
            }
        }

        return str.toString();
    }
}
