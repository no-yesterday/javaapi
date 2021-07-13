package com.liu.stringclazz;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        String str = "a";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            sb.append(str);
            System.out.println("sb = " + sb);
        }
    }
}
