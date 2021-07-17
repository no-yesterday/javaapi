package com.liu.collection;

import java.util.ArrayList;

/**
 *集合 寸的 是 对象的什么？
 * 寸的对象的引用，当 对象通过外改变了，那么 集合中的内容也会变。
 *
 */
public class CollctionDemo02 {
    public static void main(String[] args) {
        Person niuniu = new Person();
        niuniu.setName("牛牛公主");
        niuniu.setHeight(180);
        niuniu.setAge(500);
        ArrayList collection = new ArrayList();
        collection.add(niuniu);
        for (Object o : collection) {
            System.out.println("o = " + o);
        }
        niuniu.setHeight(190);
        niuniu.setAge(2000);
        niuniu.setName("飞飞公主");
        for (Object o : collection) {
            System.out.println("o = " + o);
        }
    }
}
