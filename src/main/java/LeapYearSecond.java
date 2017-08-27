import java.util.Scanner;

public class LeapYearSecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is entered year a leap year?");
        System.out.print("Enter year: ");
        int userInput = scanner.nextInt();
        boolean leapYear = (userInput % 400 == 0) || ((userInput % 4 == 0 && userInput % 100 != 0));

        if (leapYear) {

            System.out.println(userInput + " is a leap year");
        } else
            System.out.println(userInput + " is not a leap year");
    }
}
