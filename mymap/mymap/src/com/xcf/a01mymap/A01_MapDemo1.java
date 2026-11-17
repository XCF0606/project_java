package com.xcf.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*
        V put(K key, V value)                   添加元素
        V remove(Object K)                      根据键删除键值元素
        void clear()                            移除所有的键值对元素
        boolean containsKey(Object Key)         判断集合是否包含指定的键
        boolean containsValue(Object Value)     判断集合是否包含指定的值
        boolean isEmpty()                       判断集合是否为空
        int size()                              集合的长度，也就是集合中键值对的个数
         */

        //1.创建Map集合的对象
        // put 方法细节
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回null（因为第一次添加，没有覆盖，所以没有需要返回的值）
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        Map<String, String> mp = new HashMap<>();

        //2.添加元素
        mp.put("奥特之父", "奥特之母");
        mp.put("猿飞阿斯玛", "夕日红");
        mp.put("赛文", "赛罗");
        System.out.println(mp); //{奥特之父=奥特之母, 猿飞阿斯玛=夕日红, 赛文=赛罗}

        //3.根据键删除元素
        String reslut = mp.remove("奥特之父");
        System.out.println(reslut); //reslut
        System.out.println(mp); //{猿飞阿斯玛=夕日红, 赛文=赛罗}

        //4.clear 移除所有元素
        //mp.clear();
        System.out.println(mp); //{}

        //5.判断集合是否包含指定的键
        boolean keyResult = mp.containsKey("赛文");
        System.out.println(keyResult); //true

        //6.判断集合是否包含指定的值
        boolean valueResult = mp.containsValue("于谦");
        System.out.println(valueResult); //false


    }
}
