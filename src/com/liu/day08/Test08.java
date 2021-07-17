package com.liu.day08;

import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Xiloer
 *
 */
public class Test08 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请按照'yyyy-MM-dd'的格式输入第一个日期：");
        String s = scanner.nextLine();
        list.add(s);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请按照'yyyy-MM-dd'的格式输入第二个日期：");
        String s1 = scanner.nextLine();
        list.add(s1);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("请按照'yyyy-MM-dd'的格式输入第三个日期：");
        String s2 = scanner.nextLine();
        list.add(s2);
        Collections.sort(list);
        System.out.println("list = " + list);

    }
}
