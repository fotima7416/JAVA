package OOP.Foundtion.day6;
import java.util.Calendar;
public class Calendar2 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        // Print Calendar's field
        System.out.println("Year: \t" + cal.get(Calendar.YEAR));
        System.out.println("Month: \t" + cal.get(Calendar.MONTH));
        System.out.println("Day of Month: \t" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week: \t" + cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour of the Day: \t" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: \t" + cal.get(Calendar.MINUTE));
        System.out.println("Second: \t" + cal.get(Calendar.SECOND));
        System.out.println("AM PM: \t" + cal.get(Calendar.AM_PM));
        
    }
}
