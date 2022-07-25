package Dates.Tests;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime  birthdaySam = LocalDateTime.of(1990, Month.NOVEMBER, 16,9, 45, 0);
        //861919
        //865170
        //876305
        //894323
        //944770
        //8820
        //9825


        LocalDateTime now = LocalDateTime.now();
        System.out.println("Data of Sam: ");
        System.out.println("Seconds: "+ChronoUnit.SECONDS.between(birthdaySam,now));
        System.out.println("Hours: "+ChronoUnit.HOURS.between(birthdaySam,now));
        System.out.println("Days: "+ChronoUnit.DAYS.between(birthdaySam,now));
        System.out.println("Weeks: "+ChronoUnit.WEEKS.between(birthdaySam,now));
        System.out.println("Months: "+ChronoUnit.MONTHS.between(birthdaySam,now));
        System.out.println("Years: "+ChronoUnit.YEARS.between(birthdaySam,now));

        System.out.println("---------------");
        LocalDateTime  birthdayDevisu = LocalDateTime.of(2000, Month.APRIL, 20 ,8, 30, 0);
        System.out.println("Data of Devisu: ");
        System.out.println("Seconds: "+ChronoUnit.SECONDS.between(birthdayDevisu,now));
        System.out.println("Hours: "+ChronoUnit.HOURS.between(birthdayDevisu,now));
        System.out.println("Days: "+ChronoUnit.DAYS.between(birthdayDevisu,now));
        System.out.println("Weeks: "+ChronoUnit.WEEKS.between(birthdayDevisu,now));
        System.out.println("Months: "+ChronoUnit.MONTHS.between(birthdayDevisu,now));
        System.out.println("Years: "+ChronoUnit.YEARS.between(birthdayDevisu,now));

        LocalDateTime  birthdayYgor = LocalDateTime.of(2000, Month.MARCH, 5, 8,20);
        System.out.println("--------");
        System.out.println("Data of Ygor: ");
        System.out.println("Seconds: "+ChronoUnit.SECONDS.between(birthdayYgor,now));
        System.out.println("Hours: "+ChronoUnit.HOURS.between(birthdayYgor,now));
        System.out.println("Days: "+ChronoUnit.DAYS.between(birthdayYgor,now));
        System.out.println("Weeks: "+ChronoUnit.WEEKS.between(birthdayYgor,now));
        System.out.println("Months: "+ChronoUnit.MONTHS.between(birthdayYgor,now));
        System.out.println("Years: "+ChronoUnit.YEARS.between(birthdayYgor,now));


    }
}
