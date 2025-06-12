import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingrese un numero mayor que 100 y primo: ");
            num = sc.nextInt();
        } while (!(num > 100 && esPrimo(num)));

        System.out.println("CORRECTO");
        sc.close();
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}