package com.liu.stringclazz;
/**
 * 测试String类的性能，总结：频繁修改字符串，会造成性能损失，需要StringBuffer/StringBuild
 *频繁修改字符串，会造成内存溢出的错误
 * String,StringBuild,StringBuffer
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String str = "a";//第一次循环
//        str = "aa";//第二次循环
//        str = "aaa";//第三次循环
        System.out.println(System.currentTimeMillis());//当前日期的long值
        long l = System.currentTimeMillis();
        for (int i = 0; i <28 ; i++) {
            str+=str;//测试频繁修改字符串
            System.out.println("str = " + str);
        }
        System.out.println(System.currentTimeMillis()-l);
    }
}
