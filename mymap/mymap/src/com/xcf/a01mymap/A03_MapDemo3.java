package com.xcf.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //1.创建Map集合的对象
        Map<String, String> mp = new HashMap<>();

        //2.添加元素
        mp.put("野王", "李白");
        mp.put("法王", "上官婉儿");
        mp.put("牢区", "牢布");

        //3.Map集合的第二种遍历方式
        //通过键值对对象进行遍历
        //3.1 通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = mp.entrySet();

        //3.2 遍历 entries 这个集合，去得到里面的每一个对象
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("***********************");
            System.out.println(entry);
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }


        //增强Lambda循环遍历
        System.out.println("**********增强Lambda循环遍历*************");
        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry));

        //迭代器遍历
        System.out.println("**********迭代器遍历*************");
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next);
        }

    }
}
