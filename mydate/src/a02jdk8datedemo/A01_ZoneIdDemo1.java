package a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIdDemo1 {
    public static void main(String[] args) {
        /*
        static Set<String> getAvailableZoneIds()
        static ZoneId systemDefault()
        static ZoneId of(String zoneId)
         */

        //1.获取所有的时区名称
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());    //604
        System.out.println(availableZoneIds);   //Asiz/Shanghai

        //2.获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId); //Asia/Shanghai

        //3.获取指定的时区
        ZoneId zoneId1 = ZoneId.of("Africa/Nairobi");
        System.out.println(zoneId1);

    }
}
