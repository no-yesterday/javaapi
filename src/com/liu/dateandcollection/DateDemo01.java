package com.liu.dateandcollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 企业开发中(java,bigData)日期
 * 日期类的层是有一个long值 学名UTC时间
 * 1970年1月1日 00：00：00开始 计算时间元年
 * 日期类有2个包，sql/Util ，我们用util包下的日期
 *
 * 这个日期类 功能有限，如需日期计算，需要使用日历类
 */
public class DateDemo01 {
    public static void main(String[] args) {
        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date);//data 为什么会输出Wed Jul 14 09:55:13 CST 2021
        //toString()被改写了...可以重新改为我们自己的时间
        long time = date.getTime();//获得真实时间 long值
        System.out.println("time = " + time);//1626241021514相当于2021-07-14
        //练习：查看10天后是哪一天？
        time = time + 1000*60*60*24*10L;
        date.setTime(time);
        System.out.println("date = " + date);
        //修改 日期显示格式 yyyy必须小写
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String pattern1 = "yyyy/MM/dd HH:mm:ss";//格式可以自定义
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String format = sdf.format(date);
        System.out.println("format = " + format);
        //字符串------->转日期
        System.out.println("-----------------------");
        String dateStr = "2000-10-16 00:00:00";
        try {
            Date parse = sdf.parse(dateStr);//在红色的单词上，点击alt+回车，选择try/catch
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            System.out.println("输入可能存在错误");
            e.printStackTrace();
        }

    }

}
