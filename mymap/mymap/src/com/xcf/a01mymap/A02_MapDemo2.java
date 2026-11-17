package com.xcf.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象
        Map<String, String> mp = new HashMap<>();

        //2.添加元素
        mp.put("奥特之父", "奥特之母");
        mp.put("猿飞阿斯玛", "夕日红");
        mp.put("赛文", "赛罗");

        //3.通过键找值
        //3.1 获取所有的键，把这些键放到一个单列集合中
        Set<String> keys = mp.keySet();
        //3.2 遍历单列集合，得到每一个键
        for (String key : keys) {
            //System.out.println(key);
            //3.3 利用map集合中的键获取对应的值 get--->自带的方法，可以根据键获取值
            String value = mp.get(key);
            System.out.println(key + "=" + value);

        }
    }
}
