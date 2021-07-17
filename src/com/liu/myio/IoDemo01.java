package com.liu.myio;

import java.io.File;
import java.io.IOException;

/**
 * File 文件
 * File 文件你真行，可读可写可执行
 */
public class IoDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("io02.txt");//路径

//        try {
//            boolean newFile = file.createNewFile();//创建新文件
//            System.out.println("newFile = " + newFile);
//        } catch (IOException e) {
//            System.out.println("未能创建新文件");
//            e.printStackTrace();
//        }
        //查看文件是否存在，一定要有这个代码，不然文件会被覆盖
        boolean exists = file.exists();
        if (exists){
            System.out.println("文件已经存在，boolean 值 = " + exists);
        }else {
            System.out.println("文件不存在，boolean 值 = " + exists);
            boolean newFile = file.createNewFile();//创建文件
            System.out.println("newFile = " + newFile);//文件创建成功
        }
        boolean isFile = file.isFile();
        System.out.println("是否是文件isFile = " + isFile);
        boolean directory = file.isDirectory();
        System.out.println("是否是目录directory = " + directory);
        boolean hidden = file.isHidden();
        System.out.println("是否是隐藏文件hidden = " + hidden);

        System.out.println("file = " + file);
        String name = file.getName();
        System.out.println("name = " + name);
        long length = file.length();
        System.out.println("length = " + length);
    }
}
