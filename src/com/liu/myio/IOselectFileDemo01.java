package com.liu.myio;

import java.io.File;

/**
 * io能创建文件，也能创建文件夹
 *还能查看文件
 */
public class IOselectFileDemo01 {
    private static long size = 0;
    public static void main(String[] args) {
        //查询当前目录下的 所有文件
        File file = new File(".");
        File[] files = file.listFiles();
//        for (File file1 : files) {
//            System.out.println("file1 = " + file1);
//            if (file1.isDirectory()){
//                File[] files1 = file.listFiles();
//            }
//        }
        //有什么样的方法可以 全部 查看所有的 文件呢 ？
        long size = findAll(file);
        System.out.println("size = " + size + "字节");
    }

    public static long findAll(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                findAll(file1);  //递归
            }else {
                System.out.println("file1 = " + file1.length());
                size += file1.length();
            }
        }
        return size;
    }
}
