package com.itheima.search;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //核心：
        //从0索引开始挨个往后查找

        //需求：定义一个方法利用基本查找，查询某个元素是否存在
        //数据如下：{131, 127, 147, 159, 136, 264, 453}

        int[] arr = {131, 127, 147, 159, 136, 264, 453};
        int number = 132;
        System.out.println(basicSearch(arr, number));

    }


    //参数：
    //1.数组
    //2.要查找的元素
    //元素是否存在
    public static boolean basicSearch(int[] arr, int number){
        //利用基本查找法循环便利arr数组中的每一个数据，与number进行比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
