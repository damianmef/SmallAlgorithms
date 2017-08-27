import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        do {
            System.out.print(localDate.getYear()+" ");
            System.out.println(isLeap(localDate));
            localDate = localDate.minusYears(1);
        } while(localDate.getYear()>=1900);

    }

    public static boolean isLeap(LocalDate localDate) {
        int year = localDate.getYear();
        if ((year%4==0 && year%100!=0) || year%400==0) {
            return true;
        }
        return false;
    }
}
