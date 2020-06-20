package dateMehtod;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author llf
 * @type
 * @create 2020/6/20 22:57
 * @description 对以后的日期的操作
 */
public class LaterDate {
    public static void main(String[] args) {
        //增加俩小时
        LocalTime now = LocalTime.now();
        LocalTime laterTime = now.plusHours(2);

        System.out.println("两个小时以后的时间为：" + laterTime);

        //计算一周后的时间
        LocalTime nextWeekTime = now.plus(1, ChronoUnit.WEEKS);

        //计算一年前的时间
        LocalTime preYear = now.minus(1, ChronoUnit.YEARS);
        //计算下一年的时间
        LocalTime laterYear = now.plus(1, ChronoUnit.YEARS);

    }
}
