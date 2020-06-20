package dateMehtod;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author llf
 * @type
 * @create 2020/6/20 23:07
 * @description 不太常用的时间工具类
 */
public class DateUtils {

    
    /** 
     * @Description: 获取时间戳
     * @Param: 
     * @return:  
     * @Author: llf
     * @Date:  2020年6月20日
     */
    public void lockTime(){
        //根据系统时间返回当前时间并设置UTC
        Clock clock = Clock.systemUTC();

        //根据系统时钟区域返回时间
        Clock systemDefaultZone = Clock.systemDefaultZone();
    }

    //判断日期早于/晚于另一个日期
    public void compareDate(){
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 6, 20);

        boolean after = now.isAfter(localDate);
        boolean before = now.isBefore(localDate);

        LocalDate minus = localDate.minus(1, ChronoUnit.DAYS);

        boolean nowBefore = now.isBefore(minus);

    }

    //获得特定时区时间
    public void getZoneTime() {
        ZoneId zoneNewYork = ZoneId.of("America/New_York");
        LocalDateTime nowDate = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.from(nowDate), zoneNewYork);

    }

    //处理特定的日期
    public void yearMonth(){
        YearMonth yearMonth = YearMonth.now();
        int lengthOfMonth = yearMonth.lengthOfMonth();// 这个月有多少天

        YearMonth specialDate = YearMonth.of(2020, Month.MARCH);
    }

    //判断当前年是否是闰年
    public void isLeapYear() {
        LocalDate localDate = LocalDate.now();
        boolean leapYear = localDate.isLeapYear();
    }

    //计算两个日期之间的天数和月数
    public void calDateDays(){
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 6, 10);
        Period between = Period.between(now, localDate);
        int betweenMonths = between.getMonths();
        int days = between.getDays();

    }

    //获取当前时间戳
    public void getTimestap(){
        Instant instant = Instant.now();
    }

    //格式化日期
    public void formatDate() {
        String date = "20200620";
        LocalDate parse = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
    }
}
