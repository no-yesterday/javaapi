package com.liu.myio;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件的拷贝
 */
public class IODemoCopy01 {
    public static void main(String[] args) throws IOException {
        //拷贝文件
            RandomAccessFile raf = new RandomAccessFile("javaapi.rar", "r");//读
            RandomAccessFile raf2 = new RandomAccessFile("javaapi副本.rar", "rw");//读写
            int d = -1;  //io里面 -1 就代表着 读取完毕
            while (true){
                if (d == raf.read()){
                    raf2.write(d);
                }
            }
    }
}
