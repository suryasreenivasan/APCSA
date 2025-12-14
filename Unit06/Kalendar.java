import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kalendar {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();
        scanner.close();
        printCalendar(month, year);
        
    }

    public static void printCalendar(int month, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("   " + getMonthName(month) + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
}