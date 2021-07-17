package com.liu.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Xiloer
 *
 */
public class Test07 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();//生成十个随机数（100以内）
            int i1 = random.nextInt(100);
            list.add(0,i1);//添加到List集合
            System.out.println("i1 = " + i1);
        }
        System.out.println("list = " + list);
        Collections.sort(list);//快速排序
        System.out.println("list = " + list);

    }
}
