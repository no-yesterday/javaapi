package com.liu.threaddemo01;

import java.util.Random;

/**
 * 线程的打断
 * 打断 针对 线程的sleep来讲的
 * 讲解 线程拆炸弹的demo
 *
 */
public class ThreadDemo04 {
    public static int time=4;//炸弹💣的倒计时
    public static int password = new Random().nextInt(100);

    public static boolean boom=true;
    public static void main(String[] args) {
        System.out.println("炸弹💣的密码是：" + password);
        //第一个线程：炸弹的倒计时，如果 完成倒计时，就bengbeng
        Runnable target;
        Thread boomThread = new Thread(new Runnable() {
            @Override
            public void run() {
                //炸弹的倒计时
                System.out.println("定时炸弹已经安装");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (time>=0){
                    try {
                        if (time == 0) {
                            System.out.println("炸弹已爆炸，匪徒胜利");
                            boom = false;
                            break;
                        }
                        time--;
                        System.out.println("time = " + time);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }){

        };

        //第二个线程：是 打断线程的倒计时，如果打断了，就不bengbeng
        Thread policeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                //jingcha 负责拆炸弹 ，因为模拟，所以用打断的方式，打断boomThread就行了
                System.out.println("警察开始拆炸弹！！！");
                while (boom){
                    if(password==new Random().nextInt(100)){
                        boomThread.interrupt();//这个是线程的打断.
                        break;
                    }
                }
            }
        });
        boomThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        policeThread.start();
    }
}
