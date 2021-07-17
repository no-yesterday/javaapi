package com.liu.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合：非常重要！！ 有一个接口
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //ArrayList collection = new ArrayList();
        //add增加
        collection.add("牛牛1");
        collection.add("牛牛2");
        collection.add("牛牛3");
        collection.add("牛牛4");
        System.out.println("collection = " + collection);
        //尺寸
        int size = collection.size();
        System.out.println("size = " + size);
        //是否为空
        boolean empty = collection.isEmpty();
        System.out.println("empty = " + empty);
        //清空
        //collection.clear();
        System.out.println("collection = "+collection);
        boolean empty1 = collection.isEmpty();
        System.out.println("empty1 = " + empty1);
        //集合的遍历 3种
        //1
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.println("collection = "+collection.get(i));
//        }
        //思考：为什么collection不能使用for循环呢？？？
        //换句话说，为什么不能根据索引来取值呢？
        //因为set集合没有索引下标，所以for循环不能使用到 collection中。
        for (Object o : collection) {
            System.out.println("o = " + o);
        }
        //迭代器和for循环的区别
        //迭代器工作：有游标，问下一个有没有下一个元素，如果有，就拿出，没有就结束
        //for循环的工作：把集合从0---n排序，从0开取，拿下标。解释，为什么学历for循环后，再学一个迭代器


    }
}
