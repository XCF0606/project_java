package com.itheima.a02mathdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        /*
        public static void exit(int status)     终止当前运行的 Java 虚拟机
        public static long currenTimeMillis()   返回当前系统的时间毫秒值形式
        public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)    数组拷贝
         */
        // 方法的形参
        // 状态码
        //0：表示当前虚拟机是正常停止
        //非0 ：表示当前虚拟机异常停止
//        System.exit(0);
//        System.out.println("可以看到我吗？");

        long l = System.currentTimeMillis();
        System.out.println(l);

        // 拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr2 = new int[10];
//
//        System.arraycopy(arr1, 0, arr2, 0, 10);
//
//        for (int i : arr2) {
//            System.out.print(i + " ");
//        }

//        System.arraycopy(arr1, 0, arr2, 4, 3);
//        for (int i : arr2) {
//            System.out.print(i + " ");
//        }

        System.arraycopy(arr1,6, arr2,2, 3);
        for (int i : arr2) {
            System.out.print(i + " ");
        }




    }
}
