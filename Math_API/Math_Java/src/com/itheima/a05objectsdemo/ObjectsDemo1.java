package com.itheima.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        //public static boolean equlas(Object a, Object b)
        // 对两个对象进行属性值比较
        Student s1 = null;
        Student s2 = new Student(1, "郭德纲", 28);

        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
        //细节：
        //1.方法的底层会判断s1是否为null，如果为null，直接返回false
        //2.如果s1不为null，那么就利用s1再次调用equals方法
        //3.此时s1是Student类型，所以最终还是会调用Student中的equals方法。
        //如果没有重写，比较地址值，如果重写了，就比较属性值

        //public static boolean isNull(Object obj)  判断对象是否哦为null，为null返回true，反之
        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3)); //false
        System.out.println(Objects.isNull(s4)); //true

        System.out.println(Objects.nonNull(s3)); //true
        System.out.println(Objects.nonNull(s4)); //false

    }
}
