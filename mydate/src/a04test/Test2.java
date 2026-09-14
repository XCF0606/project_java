package a04test;

public class Test2 {
    public static void main(String[] args) {
        /*
          实现parseInt方法的效果，将字符串形式的数据转成整数。
          要求：
            字符串只能是数字不能有其他字符
            最少1位，最多10位
            0不能开头
     */
        //1.创建一个字符串
        String str = "123456789";

        //2.判断字符串是否符合
        //习惯：先把异常数据进行过滤，剩下来就是正常的数据
        if (!str.matches("[1-9]\\d{0,9}")) {
            //错误的数据
            System.out.println("数据错误");
        }else {
            //正确的数据
            System.out.println("字符正确");
            //定义一个变量，表示最终的结果
            int number = 0;
            //便利字符串中所有数字，获取出来
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                number = number * 10 + c;
            }
            //'1' --> 1
            System.out.println(number);
        }

    }
}
