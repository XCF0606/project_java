package a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04_SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
        假设，你的初恋的出生年月日为：2000-11-11
        请用字符串表示这个数据，并将其转换为：2000年11月11日
         */

        String str = "2000-11-11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date parse = sdf.parse(str);
        System.out.println(parse);

        String format = sdf.format(parse);
        System.out.println(format);



    }
}
