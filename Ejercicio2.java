public class Ejercicio2 {
    public static void main(String[] args) {
        for (int n = 50; n <= 100; n++) {
            if (esPrimo(n)) {
                System.out.println(n + ": primo");
            } else {
                System.out.print(n + ": ");
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) System.out.print(i + " ");
                }
                System.out.println();
            }
        }
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