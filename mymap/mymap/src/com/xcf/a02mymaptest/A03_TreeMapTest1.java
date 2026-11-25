package com.xcf.a02mymaptest;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class A03_TreeMapTest1 {
    public static void main(String[] args) {
        // 需求1：
        //键：整数表示id
        //值：字符串表示商品名称
        //要求：按照id的升序排列，按照id的降序排列

        //1.创建集合
        //Integer Double 默认情况下都是按照升序排列的
        //String 按照字母在ASCII码表中对应的数字升序进行排列
        TreeMap<Integer, String> tmp = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1：当前要添加的元素
                //o2：表示已经在红黑树中存在的元素
                return o2 - o1; //这是降序
            }
        });

        //2.添加元素
        tmp.put(1, "RTX5070显卡");
        tmp.put(2, "电动汽车");
        tmp.put(3, "键盘");
        tmp.put(4, "鼠标");

        System.out.println(tmp);  //{4=鼠标, 3=键盘, 2=电动汽车, 1=RTX5070显卡}





    }
}
