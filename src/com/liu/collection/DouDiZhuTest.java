package com.liu.collection;

import java.util.*;
/**
 * 斗地主 模拟 洗牌.
 * 牌数 : 54 张,  大王, 小王,   2-10 ,  A,J,Q , K  , 四个
 * ♥ , ♠ , ♣ , ♦
 * 1-10
 * ❤7      ♦7
 */
public class DouDiZhuTest {
    public static void main(String[] args) {
        //1.先造出 4 个花色
        List<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♠");
        colors.add("♣");
        colors.add("♦");
        //2.造出10 个 2-10
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 2; i <=10 ; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        System.out.println("numbers = " + numbers);

        //3.上面的 colors 和 numbers 进行一个整合
        //放入到一个 新的集合中  如何做到？？   嵌套循环
        List<String> piker = new ArrayList<>();
        //Set<String> piker = new HashSet<>();
        for (String color : colors) {
            for (String number : numbers) {
                piker.add(color+number);
            }
        }
        piker.add("BigKing");
        piker.add("LittleKing");
        System.out.println("piker = " + piker);
        System.out.println("piker = " + piker.size());
        //如果使用set也无法分开排序，改为list，有个方法可以打乱他的排序，只能打断list
        //因为set是无序的
        Collections.shuffle(piker);//打断list的排序
        System.out.println("piker = " + piker);
        //给player1 player2 player3 发牌
        List<String> player1 = new ArrayList<>();//玩家1
        List<String> player2 = new ArrayList<>();//玩家2
        List<String> player3 = new ArrayList<>();//玩家3
        for (int i = 0; i < piker.size(); i++) {
            String pName = piker.get(i);//每张扑克牌.


        }

        Collections.sort(piker);//list 的快速排序(不是人工指定的排序，)
        System.out.println("piker = " + piker);
    }
}
