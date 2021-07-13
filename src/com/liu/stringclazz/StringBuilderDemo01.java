package com.liu.stringclazz;

/**
 * StringBuilder(线程不安全，速度很快)/StringBuffer(线程安全，速度稍微慢) 解决了字符串频繁修改的问题
 * 意思是把String升级了
 * Strin类 重点 重用性
 * StringBuilder/StringBuffer 倾向于对字符串的修改
 * 当用到字符串大量的追加/修改/删除的时候，就使用StringBuilder/StringBuffer
 * StringBuilder的优点：内部有个可变的字符数组，速度快，内存消耗小
 * 在公司实际开发中，字符串的增删改，要用 StringBuilder/StringBuffer
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        String str = "好好学习";
        StringBuilder sb = new StringBuilder(str);
        //1.追加
        sb.append("挣大钱");
        System.out.println("sb = " + sb);
        //2.修改
        //开头，结尾，替换内容
        sb.replace(4,7,"挣好多钱");
        System.out.println("sb = " + sb);
        //3.删除
        sb.deleteCharAt(1);//删除指定下标字符
        System.out.println("sb = " + sb);
        //3-1删除字符区间 很常用
        sb.delete(0,3);
        System.out.println("sb = " + sb);
        //3-2删除全部
        sb.delete(0,sb.length());
        System.out.println("sb = " + sb);
        //4.插入 增加
        sb.insert(0,"加油啊");
        System.out.println("sb = " + sb);
        //5.对字符串进行反转
        StringBuilder reverse = sb.reverse();
        System.out.println("reverse = " + reverse);
    }
}
