package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        /*

        List系列集合独有的方法：
        void add(int index, E element)      在此集合中的指定位置插入指定元素
        E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        E set(int index, E element)         修改指定索引处的元素，返回被修改的元素
        E get(int index)                    返回指定索引处的元素

         */

        //1.创建一个集合
        List<Integer> list = new ArrayList<>();

        // 添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //删除元素
        //remove有重载方法，两种：1、Object的话，想要使用Object就得将数据自动装箱--->包装类
        //                     2、index的话，直接输入数字，就会根据索引进行删除，后面的索引会自动补位
        //Object方法进行删除
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);

        //根据索引进行删除
        list.remove(0);
        System.out.println(list);


        //E set(int index, E element)         修改指定索引处的元素，返回被修改的元素
        list.set(0, 666);
        System.out.println(list);

        //E get(int index)                    返回指定索引处的元素
        System.out.println(list.get(0));
    }
}
