package com.liu.day07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 */
public class Test04 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("按照格式'yyyy-MM-dd'输入生产日期：");

        String s = scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    }
}
