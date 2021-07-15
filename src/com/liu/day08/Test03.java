package com.liu.day08;

import java.util.ArrayList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        System.out.println("al = " + al);
        Object o = al.get(1);
        System.out.println("o = " + o);
        Object set = al.set(2, "3");
        System.out.println("al = " + al);
        Object remove = al.remove(2);
        System.out.println("remove = " + remove);
        System.out.println("al = " + al);
    }
}
