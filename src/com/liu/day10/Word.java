package com.liu.day10;

import java.io.File;

/**
 * 遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件
 */
public class Word {
    public static void main(String[] args) {
        get("D:\\实训\\idea项目\\test1");
    }

    public static void get(String a) {
        File b = new File(a); //获取路径
        File[] files = b.listFiles();//获取路径下的所有文件
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory())
                    get(file.getAbsolutePath());  //getAbsolutePath()：返回绝对路径
                else if (file.isFile() && file.getName().endsWith(".java"))//如果文件的后缀名为.java就输出
                    System.out.println(file.getName());
            }
        }

    }
}
