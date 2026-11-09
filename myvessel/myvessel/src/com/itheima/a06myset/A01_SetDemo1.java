package com.itheima.a06myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        /*
        利用Set系列的集合，添加字符串，并使用多种方式遍历
        迭代器
        增强for
        Lambda表达式
         */

        //1.创建一个Set集合
        Set<String> s = new HashSet<>();

        //2.添加数据
        //如果当前元素是第一次添加，那么可以添加成功，返回true
        //如果当前元素是第二次重复添加，那么添加失败，返回false
        s.add("张三");
        s.add("李四");
        s.add("王五");
        s.add("赵六");

        //3.打印集合
        //迭代器遍历
       /* Iterator<String> str = s.iterator();
        while (str.hasNext()){
            String s1 = str.next();
            System.out.println(s1);
        }*/

        //增强for循环
   /*     for (String str : s) {
            System.out.println(str);
        }*/

        //Lambda表达式
        s.forEach(str->System.out.println(str));


    }
}
