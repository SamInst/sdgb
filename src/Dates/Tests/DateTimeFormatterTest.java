package Dates.Tests;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 =date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 =date.format(DateTimeFormatter.ISO_DATE);
        String s3 =date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("20210219", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("20210219", DateTimeFormatter.ISO_LOCAL_DATE);


        System.out.println(parse);
        System.out.println(parse2);
        System.out.println(parse3);



    }
}
