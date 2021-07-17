package com.liu.threaddemo01;

/**
 * 多个线程同时操作一个资源诞生的  安全的问题
 * 比如：多个 账户抢票.
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
