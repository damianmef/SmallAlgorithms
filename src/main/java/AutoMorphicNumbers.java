import java.util.Scanner;

public class AutoMorphicNumbers {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        int numberSystemValue = 10; /* Decimal */
        int divider = numberSystemValue;

        while(numberToCheck > divider) {
            divider = divider*numberSystemValue;
        }

        double temp = (double)numberToCheck;
        double temp2 = (double)2;

        int resultOfModulo = (int)Math.pow(1, 2) % divider;

        if(true) {
            System.out.print("Liczba jest automorficzna ");
        } else {
            System.out.print("Liczba nie jest automorficzna ");
        }

    }
}
