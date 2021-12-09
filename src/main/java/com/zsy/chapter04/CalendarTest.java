package com.zsy.chapter04;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        // 实现的功能：打印当前月份的日历，并在当天的日期上标记个*

        LocalDate date = LocalDate.now();
        // 获取当前的月和日
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        // 获得月初日期
        date = date.minusDays(today - 1);
        // 获取月初日期对应的星期几
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        // 打印一周的星期缩写
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        // 第一天需要进行缩进
        for (int i = 1; i < value; i++) {
            System.out.println(" ");
        }
        // 进入循环体，开始打印日历，直到这个月结束
        // 已经直到当前月的首日期，并且知道当前月份，可以使用月初日期往后加1
        while (date.getMonthValue() == month) {
            // 打印这个日期,%md：m为指定的输出字段的宽度，如果数字小于m，左边会补空格，若大于按照实际输出
            System.out.printf("%3d", date.getDayOfMonth());
            // 判断该日期是否是当天
            if(date.getDayOfMonth()==today){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            // 这个日期往后加1天
            date = date.plusDays(1);
            // 如果不是一周的，需要换行，换个思路，可以考虑如果是一周的第一天
            if (date.getDayOfWeek().getValue() == 1) System.out.println();

        }


    }
}
