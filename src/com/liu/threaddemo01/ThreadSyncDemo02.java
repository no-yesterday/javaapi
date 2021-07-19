package com.liu.threaddemo01;

/**
 * synchronized 锁，尽量所在 范围小的位置上
 * 越小，效率越高
 * 优衣库
 * synchronized 锁在方法上，那么 如果方法中有有 可以多个线程共同使用的
 */
public class ThreadSyncDemo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Runnable target;
        Thread t1 = new Thread(){


        };
        Thread t2 = new Thread();
    }
}
class Shop{
    public synchronized void buy() {
        Thread thread = Thread.currentThread();
        System.out.println("thread = " + thread.getName());
//        Thread.sleep("5000");
        synchronized (this){
            //使用sychronized 块 所在关键你位置
            System.out.println("huanyifu = " + thread.getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        }
    }