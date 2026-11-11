package com.itheima.a06myset;

import java.util.TreeSet;

public class a06_TreeSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建TreeSet集合，并添加3个学生对象
        学生对象属性：
            姓名，年龄
            要求按照学生的年龄进行排序
            同年龄按照姓名字母排列（暂不考虑中文）
            同姓名，同年龄认为是同一人
         */

        //1.创建3个学生对象
        Student s1 = new Student("zhangsan", 15);
        Student s2 = new Student("lisi", 16);
        Student s3 = new Student("wangwu", 18);

        //2.创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s3);
        ts.add(s2);

        System.out.println(ts);


    }
}
