package Tests;
import java.util.Calendar;

public class CalendarTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(hour + " часов " + minute + " минут " + second + " секунд");
    }
}
