package com.itheima.a08regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*
        假如现在要求校验一个qq号码是否正确
        规则：6位及20位之内，0不能在开头，必须全部是数字
        先使用目前所学知识完成校验需求
        然后再使用正则表达式
         */

        String qq = "1234567890";

        boolean result = checkQQ(qq);
        System.out.println(result);


    }


    public static boolean checkQQ(String qq) {
        //首先判断长度是否正确
        int length = qq.length();

        if (length < 6 || length > 20) {
            return false;
        }

        //获取数组第一个数字，判断是否为0
        if (qq.startsWith("0")){
            return false;
        }

        for (int i = 0; i < length; i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }

        return true;
    }


}


