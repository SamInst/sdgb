package Dates.Tests;

public class LettersToSimpleDateFormat {
    public static void main(String[] args) {
        System.out.println("""
                ___________________________________________________________________________________________________________________
                Letter  | Date or time Component                        | Presentation     | Examples                              |
                -------------------------------------------------------------------------------------------------------------------|
                G       | Era designator                                |Text              |AD                                     |
                y       | year                                          |Year              |1996; 96                               |
                Y       | Week year                                     |Year              |2009; 09                               |
                M       | Month in year(context sensitive)              |Month             |July; Jul; 07                          |
                L       | Month in year (standalone form)               |Month             |July; Jul; 07                          |
                w       | Week in year                                  |Number            |27                                     |
                W       | Week in month                                 |Number            |2                                      |
                D       | Day in year                                   |Number            |189                                    |
                d       | day in month                                  |Number            |10                                     |
                F       | Day of week in month                          |Number            |2                                      |
                E       | Day name in week                              |Text              |Tuesday; true                          |
                u       | Day number of week (1=monday..., 7 = sunday)  |Number            |1                                      |
                a       | M/PM marker                                   |Text              |PM                                     |
                H       | Hour in day (0-23)                            |Number            |0                                      |
                k       | Hour in day (1-24)                            |Number            |24                                     |
                K       | Hour in am/pm (0-11)                          |Number            |0                                      |
                h       | Hour in am/pm (1-12)                          |Number            |12                                     |
                m       | minute in hour                                |Number            |30                                     |
                s       | second in minute                              |Number            |55                                     |
                S       | millisecond                                   |Number            |978                                    |
                z       | time zone                                     |General time zone |Pacific Standard Time; PST; GMT-08:00  |
                Z       | time zone                                     |RFC 822 time zone |-0800                                  |
                X       |  time zone                                    |ISO 8601 time zone|-08; -0800; -08:00                     |
                --------------------------------------------------------------------------------------------------------------------
                
                
                
                
                
                
                
                
                """);
    }

}
