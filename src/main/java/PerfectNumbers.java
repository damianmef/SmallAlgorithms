import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int candidateToPerfectNumber = scanner.nextInt();
        int sumOfModulo = 0;
        for (int i = 1; i <= candidateToPerfectNumber/2; i++){
            if(candidateToPerfectNumber % i == 0) {
                sumOfModulo += i;
            }
        }

        if(candidateToPerfectNumber == sumOfModulo) {
            System.out.print("Liczba jest doskonała ");
        } else {
            System.out.print("Liczba nie jest doskonała ");
        }

    }
}
