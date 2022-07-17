package classwork.dateClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class DateDemo {
    static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.CANADA);
    //SimpleDateFormat sdf = new SimpleDateFormat("MMMM/dd/yy hh:mm:ss", new Locale("hy"));

    public static void main(String[] args) {
        Date now = new Date();
        String format = sdf.format(now);
        System.out.println(format);


        String dateStr = "02/06/2022";
        Date dateParse = null;
        try {
            dateParse = sdf.parse(dateStr);
            System.out.println(dateParse);
        } catch (ParseException e) {
            System.out.println("Please use this format: MM/dd/yyyy");
        }
    }
}
