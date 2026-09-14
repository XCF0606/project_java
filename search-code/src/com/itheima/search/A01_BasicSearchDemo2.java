package com.itheima.search;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //练习题1：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复

        //1.定义一个数组
        int[] arr = {131, 127, 147, 159, 136, 264, 453};
        int number = 333;

        System.out.println(getArrayIndex(arr, number));


    }

    //需要的参数：
    //1.数组
    //2.要查询数字
    //3.返回的是索引位置哦
    public static int getArrayIndex(int[] arr, int number) {
        //首先遍历数组，拿到每一个数字
        for (int i = 0; i < arr.length; i++) {
            //对数组中的数字，与要查询的数字进行比较
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
