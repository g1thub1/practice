package lesson18;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Создайте объект класса Calendar, указывая дату своего рождения.
 * Вывести на консоль день недели, неделя в году, день в году, количество прожитых миллисекунд.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar1 = new GregorianCalendar(1997, 2, 20);
        System.out.println(calendar1.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar1.getTimeInMillis());
    }
}
