package com.itheima.a06myset;

import java.util.HashSet;

public class A03_HashSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建一个存储学生对象的集合，存储多个学生对象
        使用程序实现在控制台遍历该集合
        要求：学生对象的成员变量值相同，我么就认为是同一个对象
         */

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 32);
        Student s4 = new Student("laoliu", 25);
        Student s5 = new Student("zhangsan", 20);

        //创建集合，添加学生
        HashSet<Student> sh = new HashSet<>();

        System.out.println(sh.add(s1));
        System.out.println(sh.add(s2));
        System.out.println(sh.add(s3));
        System.out.println(sh.add(s4));
        //不重写Student的hasCode方法，数据不会去重，因为比对的是地址值，泛型是自定义对象的话，必须重写
        //hashCode和equals方法
        //重点：如果类型是包装类String Integer，不需要我们重写hashCode，因为Java已经帮我们重写好了
        System.out.println(sh.add(s5));

        //打印集合
        System.out.println(sh);


    }
}
