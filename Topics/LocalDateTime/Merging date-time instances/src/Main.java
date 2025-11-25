import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // write your code here
        LocalDate date1= dateTime1.toLocalDate();
        LocalTime time1 = dateTime1.toLocalTime();
        LocalDate date2 = dateTime2.toLocalDate();
        LocalTime time2 = dateTime2.toLocalTime();
        int day;
        int month;
        int year;
        int hour;
        int minute;
        int second;

        day = Math.max(date1.getDayOfMonth(), date2.getDayOfMonth());
        month = Math.max(date1.getMonthValue(), date2.getMonthValue());
        year = Math.max(date1.getYear(), date2.getYear());
        hour = Math.max(time1.getHour(), time2.getHour());
        minute = Math.max(time1.getMinute(), time2.getMinute());
        second = Math.max(time1.getSecond(), time2.getSecond());

        return LocalDateTime.of(year,month,day,hour,minute,second);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}