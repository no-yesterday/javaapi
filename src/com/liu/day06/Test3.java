package com.liu.day06;
/**
 * 检查一个字符串是否为回文
 * 回文:正着念与反着念一样，例如:上海自来水来自海上
 */
public class Test3 {
    public static void main(String[] args) {
        String str = "我爱你爱我";
        StringBuilder sb = new StringBuilder(str);
        String afterReverse=sb.reverse().toString();
        //判断反转后的字符串与原字符串是否相等
        int isequal=afterReverse.compareTo(str);  //若相等则输出0
        if (isequal==0){
            System.out.println("是回文");
        }else
            System.out.println("不是回文");
    }
}
