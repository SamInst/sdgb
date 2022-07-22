package Dates.Tests;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(date.getTime());
        System.out.println(date);
    }
}
