
package OOP.task2_2_8;

public class Main {
    public static void main(String[] args) {
        String []s = new String[]{"Sunday","Saturday","Monday","thirsday"};
        System.out.println(weekendCount(s));
        System.out.println(weekdayCount(s));

    }
public static boolean isWeekend(String dayName) {
    //return (dayName.equalsIgnoreCase("Sunday") || dayName.equals("Saturday"));
    return ("Sunday".equalsIgnoreCase(dayName) || "Saturday".equalsIgnoreCase(dayName));
}

public static int weekendCount(String[] days) {
    int count = 0;
    for (String s : days
    ) {
        if (isWeekend(s) == true) {
            count++;
        }
    }
    return count;
}

public static int weekdayCount(String[] days) {
    return (days.length - (weekendCount(days)));
}
}
