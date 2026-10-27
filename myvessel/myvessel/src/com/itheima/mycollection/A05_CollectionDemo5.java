package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {

        /*
        Lambda遍历
         */

        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //注意：
        //利用匿名内部类方式
        //底层原理：
        //其实也会自己遍历集合，一次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
//        coll.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                //s依次表示集合中的每一个数据
//                System.out.println(s);
//            }
//        });

        //使用Lambda表达式
        coll.forEach(s -> System.out.println(s));


    }
}
