package Dates.Tests;

import java.util.Calendar;
import java.util.Date;

public class CalendarTestd {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("sunday is the first day of the week");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // calculate which day of week is sunday(defined on scope above)
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); // calculate which day of month is sunday(defined on scope above)
        System.out.println(c.get(Calendar.DAY_OF_YEAR)); // calculate which day of year is sunday(defined on scope above)
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // calculate which day of week is sunday in one month(defined on scope above)


        c.add(Calendar.DAY_OF_MONTH, 1); // add one day in the actual day.
        c.add(Calendar.HOUR,12); // add hours to respective hour(change the day if the count is above 24Hrs from the actual day)

        System.out.println(c);
    }
}
