package Dates.Tests;

import java.time.*;
import java.util.Map;

public class ZoneTest {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
       ZoneId tokyozone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyozone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyozone);
        System.out.println(zonedDateTime);

        Instant nowIntant = Instant.now();
        System.out.println(nowIntant);
        ZonedDateTime zonedDateTime1 = nowIntant.atZone(tokyozone);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset ofSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(ofSetManaus);
        System.out.println(offsetDateTime);

        OffsetDateTime offsetDateTime1 = nowIntant.atOffset(ofSetManaus);
        System.out.println(offsetDateTime1);



    }
}
