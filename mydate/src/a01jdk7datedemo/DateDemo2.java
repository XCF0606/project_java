package a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        //需求1：打印时间原点开始一年之后的时间
        //计算一年的时间
        Date d1 = new Date();

        //首先计算一年的时间  1000毫秒等于1秒 1分钟等于60秒   1小时等于60分钟    一天等于24小时
        Long time = 1000L * 60 * 60 * 24 * 365;

        //设置时间
        d1.setTime(time);

        //获取到一年之后的时间
        System.out.println(d1);


        //需求2：定义任意两个Date对象，比较一下哪个时间在前，那个时间在后
        // 生成随机数
        Random r = new Random();
        //创建两个date对象
        Date d2 = new Date();
        Date d3 = new Date();

        //随机赋值两个数
        d2.setTime(r.nextInt());
        d3.setTime(r.nextInt());

        long time1 = d2.getTime();
        long time2 = d3.getTime();

        if (time1 > time2){
            System.out.println("第一个时间比第二个时间靠后");
        } else if (time1 < time) {
            System.out.println("第二个时间比第一个时间靠后");
        }else {
            System.out.println("二者时间相同");
        }


    }
}
