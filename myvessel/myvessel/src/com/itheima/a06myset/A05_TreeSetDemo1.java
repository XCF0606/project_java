package com.itheima.a06myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class A05_TreeSetDemo1 {
    public static void main(String[] args) {

        //1.创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(3);
        ts.add(4);
        ts.add(2);
        ts.add(1);

        //打印集合
        System.out.println(ts);
        System.out.println("-------------迭代器-------------");
        //迭代器
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("-------------forEach-------------");
        //forEach
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("-------------Lambda-------------");
        //Lambda
        ts.forEach(i-> System.out.println(i));



    }
}
