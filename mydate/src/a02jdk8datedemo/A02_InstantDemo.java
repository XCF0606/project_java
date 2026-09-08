package a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {

        /*
        static Instant now()                        获取当前时间的Instant对象（标准时间）
        static Instant ofXxxx(long epochMilli)      根据（秒/毫秒/纳秒）获取Instant对象
        ZoneDateTime atZone(ZoneId zone)            指定时区
        boolean isXxx(Instant otherInstant)         判断系列的方法
        Instant minusXxx(long millisToSubract)      减少时间系列的方法
        Instant plusXxx(long millisToSubract)       增加时间系列的方法
         */

        //1.获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);

        //2.根据（秒/毫秒/纳秒）获取Instant对象
        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);   //加1分钟

        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant2);   //1970-01-01T00:00:02Z 原有基础上加2分

        //3.指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //4.isXXX判断
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);

        System.out.println(instant3);
        System.out.println(instant4);

        //5.判断instant3时间在不在instant4前面 在，返回true 反之false
        boolean result1 = instant3.isBefore(instant4);
        System.out.println(result1); //true

        // 判断instant4时间在不在instant5后面 在，返回true 反之false
        Instant instant5 = Instant.ofEpochMilli(0L);
        Instant instant6 = Instant.ofEpochMilli(10000L);

        boolean after = instant5.isAfter(instant6);
        System.out.println(after);

        //6.Instant minusXxx(long millisToSubstract)    减少时间系列的方法
        Instant instant7 = Instant.ofEpochMilli(3000L);
        System.out.println(instant7);   //1970-01-01T00:00:03Z
        Instant instant8 = instant7.minusSeconds(1);
        System.out.println(instant8);   //1970-01-01T00:00:02Z


    }
}
