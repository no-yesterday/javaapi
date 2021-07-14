package com.liu.day06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 写一个 private 方法, 需要 传一个 string 的 网址参数, 返回 处理后的数据.
 *  假定 大数据获取了 很多网址, 我想要 www -----  com 之间的内容
 *  有一下  几类网址
 *1  www.oracle.com  ---->  oracle
 *2  www.oracle.com.cn  ---->  oracle
 *3  www.java.oracle.com.cn  ---->  java.oracle
 *4  www.lol.game.qq.com.cn  ---->  lol.game.qq
 *5  www.game.mycom.com.cn  ---->  game.mycom
 *6  www.girl.mycom.com.cn  ---->  girl.mycom
 *7  www.computer.mycom.com.cn  ---->  computer.mycom
 */
public class Test7 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
    }

    private static void test7() {
        String str = "www.computer.mycom.com.cn";
        String regex = "www.(.*).com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);//匹配类
        while (matcher.find()) {
            System.out.println(matcher.group(1));//打印中间字符
        }
    }

    private static void test6() {
        String str = "www.girl.mycom.com.cn";
        String regex = "www.(.*).com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);//匹配类
        while (matcher.find()) {
            System.out.println(matcher.group(1));//打印中间字符
        }
    }

    private static void test5() {
        String str = "www.game.mycom.com.cn";
        String regex = "www.(.*).com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);//匹配类
        while (matcher.find()) {
            System.out.println(matcher.group(1));//打印中间字符
        }
    }

    private static void test4() {
        String str = "www.lol.game.qq.com.cn";
        String regex = "www.(.*).com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);//匹配类
        while (matcher.find()) {
            System.out.println(matcher.group(1));//打印中间字符
        }
    }

    private static void test3() {
        String str = "www.java.oracle.com.cn";
        String regex = "www.(.*).com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);//匹配类
        while (matcher.find()) {
            System.out.println(matcher.group(1));//打印中间字符
        }
    }

    private static void test2() {
        String str = "www.oracle.com.cn";
        String regex = "www.(.*).com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);//匹配类
        while (matcher.find()) {
            System.out.println(matcher.group(1));//打印中间字符
        }
    }

    private static void test1() {
        String str = "www.oracle.com";
        String regex = "www.(.*).com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);//匹配类
        while (matcher.find()) {
            System.out.println(matcher.group(1));//打印中间字符
        }
    }
}
