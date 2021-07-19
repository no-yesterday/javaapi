package com.liu.threaddemo01;

/**
 * 刚刚的1-2 是锁在普通方法上的
 * 现在要锁在静态方法,synchronized可以锁在 带static 方法上的
 */
public class ThreadSyncDemo03 {
    public static void main(String[] args) {
        Runnable target;
        Thread t1 = new Thread(){
            @Override
            public void run() {
                Shop1.buy();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                Shop1.buy();
            }
        };
        t1.start();t2.start();
    }
}
class Shop1{
    public  synchronized static void buy(){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"xuanyifu");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+"shiyifu");
        try {
            thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getName()+"chulai");
    }
}