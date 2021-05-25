import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class calendar {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf1.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4); //Acrescentar hora por exemplo
        d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH); //Janeiro mes zero entao sempre month+1
        System.out.println(sdf1.format(d));
        System.out.println("Minutes: "+minutes);
        System.out.println("Month: "+mes);
    }
}