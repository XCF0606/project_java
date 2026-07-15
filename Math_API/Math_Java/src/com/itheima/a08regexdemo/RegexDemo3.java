package com.itheima.a08regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        // .表示任意一个字符
        System.out.println("你".matches(".."));  //false
        System.out.println("你a".matches("..")); //true

        System.out.println("-------------------------------------");
        // \\d只能是任意一位数字
        // 简单记：两个\表示一个\
        System.out.println("3".matches("\\d"));    //true
        System.out.println("a".matches("\\d"));    //false
        System.out.println("333".matches("\\d"));  //false

        System.out.println("-------------------------------------");
        // \\w只能是一位单词字符 [a-zA-Z_0-9]
        System.out.println("z".matches("\\w"));     //true
        System.out.println("2".matches("\\w"));     //true
        System.out.println("z1".matches("\\w"));    //false
        System.out.println("你".matches("\\w"));    //false

        System.out.println("-------------------------------------");
        // \\W非单词字符
        System.out.println("你".matches("\\W"));     //true
        System.out.println("2".matches("\\W"));     //flase
        System.out.println("z1".matches("\\W"));    //false


        System.out.println("-------------------------------------");
        // 必须是数字和字符， 必须是4位
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));     //true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));     //false
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));     //false

    }
}
