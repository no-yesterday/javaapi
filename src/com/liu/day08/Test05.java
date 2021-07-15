package com.liu.day08;

import java.util.ArrayList;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println("al = " + al);

    }
}
