package com.xcf.a02mymaptest;

import java.util.Objects;

public class A01_StudentTest1 {
    private String name;
    private int age;


    public A01_StudentTest1() {
    }

    public A01_StudentTest1(String name, int age) {
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

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        A01_StudentTest1 that = (A01_StudentTest1) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "A01_StudentTest1{name = " + name + ", age = " + age + "}";
    }
}
