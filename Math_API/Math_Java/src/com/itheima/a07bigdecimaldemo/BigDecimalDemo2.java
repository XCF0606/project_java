package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        /*
        构造方法获取BigDecimal对象
            public BigDecimal(double val)
            public BigDecimal(String val)

         静态方法获取BigDecimal对象
            public static BigDecimal valueOf(double val)

          */

        //1.通过传递double类型的小数来创建对象
        //细节：
        //这种方式有可能是不精确的，所以不建议使用
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1);    //0.01000000000000000020816681711721685132943093776702880859375
        System.out.println(bd2);    //0.0899999999999999966693309261245303787291049957275390625

        //2.通过传递字符串表示的小数来创建对象
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");

        System.out.println(bd3);    //0.01
        System.out.println(bd4);    //0.09

        BigDecimal result = bd3.add(bd4);
        System.out.println(result); //0.10

        //3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6);

        System.out.println(bd6 == bd7); //true
        //细节：
        //1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        //2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        //3.如果我们传递的是0~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new
        //4.如果传递的是小数，例如10.0也会重新创建地址






    }
}
