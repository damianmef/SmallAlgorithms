import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LeapYearThird {
    public static boolean isLeapYear(LocalDate localDate){
        int year = localDate.getDayOfYear();
        if (year%4 == 0 && year%100 != 0 || year%400 ==0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj date w formacie dd/mm/yyyy");
        String dateLine = sc.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateLine, dateFormat);
        System.out.println(isLeapYear(date));

    }
}
