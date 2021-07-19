package com.liu.threaddemo01;

/**
 * 线程的打断
 * 背景： 1.泽汇：爱吃屎   100口
 *       2.顺顺：打断 泽汇
 */
public class TreadDemo05 {
    public static void main(String[] args) {
        Thread zeHui = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        System.out.println("泽汇吃了" + i+"口屎");
                        i++;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            if (e.getMessage().equals("sleep interrupted")) {
                            System.out.println("顺顺阻止了泽汇吃屎");
                            break;
                            }
                        e.printStackTrace();
                    }
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        });
        zeHui.start();
        Thread shunShunThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    zeHui.interrupt();//打断泽汇
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        shunShunThread.start();
    }
}
