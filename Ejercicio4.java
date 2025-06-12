import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo N: ");
        int N = sc.nextInt();
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }

        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        sc.close();
    }
}