package jdk8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * jdk8 增加全新的时间时期API
 * @ClassName TimeDemo
 * @Author yaochaochen
 * @Date 2019-04-03 13:57
 **/
public class TimeDemo {
    
    public void timeDemo() {
        //Clock时钟
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        //获取指定时间点 用Instant 
        Instant instant = clock.instant();
        //也可以取Date
        Date legacyDate = Date.from(instant);
        
        //在新API中时区使用ZoneId来表示。

        ZoneId.getAvailableZoneIds();
        ZoneId zoneId1 = ZoneId.of("Europe/Berlin");
        ZoneId zoneId2 = ZoneId.of("Brazil/East");
        System.out.println(zoneId1.getRules());
        
       //LocalTime 本地时间
        LocalTime localTime = LocalTime.now(zoneId1);
        LocalTime localTime1 = LocalTime.now(zoneId2);
        long hours = ChronoUnit.HOURS.between(localTime1,localTime);
        System.out.println(hours);
        
        //LocalTime 提供了多种工厂方法来简化对象的创建，包括解析时间字符串。
        LocalTime localTime2= LocalTime.of(23, 59, 59);
        System.out.println(localTime);// 23:59:59
        DateTimeFormatter germanFormatte = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
        String leetTime = localTime2.format(germanFormatte).toString();
        System.out.println(leetTime);
        
        //LocalDate 本地日期 LocalDateTime 本地日期时间
        
    }  
}
