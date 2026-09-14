package a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        键盘录入
        键盘录入一些1~100之间的整数，并添加到集合中
        直到集合中所有数据和超过200为止
         */

        //1.创建一个集合
        ArrayList<Integer> list = new ArrayList<>();
        //2.键盘录入数据添加到集合中
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入范围1~100之间的整数：");
            String s = sc.nextLine();
            //代码底层使用了自动装箱
            int number = Integer.parseInt(s);
            //先把异常数据过滤掉
            if (number < 1 || number > 100){
                System.out.println("当前数字不在1~100范围内，请重新输入");
                continue;
            }
            //添加数据到集合中
            list.add(number);
            //对数据总和进行判断
            int sum = getSum(list);

            //在对sum的总和进行判断
            if (sum > 200){
                System.out.println("集合中所有数据满足条件要求");
                break;
            }
        }

    }

    // 对数据总和进行判断
    private static int getSum(ArrayList<Integer> list) {
        //将集合中所有数据进行相加
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int i1 = list.get(i);
            sum += i1;
        }
        return sum;
    }
}
