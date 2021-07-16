package com.liu.day08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("$");
        collection.add("2");
        collection.add("$");
        collection.add("3");
        collection.add("$");
        collection.add("4");
//        for (int i = 1; i < 5; i++) {
//            collection.add(i);
//            collection.add("$");
//        }
        System.out.println("collection = " + collection);
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next == "$") {
                iterator.remove();
            }
            System.out.println("collection = " + collection);
            for (Object o : collection) {
                System.out.println("o = " + o);
            }
        }
    }
}
