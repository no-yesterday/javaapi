package com.liu.myio;

import java.io.File;

/**
 * file 的其他
 */
public class IoDemo02 {
    public static void main(String[] args) {
        //创建文件夹，所有的io底层都不是 Java操作的，而是Java调用 所在系统的底层操作
        File file = new File("io");
        if (!file.exists()) {
            file.mkdir();//不加s 只能一层，加s可以创建多层，一般用 s
        }else {
            System.out.println("文件已经存在");
        }

        File file1 = new File("io1/1o2/1o3/io4/io5");
        if (!file1.exists()) {
            file1.mkdirs();
        }else {
            System.out.println("文件已经存在");
        }

    }
}
