import sourceDate.dateTime;
import org.junit.Test;

import java.util.Calendar;

public class dateTimeTest {

    @Test
    public void testAddDays1() { // test adding day with fix amount of incrementing to the local time
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("The day after increment is: " + cal.getTime());
    }

    @Test
    public void testSubDays1() { // test subtracting day with fix amount of decrementing to the local time
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -15);
        System.out.println("The day after increment is: " + cal.getTime());
    }

    @Test
    public void testAddDay2(){ // test adding day with fix amount of incrementing to the given time period
        int amount = 10;
        dateTime myDate = new dateTime(25, 4, 2019);
        System.out.println("The day before increment is: 25-4-2019");
        dateTime addOrSubDays = myDate.addOrSubDays(amount);
        System.out.println("The day after increment is: " + addOrSubDays.getDay() + "-" + addOrSubDays.getMonth() + "-" + addOrSubDays.getYear());
    }

    @Test
    public void testSubDay2(){ // test subtracting day with fix amount of decrementing to the given time period
        int amount = -25;
        dateTime myDate = new dateTime(25, 4, 2019);
        System.out.println("The day before increment is: 25-4-2019");
        dateTime addOrSubDays = myDate.addOrSubDays(amount);
        System.out.println("The day after increment is: " + addOrSubDays.getDay() + "-" + addOrSubDays.getMonth() + "-" + addOrSubDays.getYear());
    }
}