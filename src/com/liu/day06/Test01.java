package com.liu.day06;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 *
 *
 */
public class Test01 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        test1(str);
        test2(str);
        test3(str);
        test4(str);
        test5(str);
        test6(str);
        test7(str);
        test8(str);
        test9(str);
    }

    private static void test9(String str) {
        //9
        System.out.println("第九题");
        //转全大写
        String s = str.toUpperCase();
        System.out.println("s = " + s);
        //转全小写
        String s1 = str.toLowerCase();
        System.out.println("s1 = " + s1);
    }

    private static void test8(String str) {
        //8
        System.out.println("第八题");
        //开头
        boolean h = str.startsWith("h");
        System.out.println("h = " + h);
        //结尾
        boolean d = str.endsWith("d");
        System.out.println("d = " + d);
    }

    private static void test7(String str) {
        //7
        System.out.println("第七题");
        char c = str.charAt(5);
        System.out.println("c = " + c);
    }

    private static void test6(String str) {
        //6
        System.out.println("第六题");
        String str1 = "  Hello   ";
        String trim = str1.trim();
        System.out.println("trim = " + trim);

    }

    private static void test5(String str) {
        //5
        System.out.println("第五题");
        String substring = str.substring(5);
        System.out.println("substring = " + substring);
    }

    private static void test4(String str) {
        //4
        System.out.println("第四题");
        String substring = str.substring(0, 5);
        System.out.println("substring = " + substring);
    }

    private static void test3(String str) {
        //3
        System.out.println("第三题");
        int i = str.indexOf("o", 5);
        System.out.println("i = " + i);
    }

    private static void test2(String str) {
        //2
        System.out.println("第二题");
        int i = str.indexOf("o");
        System.out.println("i = " + i);
    }

    private static void test1(String str) {
        //1
        System.out.println("第一题");
        int length = str.length();
        System.out.println("length = " + length);
    }
}
