package com.liu.threaddemo01;

/**
 * 多个线程同时操作一个资源诞生的  安全的问题
 * 比如：多个 账户抢票.
 * 多线程的 安全问题
 * synchronized 锁的机制，可以解决 多线程的 安全问题
 * 解决的手段是 将原本的多个线程 ”各干各的 变为 按顺序执行
 * 未知 synchronized 锁之前，线程 是异步的，给方法加上synchronized锁，就变成同步
 * 将有序的同步执行，就会 解决安全问题，但是缺点是因为有序，需要等待方法内的程序走完
 * 才进行下一个线程，所以会慢
 */
public class ThreadSyncDemo01 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                //模拟黄牛1取票
                while (true){
                    int ticket = tickets.getTicket();Thread.yield();
                    System.out.println(getName()+"线程拿了 = " + ticket);
                }
            }

        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                //模拟黄牛2取票
                while (true){
                    int ticket = tickets.getTicket();
                    Thread.yield();
                    System.out.println(getName()+"线程拿了 = " + ticket);
                }
            }

        };
        t1.start();
        t2.start();

    }
}
class Tickets{
    private int ticket=20;

    public int getTicket() {
        if (ticket==0){
            System.out.println("没票了");
            throw new RuntimeException("票没了");
        }
        Thread.yield();//线程的让一让
        return ticket--;
    }
}
