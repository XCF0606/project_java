package com.itheima.a07mysetdemo;

import java.util.TreeSet;

public class A07_TreeSetDemo1 {
    public static void main(String[] args) {
        /*
        需求：创建5个学生对象
        属性：（姓名、年龄、语文成绩、数学升级、英语成绩）
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文成绩一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英语成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一学生，不存
         */

        //1.创建5个学生对象
        Student s1 = new Student("zhangsan", 24, 78, 98, 97);
        Student s2 = new Student("lisi", 20, 89, 86, 84);
        Student s3 = new Student("wangwu", 19, 76, 67, 54);
        Student s4 = new Student("zhaosi", 21, 98, 89, 87);
        Student s5 = new Student("qianqi", 25, 97, 79, 86);

        //2.添加学生对象到集合中
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student t : ts) {
            System.out.println(t + "总分：" + t.getScore());
        }
    }
}
