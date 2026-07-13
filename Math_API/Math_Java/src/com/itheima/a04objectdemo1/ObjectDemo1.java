package com.itheima.a04objectdemo1;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
        public String toString()                 返回对象的字符串表示形式
        public boolean equals(Object obj)        返回两个对象是否相等
        public Object clone(int a)               对象克隆
         */

        //1.toString    返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);   //java.lang.Object@4eec7777

        Student stu = new Student("张三", 26);
        String str2 = stu.toString();
        System.out.println(str2);   //Student{name = 张三, age = 26}

        //细节：
        //System：类名
        //out：静态变量
        //System.out：获取打印的对象
        //println()：方法
        //核心逻辑：
        /**
         * 当我们打印一个对象的时候，底层会调用对象的toString方法，把对象变成字符串。
         * 然后再打印在控制台上，打印完毕换行处理
         */

        /**
         * 但是一般直接打印出来对象的中的地址值没什么意义，如果想要对象内部的属性值，就可以重写toString方法
         *
         */


    }
}
