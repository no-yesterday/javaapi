package com.liu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序集合！！对集合进行自然排序（从小到大）
 * 他只能对list排序，对set不可以，因为set是无序的
 */
public class SortListDemo01 {
    public static void main(String[] args) {
        //纯数字
        List<Integer> list = new ArrayList();
        list.add(50);
        list.add(30);
        list.add(80);
        list.add(20);
        list.add(66);
        System.out.println("list = " + list);
        Collections.sort(list);
        System.out.println("list = " + list);

        //纯字符串
        List<String> list1 = new ArrayList<>();
        list1.add("构式");
        list1.add("泽汇");
        list1.add("爱");
        list1.add("他的");
        list1.add("瑶妹");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);//按照字符编码排序
        System.out.println("list1 = " + list1);

        //对象的排序（应用的地方很广）
        Person p1 = new Person();
        p1.setName("牛牛");
        p1.setHeight(325);
        p1.setAge(500);

        Person p2 = new Person();
        p2.setName("狗狗");
        p2.setHeight(90);
        p2.setAge(3);

        Person p3 = new Person();
        p3.setName("猪猪");
        p3.setHeight(110);
        p3.setAge(3);

        Person p4 = new Person();
        p4.setName("飞飞");
        p4.setHeight(185);
        p4.setAge(40);
        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        System.out.println("personList = " + personList);
        Collections.sort(personList);
        System.out.println("personList = " + personList);
        Collections.reverse(personList);
        System.out.println("personList = " + personList);

    }
}
