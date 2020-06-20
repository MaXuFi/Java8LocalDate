package dateMehtod;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * @author llf
 * @type
 * @create 2020/6/20 22:49
 * @description 周期性日期
 */

/**
 * 处理类似生日、纪念日、法定假日及客户要求的固定性日期
 * MothDay 类，月份和日为参数传递，可以用来判断每年都会发生的事件
 *
 */
public class CycleDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 6, 20);

        MonthDay birthday = MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());

        MonthDay fromNowDate = MonthDay.from(now);

        if (birthday.equals(fromNowDate)){
            System.out.println("Today is your birthday!");
        }else {
            System.out.println("Sorry,today is not your birthday!");
        }
    }
}
