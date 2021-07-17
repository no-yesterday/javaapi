package com.liu.threaddemo01;

/**
 * 线程创建的
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("洗菜 = " + i);
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("洗菜 = " + i);
                }
            }
        }.start();
    }
}
