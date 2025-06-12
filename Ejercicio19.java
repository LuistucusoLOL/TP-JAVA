import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese numero " + i + ": ");
            total += sc.nextInt();
        }
        System.out.println("Promedio: " + (total / 5.0));
        sc.close();
    }
}