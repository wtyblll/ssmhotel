package com.bdqn;

public class Test {
    public static void main(String[] args) {
        String str = "2020-10-23 - 2020-11-04";
        System.out.println(str.substring(0,str.indexOf(" ")));
        System.out.println(str.substring(str.lastIndexOf(" ")).trim());
    }
}
