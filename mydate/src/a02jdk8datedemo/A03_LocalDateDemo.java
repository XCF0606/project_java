package a02jdk8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class A03_LocalDateDemo {
    public static void main(String[] args) {
       //1.获取当前时间的日历对象（包含 年月日）
        LocalDate ldDate = LocalDate.of(2026, 1, 1);

        LocalDate ldDate2 = LocalDate.of(2025, 1, 1);
        System.out.println(ldDate);

        System.out.println("=======================get方法获取==========================");

        //2.get系列方法获取日历中的每一个属性值
        //年
        int year = ldDate.getYear();
        System.out.println(year);

        //月
        Month month = ldDate.getMonth();
        //方式一
        //会产生一个对象，打印出来的结果是英文
        System.out.println(month); //JANUARY
        //如果想要数字的形式
        System.out.println(month.getValue()); //1

        //方式二
        System.out.println(ldDate.getMonthValue());//1

        //日
        int dayOfMonth = ldDate.getDayOfMonth();
        System.out.println(dayOfMonth); //1

        //方式二
        System.out.println(ldDate.getDayOfMonth());//1


        System.out.println("=======================is判断==========================");
        System.out.println(ldDate.isAfter(ldDate2)); //之后
        System.out.println(ldDate.isBefore(ldDate2)); //之前

        //wish开头的方法表示修改，只能修改年月日
        LocalDate wishLocalDate = ldDate.withYear(2000);
        System.out.println(wishLocalDate); //2000-01-01
        System.out.println(wishLocalDate == ldDate); //false，会产生一个新的Local对象

        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);
        System.out.println(minusLocalDate);

        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusYears(5);
        System.out.println(plusLocalDate);

        // 判断今天是否是你的生日
        LocalDate myBirMd = LocalDate.of(2002, 6, 6);
        LocalDate nowTime = LocalDate.now();

        MonthDay birMd = MonthDay.of(myBirMd.getMonthValue(), myBirMd.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowTime);

        System.out.println("今天是你生日吗？" + birMd.equals(nowMd));


    }
}
