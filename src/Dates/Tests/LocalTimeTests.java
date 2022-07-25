package Dates.Tests;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTests {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timenow = LocalTime.now();
        System.out.println(time);
        System.out.println(timenow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(time.get(ChronoField.CLOCK_HOUR_OF_AMPM));
    }
}
