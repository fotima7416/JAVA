package OOP.Foundtion.day6;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Time {
    public static void main(String[] args){
        long currentTime = System.currentTimeMillis();
        String time = Instant.ofEpochMilli(1638783912395L)
                .atZone(ZoneId.systemDefault())
                .toLocalDate()
                .toString();
        long startTime = System.nanoTime();

        // Shu yerda qandaydir kod ishlaydi...
        printOldDateDetails();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
//        System.out.println(currentTime);
//        System.out.println(time);
//        System.out.println(duration);
    }
    static void printOldDateDetails(){

        Date date = new Date();

        System.out.println("Year: " + (date.getYear() + 1900));
        System.out.println("Month: " + (date.getMonth()+1));
        System.out.println("Date : " + date.getDate());
        System.out.println("Day of the week: " + (date.getDay()==0?7:date.getDay()));
        System.out.println("Hours: " + date.getHours());
        System.out.println("Minutes: " + date.getMinutes());
        System.out.println("Seconds: " + date.getSeconds());
        ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());

        System.out.println("Time Zone ID: " + now.getZone());
        System.out.println("Offset: " + now.getOffset());    }
    }

