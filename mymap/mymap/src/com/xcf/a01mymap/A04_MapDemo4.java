package com.xcf.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        // 1.创建Map集合的对象
        Map<String, String> mp = new HashMap<>();

        //2.添加元素
        mp.put("野王", "李白");
        mp.put("法王", "上官婉儿");
        mp.put("牢区", "牢布");

        //使用Lambda遍历
        //底层：
        //forEach其实就是利用第二种方式进行遍历,一次得到每一个键和值，也就是在调动entrySet然后再把结果赋值给accept方法
        mp.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });

        mp.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
