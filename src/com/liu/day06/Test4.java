package com.liu.day06;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 */
public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的邮箱：");
        String s = scanner.nextLine();
        String substring = s.substring(0, s.indexOf("@"));
        System.out.println("substring = " + substring);


    }
}
