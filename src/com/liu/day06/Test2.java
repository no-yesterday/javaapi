package com.liu.day06;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "大家好！";
        StringBuilder sb = new StringBuilder(str);
        //1
        sb.append("我是程序员!");
        System.out.println("sb = " + sb);
        //2
        StringBuilder y = sb.insert(6, "优秀的");
        System.out.println("y = " + y);
        //3
        StringBuilder n = sb.replace(6, 8, "牛牛");
        System.out.println("n = " + n);
        //4
        StringBuilder delete = sb.delete(0, 4);
        System.out.println("delete = " + delete);
    }
}