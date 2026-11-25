package com.xcf.a02mymaptest;

import java.util.Comparator;
import java.util.TreeMap;

public class A04_TreeMapTest1 {
    public static void main(String[] args) {
        /*
        TreeMap集合：基本应用
        键：学生对象
        值：籍贯
        要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人
         */

        //1.创建集合
        TreeMap<A04_StudentTest1, String> tm = new TreeMap<>();

        //2.创建学生对象
        A04_StudentTest1 s1 = new A04_StudentTest1("郭德纲", 25);
        A04_StudentTest1 s2 = new A04_StudentTest1("迪迦", 21);
        A04_StudentTest1 s3 = new A04_StudentTest1("梦比优斯", 23);

        tm.put(s1, "天津");
        tm.put(s2, "地球");
        tm.put(s3, "m87星球");

        System.out.println(tm);
    }
}
