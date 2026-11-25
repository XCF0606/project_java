package com.xcf.a02mymaptest;

import java.util.Objects;

public class A04_StudentTest1 implements Comparable<A04_StudentTest1>{
    private String name;
    private int age;


    public A04_StudentTest1() {
    }

    public A04_StudentTest1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "A04_StudentTest1{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(A04_StudentTest1 o) {
        //按照学生年龄升序排序，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人

        //this：表示当前要添加的元素
        //o：表示红黑树已经存在的元素

        //返回值：
        // 负数：表示当前要添加的元素是小的，存左边
        // 正数：表示当前要添加的元素是大的，存右边
        //0：表示存在，舍弃

        int i = this.getAge() - o.getAge();

        i = i == 0 ? this.getName().compareTo(o.getName()) : i;

        return i;
    }
}
