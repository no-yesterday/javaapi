package com.liu.threaddemo01;

/**
 *创建线程的第二种方式，继承，用实现
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable xicai = new XiCai();
        Runnable shaoshui = new ShaoShui();

        Thread xicaiThread = new Thread(xicai);
        Thread shaoshuiThread = new Thread(shaoshui);

        xicaiThread.start();
        shaoshuiThread.start();
    }
}
class XiCai implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("洗菜 = " + i);
        }
    }
}
class ShaoShui implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("烧水 = " + i);
        }
    }
}