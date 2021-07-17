package com.liu.threaddemo01;

/**
 * 线程。。。
 * 以前代码都是自上而下的执行 ，那么我想有个分支？？
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new HotWaterThread();//创建一个烧水线程
        Thread t2 = new XiCaiThreadThread();//创建一个洗菜线程
//        t1.start();
//        t2.run();
        t1.start();
        t1.start();
    }

    private static class HotWaterThread extends Thread {
    }

    private static class XiCaiThreadThread extends Thread {
    }
}
//如果只单单是个new Thread，他只是一个线程，线程中没有方法（任务），没意义。
//需要自己 创建一个 线程，继承他的 任务（方法）
//线程中 最有意义的局势run 方法
class HotWater extends Thread{
    @Override
    public  void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧了 = " + i + "瓶水");
        }
    }
}
class XiCaiThread extends Thread{
    public  void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("洗了 = " + i + "颗菜");
        }
    }
}