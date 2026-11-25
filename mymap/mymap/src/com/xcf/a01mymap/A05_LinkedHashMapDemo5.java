package com.xcf.a01mymap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class A05_LinkedHashMapDemo5 {
    public static void main(String[] args) {
        /*
        LinkedHashMap：
            由键决定：
                有序、不重复、无索引
            有序：
                保证存储和取出的顺序一致
            原理：
                底层数据结构依然是哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序
         */

        //1.创建集合
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        //2.添加元素
        lhm.put("c", 789);  //谁先插入就输出谁
        lhm.put("a", 123);
        lhm.put("a", 012);  //这里会覆盖掉第一次添加的值，因为是由键决定的
        lhm.put("b", 456);


        System.out.println(lhm); //{c=789, a=10, b=456}


    }
}
