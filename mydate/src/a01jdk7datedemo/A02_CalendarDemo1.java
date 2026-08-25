package a01jdk7datedemo;


import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.YEAR;

public class A02_CalendarDemo1 {
    public static void main(String[] args) {

        // 细节：Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        Calendar calendar = Calendar.getInstance();

        // 获取日期对象（获取的时间是当前的时间）
        Date time = calendar.getTime();



        //取日期中的某个字段信息
        int year = calendar.get(YEAR);
        System.out.println(year);

        //修改日历的某个字段信息
        calendar.set(YEAR, 2027);
        int year2 = calendar.get(YEAR);
        System.out.println(year2);



    }
}
