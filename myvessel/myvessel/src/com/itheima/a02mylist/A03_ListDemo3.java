package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*

        1. 迭代器遍历
        2. 列表迭代器遍历
        3. 增强for循环
        4. Lambda表达式遍历
        5. 普通for循环（因为List集合存在索引）

         */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String s = it.next();
//            System.out.println(s);
//        }

        //2.增强for循环
//        for (String s : list) {
//            System.out.println(s);
//        }

        //3.Lambda表达式
//        list.forEach(s -> System.out.println(s));

        //4.for循环
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //5.列表迭代器
        //比collection多的一个就是可以添加元素
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String s = it.next();
            if ("bbb".equals(s)){
                it.add("fff");
            }
        }

        System.out.println(list);


    }
}
