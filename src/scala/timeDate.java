package scala;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by danny on 2017/7/30.
 */
public class timeDate {
    public static void main(String[] args)throws ParseException {

        String timeString = "2199-01-02 21:22:45";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
// String to Date

        Date stringDate =  sdf.parse(timeString);
        System.out.println("string to Date is :"+sdf.format(stringDate));

// Calendar to String
        Calendar calendar = Calendar.getInstance();
        String dateStr = sdf.format(calendar.getTime());
        System.out.println("Calendar to String" + dateStr);

//String to Calendar
        Date date = sdf.parse(timeString);
        Calendar strCalendar = Calendar.getInstance();
        strCalendar.setTime(date);
        System.out.println("string to calendar "+ strCalendar.getTime());

//

// java.util.Date format to get time add
        Date d =  new Date();
        System.out.println("today is : "+ sdf.format(d));
        System.out.println("yesterday is :" + sdf.format(new Date(d.getTime()-24*60*60*1000)));
        System.out.println("tomorrow is :" + sdf.format( d.getTime()+ 24*60*60*1000));
        Date utilData =new Date(d.getTime()+ 24*60*60*1000);
        System.out.println("utilDate is :" + sdf.format(utilData));
//----------------------------------

//java.util.Calendar to set date time
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(cal.YEAR,1);
        cal.add(cal.MONDAY,2);
        cal.add(cal.DAY_OF_YEAR,2);
        cal.getTime();
         Date ddd=  cal.getTime();
         System.out.println("result of ddd is : " +ddd );
//-----------------------------------------------------------
    }
}
