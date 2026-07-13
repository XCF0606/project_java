package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {

         /*
    public BigInteger(int num, Random rnd)      获取随机大整数，范围：[0 ~ 2的num次方-1]
    public BigInteger(String val)               获取指定的大整数
    public BigInteger(String val, int radix)    获取指定进制的大整数

    public static BigInteger valueOf(long val)   静态方法获取BigInteger的对象，内部有优化
    细节：
        对象一旦创建里面的数据不能发生改变

     */

        //1.获取一个随机的大整数
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            // r是Random对象
            BigInteger bd1 = new BigInteger(4, r);
            System.out.println(bd1);
        }

        //2.获取一个指定的大整数
        //细节：字符串中必须是证书，否则会报错
        BigInteger bd2 = new BigInteger("1433223");
        System.out.println(bd2);

        //BigInteger bd3 = new BigInteger("abc");
        //System.out.println(bd3); //报错

        //3.获取指定进制的大整数（不常用）
        //细节：
        //1.字符串中的数组必须是证书
        //2.字符串中的数字必须要跟进制吻合（比如二进制：0、1）
        BigInteger bd4 = new BigInteger("1000", 2);
        System.out.println(bd4);

        //BigInteger bd5 = new BigInteger("132", 2);
        //System.out.println(bd5); //报错


        //4.静态方法获取BigInteger的对象，内部有优化
        //细节：
        //1.能表示范围比较小，只能再long的取值范围之内，如果超出long的范围就不行了
        //2.再内部对常用的数字：-16~16 进行了优化
        //提前把-16~16先创建好，BigInteger的对象，如果多次获取不会重新创建新的
        BigInteger bd6 = BigInteger.valueOf(16);
        BigInteger bd7 = BigInteger.valueOf(16);

        System.out.println(bd6 == bd7); //true 因为地址值一样


        BigInteger bd8 = BigInteger.valueOf(17);
        BigInteger bd9 = BigInteger.valueOf(17);

        System.out.println(bd8 == bd9); //false 因为地址值不一样，这是重新创建出来的


    }
}
