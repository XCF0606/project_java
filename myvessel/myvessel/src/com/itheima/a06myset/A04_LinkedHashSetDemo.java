package com.itheima.a06myset;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class A04_LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建4个学生对象
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 32);
        Student s4 = new Student("laoliu", 25);
        Student s5 = new Student("zhangsan", 20);

        //创建集合对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        // 添加顺序不一样
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        System.out.println(lhs.add(s5));

        System.out.println(lhs);
    }
}
