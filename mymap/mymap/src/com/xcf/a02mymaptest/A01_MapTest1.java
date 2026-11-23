package com.xcf.a02mymaptest;

import java.util.HashMap;
import java.util.Set;

public class A01_MapTest1 {
    public static void main(String[] args) {
        //需求：
        /*
        创建一个HashMao集合，键是学生对象，值是籍贯
        存储三个键值对元素，并遍历
        要求：同姓名。同年龄认为是同一个学生
         */

        //1.创建HashMap集合
        HashMap<A01_StudentTest1 , String> hsp = new HashMap<>();

        //2.创建学生对象
        A01_StudentTest1 stu1 = new A01_StudentTest1("郭德纲", 18);
        A01_StudentTest1 stu2 = new A01_StudentTest1("于谦", 22);
        A01_StudentTest1 stu3 = new A01_StudentTest1("迪迦奥特曼", 24);
        A01_StudentTest1 stu4 = new A01_StudentTest1("迪迦奥特曼", 24);

        //3.存储学生对象
        hsp.put(stu1, "呼和浩特");
        hsp.put(stu2, "北京");
        hsp.put(stu3, "杭州");
        //泛型是自定义对象的话，必须重写equals和hashCode方法，否则不会去重
        hsp.put(stu4, "杭州");

        //4.获取到hsp集合中所有的键
        Set<A01_StudentTest1> students = hsp.keySet();
        for (A01_StudentTest1 student : students) {
            System.out.println(student);
        }

    }
}
