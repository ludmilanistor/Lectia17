import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.*;
public class Main {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now()+" "+LocalTime.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(ZonedDateTime.now());
        System.out.println("Exerciții practice");
        //System.out.println(" ");
        System.out.println("1.Creați o LocalDate care va reprezenta data de 2 ianuarie 2024");
        LocalDate date = LocalDate.of(2024, Month.JANUARY,2);
        System.out.println(date);
        //System.out.println(" ");
        System.out.println("2.Creați o LocalTime care va reprezenta ora 13:20");
        LocalTime time = LocalTime .of (13,20);
        System.out.println(time);
        //System.out.println(" ");
        System.out.println("3.Creați o LocalDateTime care va reprezenta data de 2 ianuarie 2024 ora 13:20");
        LocalDateTime localDateTime = LocalDateTime.of(2024,Month.JANUARY,2,13,20);
        //System.out.println(localDateTime);
        System.out.println(date+" "+time);
        //System.out.println(" ");
        System.out.println("4.Creați o ZoneDateTime care va reprezenta data de 2 ianuarie 2024 ora 13:20 în America");
//         for ( String zone : ZoneId.getAvailableZoneIds()){
//             System.out.println(zone);}
        ZoneId zone = ZoneId.of("America/Montreal");
        ZonedDateTime zonedatetime = ZonedDateTime.of(localDateTime,zone);
        //System.out.println(zonedatetime);
        System.out.println(date+" "+time+" "+zone);
        //System.out.println(" ");
        System.out.println("5.Adăugați un minut, o ora, o zi, un an, la data de mai sus");
        time = time.plusMinutes(1);
        System.out.println("ora initala plus un minut acum este - " + time);
        time = time.plusHours(1);
        time = time.minusMinutes(1);
        System.out.println("ora initala plus o ora acum este - " + time);
        date = date.plusDays(1);
        System.out.println("data initala plus o zi acum este - " + date);
        date = date.plusYears(1);
        date = date.minusDays(1);
        System.out.println("anul inital plus un an acum este - " + date);
    }
}
