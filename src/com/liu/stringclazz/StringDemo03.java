package com.liu.stringclazz;

public class StringDemo03 {
    public static void main(String[] args) {
        String str = "thinking in java";//java编程思想
        //查询下标为10 的字符是什么
        char c = str.charAt(10);
        System.out.println("c = " + c);
        //查询字符串长度
        int length = str.length();//注意：length()是个方法，数组的长度是属性
        System.out.println("length = " + length);
        //把字符串转换为字符数组
        char[] chars = str.toCharArray();//应用点在于对数据的加密
        //查询数组长度不加“小括号”
        int length1 = chars.length;
        System.out.println("length1 = " + length1);
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }
        //获取str在字符串对象中第一次出现的索引
        int i = str.indexOf("in");//查找第一次in出现的位置
        System.out.println("i = " + i);
        //从指定位置进行检索
        int i1 = str.indexOf("in", 3);
        System.out.println("i1 = " + i1);
        //也可以检索最后一次出现的位置
        int i2 = str.lastIndexOf("in");
        System.out.println("i2 = " + i2);
        //判断字符串对象是否以指定的字符开头，参数toffset为指定从哪个下标开始
        boolean th = str.startsWith("th");
        System.out.println("th = " + th);
        //判断是否以“va”结尾
        boolean va = str.endsWith("va");
        System.out.println("va = " + va);

        //定义个新变量
        String str1 = "www.oracle.com";
        //subString(String str, String strStart, String strEnd) 截取字符串str中指定字符 strStart、strEnd之间的字符串
        //含头不含尾
        String substring = str1.substring(4, 10);
        System.out.println("substring = " + substring);
        //一下子 截取末尾
        String substring1 = str1.substring(4);
        System.out.println("substring1 = " + substring1);

        //新建个变量
        String str2 = "  di di di  ";
        //去除字符串两端空格
        String trim = str2.trim();
        System.out.println("trim = " + trim);//不删除字符串中间的空格

        String m = "ABC";
        String n = "abc";
        //把字符串转换为小写字符串
        String s = m.toLowerCase();
        System.out.println("s = " + s);
        //把字符串转换为大写字符串
        String s1 = n.toUpperCase();
        System.out.println("s1 = " + s1);
        //m=n?
        System.out.println(m.equals(n));//false
        //忽略大小写,验证码
        System.out.println(m.equalsIgnoreCase(n));//true
        //把数字转化为字符串
        int u=110;
        String s2 = String.valueOf(u);
        System.out.println("s2 = " + s2);

        //split()分割数组
        String ss = "dididi.jpg";
        String[] split = ss.split("\\.");
        for (String s3 : split) {
            System.out.println("s3 = " + s3);
        }
        //replace(char oldChar, char newChar)  将指定字符替换成另一个指定的字符
        //replaceAll(String regex,String replasement)  用新的内容替换全部旧内容
        String mm="lalala德玛西亚";
        String mmm = mm.replaceAll("[a-z]", "啦");//[^a-z]除了a-z
        System.out.println("mmm = " + mmm);

        //数据包含
        //contains(CharSequence s)  查看字符串中是都含有指定字符
        String nn = "haha,gs";
        boolean gs = nn.contains("gs");
        System.out.println("gs = " + gs);//true


        //练习：{"username":"tang","age":"500"}提取json中的k、和v，赋值到一个对象
        //QuJingRen 类-------> username,age


        // 练习: 写一个 private 方法, 需要 传一个 string 的 网址参数, 返回 处理后的数据.
        // 假定 大数据获取了 很多网址, 我想要 www -----  com 之间的内容
        // 有一下  几类网址
        // www.oracle.com  ---->  oracle
        // www.oracle.com.cn  ---->  oracle
        // www.java.oracle.com.cn  ---->  java.oracle
        // www.lol.game.qq.com.cn  ---->  lol.game.qq
        // www.game.mycom.com.cn  ---->  game.mycom
        // www.girl.mycom.com.cn  ---->  girl.mycom
        // www.computer.mycom.com.cn  ---->  computer.mycom
    }
}
