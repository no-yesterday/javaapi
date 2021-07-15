package com.liu.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println("al = " + al);
        List<Integer> list = al.subList(3, 7);
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*10);
        }
        System.out.println("list = " + list);
        System.out.println("al = " + al);
        List<Integer> list1 = al.subList(7, 10);
        list1.removeAll(list1);
        System.out.println("al = " + al);

    }
}
