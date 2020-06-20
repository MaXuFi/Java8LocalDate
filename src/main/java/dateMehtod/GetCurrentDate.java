package dateMehtod;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 * @author llf
 * @type
 * @create 2020/6/20 0:48
 * @description 获取当前日期及年月日
 */
public class GetCurrentDate {
    public static void main(String[] args) {
        //获取今天的日期
        LocalDate localDate = LocalDate.now();       //2020-06-20
        System.out.println("java 8 Date =" + localDate);

        Date date =new Date();  //Sat Jun 20 00:56:26 CST 2020
        System.out.println("Date = " + date);

        //获取年
        localDate.getYear();
        //获取月份，英文大写
        Month getMonth = localDate.getMonth();
        //获取月份，阿拉伯数字
        int monthValue = localDate.getMonthValue();
        //获取日期
        int dayOfMonth = localDate.getDayOfMonth();

        System.out.println(getMonth + "|||||" + monthValue);

        //传入特定参数创建日期
        LocalDate localDate1 = LocalDate.of(2020, 6, 20);
        //判断两个日期是否相同
        boolean equalsDate = localDate.equals(localDate1);


    }


    public void getCurrentDate() {

    }
}
