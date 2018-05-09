import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {

    public static void main(String[] args) {
        DateFormat dtf = new SimpleDateFormat("HH:mm:ss");
        Calendar time = Calendar.getInstance();
        System.out.println("Kellaaeg on " + dtf.format(time.getTime())/* + "," +System.currentTimeMillis() % 1000*/);
    }
}
