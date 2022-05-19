import java.util.ArrayList;
import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        if (ePrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }

    private static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> nPrimeNumbers(int n) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (ePrimo(i)) {
                primos.add(i);
            }
        }
        return primos;
    }
}
