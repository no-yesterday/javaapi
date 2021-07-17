package com.liu.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK 8 的 快速 取 集合中的属性
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Person diaochan = new Person();
        diaochan.setName("貂蝉");
        diaochan.setAge(18);
        diaochan.setHeight(165);

        Person xiaoqiao = new Person();
        xiaoqiao.setName("小乔");
        xiaoqiao.setHeight(20);
        xiaoqiao.setHeight(158);

        Person sunshangxiang = new Person();
        sunshangxiang.setName("孙尚香");
        sunshangxiang.setAge(22);
        sunshangxiang.setHeight(170);
        //需求：有个曹操，需要一个String集合，该集合中的值提取与上面三千个list中的值，把名字都存进去

        List list = new ArrayList();
        list.add(diaochan);
        list.add(xiaoqiao);
        list.add(sunshangxiang);
        System.out.println("list = " + list);

        List<String> names = new ArrayList<>();
        names.add(diaochan.getName());
        names.add(xiaoqiao.getName());
        names.add(sunshangxiang.getName());
        System.out.println("names = " + names);
    }
}
