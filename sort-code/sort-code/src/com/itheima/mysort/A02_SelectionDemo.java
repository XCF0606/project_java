package com.itheima.mysort;

public class A02_SelectionDemo {
    public static void main(String[] args) {
        /*
        选择排序：
        1.从0索引开始，跟后面的元素一一比较
        2.小的放前面，大的放后面
        3.第一次循环结束后，最小的数据已经确定
        4.第二次循环从索引1开始，以此类推
         */

        //1.定义数组
        int[] arr = {2, 3, 5, 1, 4};

        //2.利用排序选择让数组变成1 2 3 4 5

        //第一次外循环，用来确定轮次，我用这个索引上的数字跟谁去比较
        //最后一次不需要比较，因为其他的已经比较完了
        for (int i = 0; i < arr.length - 1; i++) {
            // i+1：我要拿第一个i上的索引与第二个j上的索引进行比较
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
