import java.time.*;
import java.util.Date;


public class DatesExample {
    public static void main(String[] args) {
//        Date d1 = new Date(2021,12,25);
//        System.out.println(d1);
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        //plus/minus - time(hours, minutes,sec,nano)
        System.out.println(lt.plusHours(21));
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate ld2 = LocalDate.of(2023,Month.DECEMBER,25);
        System.out.println(ld2);
//        plus/minus date(day,week,months, years)
        System.out.println(ld2.plusWeeks(1));
        LocalTime lt2 = LocalTime.of(12,00,0);
        System.out.println(lt2);
//        LocalDateTime ldt2 = LocalDateTime.of(2023,12,25,12,30);
        LocalDateTime ldt2 = LocalDateTime.of(ld2,lt2);
        System.out.println(ldt);
        System.out.println(ldt.minusDays(100));
    }
}
