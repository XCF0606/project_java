package com.itheima.a04objectdemo1;

public class ObjectDemo2 {
    public static void main(String[] args) {
        /*
        public boolean equals(Object obj)
         */

        Student s1 = new Student("张三", 24);
        Student s2 = new Student("张三", 24);

        boolean result = s1.equals(s2); //equals方法重写了
        System.out.println(result); //true
    }
}
