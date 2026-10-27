package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {

        /*
        增强for循环遍历
         */

        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //注意：
        //s其实就是一个第三方变量，在循环过程中表示集合的每一个元素
        //修改增强for中的变量，不会改变集合中原本的数据
        for (String s : coll) {
            System.out.println(s);
        }


    }
}
