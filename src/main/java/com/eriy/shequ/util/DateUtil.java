package com.eriy.shequ.util;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具
 *
 * @author sunny
 * @create 2018/2/28 17:50
 **/
public class DateUtil {

    public static int getWeekOfYear(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }


    public static void main(String[] args) throws ParseException {
        LocalDate localDate = LocalDate.of(2018,1,30);

        System.out.println(localDate.minusDays(localDate.getDayOfWeek().getValue()));
        System.out.println(localDate.minusDays(localDate.getDayOfWeek().getValue()+7));
        System.out.println(localDate.minusDays(localDate.getDayOfWeek().getValue()+28));
    }
}
