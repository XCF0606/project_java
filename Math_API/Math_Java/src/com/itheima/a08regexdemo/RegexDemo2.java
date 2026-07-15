package com.itheima.a08regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        // 字符类(只匹配一个字符)
        // 只能是 a b c
        System.out.println("----------------1-------------------");
        System.out.println("a".matches("[abc]"));  // true
        System.out.println("zz".matches("[abc]")); // false
        System.out.println("ab".matches("[abc]")); // false
        System.out.println("ab".matches("[abc][abc]")); // true

        // 不能出现a b c
        System.out.println("-----------------2------------------");
        System.out.println("a".matches("[^abc]"));  // false
        System.out.println("z".matches("[^abc]"));  // true
        System.out.println("c".matches("[^abc]"));  // false

        // a - z A - Z (包括头尾的范围)
        System.out.println("------------------3-----------------");
        System.out.println("a".matches("[a-zA-Z]"));  // true
        System.out.println("zz".matches("[a-zA-Z]")); // false
        System.out.println("c".matches("[a-zA-Z]"));  // true

        // a - d 或者 m - p
        System.out.println("------------------4-----------------");
        System.out.println("a".matches("[a-dm-p]"));   // true
        System.out.println("c".matches("[a-d[m-p]]")); // true
        System.out.println("e".matches("[a-d[m-p]]")); // false

        //[a-z&&[def]]  a-z和def的交集。为d,e,f
        //细节：如果要求两个范围的交际，那么需要写符号&&(不要写成单个的)
        //如果写成了一个&，那么此时&表示的不是交集了，而是一个简单的符号&
        System.out.println("------------------5-----------------");
        System.out.println("d".matches("[a-z&&[def]]"));   // true
        System.out.println("c".matches("[a-z&&[def]]"));   // false
        System.out.println("c".matches("[a-z&[def]]"));   // true 单个的话，就是多加了个&





    }
}
