package com.itheima.a01mathdemo;

public class MathDemo1 {
    public static void main(String[] args) {
        /*

        public static int    abs(int a)    获取参数绝对值
        public static double ceil(double a)    向上取整
        public static double floor(double a)    向下取整
        public static int round(float a)    四舍五入
        public static int max(int a,int b)    获取两个int值中的较大值
        public static double pow(double a,double b)    返回a的b次幂的值
        public static double sqrt(double a)    返回a的平方根
        public static double cbrt(double a)    返回a的立方根
        public static double random()    返回值为double的随机值，范围[0.0,1.0)

         */

        //abs 获取参数绝对值
        System.out.println(Math.abs(88)); //88
        System.out.println(Math.abs(-88)); //88
        //bug
        // 以int类型为例，取值范围：-2147483648 ~ 2147483647
        // 如果没有正数与负数与之对应，那么传递负数结果有误
        // -2147483648 没有正数与之对应，所以abs结果产生bug
        System.out.println(Math.abs(-2147483648)); //-2147483648

        System.out.println("--------------------------------------------");

        // ceil 向上取整
        System.out.println(Math.ceil(12.34)); //13.0
        System.out.println(Math.ceil(12.64)); //13.0
        System.out.println(Math.ceil(-12.34)); //-12.0
        System.out.println(Math.ceil(-12.64)); // 12.0

        System.out.println("--------------------------------------------");

        //floor 去尾法 向下取整 向负无穷大方向获取距离最近的整数
        System.out.println(Math.floor(12.34)); //12
        System.out.println(Math.floor(12.64)); //12
        System.out.println(Math.floor(-13.34)); //14
        System.out.println(Math.floor(-13.64)); //14

        System.out.println("--------------------------------------------");

        //round 四舍五入
        System.out.println(Math.floor(12.34)); //12.0
        System.out.println(Math.floor(12.64)); //12.0
        System.out.println(Math.floor(-13.34)); //-14.0
        System.out.println(Math.floor(-13.64)); //-14.0


        System.out.println("--------------------------------------------");

        //max 获取两个整数的最大值
        System.out.println(Math.max(12.34, 13.56));
        System.out.println(Math.max(10, 5));

        System.out.println("--------------------------------------------");

        //pow 获取a的b次幂
        System.out.println(Math.pow(2, 3)); //8
        // 细节：
        // 如果第二个参数 0 ~ 1之间的小数
        System.out.println(Math.pow(4, 0.5)); //2.0
        System.out.println(Math.pow(2, -2)); //0.25

        System.out.println(Math.sqrt(2)); //4
        System.out.println(Math.cbrt(2)); //6

        System.out.println("--------------------------------------------");
        // random 返回为double的随机值，范围[0.0, 1.0]
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

    }
}
