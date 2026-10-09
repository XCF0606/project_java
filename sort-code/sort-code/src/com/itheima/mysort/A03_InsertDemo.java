package com.itheima.mysort;

public class A03_InsertDemo {
    public static void main(String[] args) {
        /*
        插入排序：
            将0索引的元素到N索引的元素看作是有序的，把N+1索引的元素到最后一个当成是无序的
            遍历无序的数据，将遍历的元素插入有序序列中适当的位置，如遇到相同的数据，插在后面
            N的范围：0~最大索引

         */

        int[] arr = {3, 44, 38, 7, 78, 95, 4, 12, 56, 23};

        //1.找到无序的那一组数据是从那个索引开始的
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }

        //2.便利无序的数据，将便利的元素插入到有序序列中适当的位置
        for (int i = startIndex; i < arr.length; i++) {
            //问题：如何把遍历到的数据，插入到前面有序的这一组当中

            //记录当前要插入数据的索引
            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]){
                //交换位置
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
                j--;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
