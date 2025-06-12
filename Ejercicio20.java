import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese numero " + i + ": ");
            int num = sc.nextInt();
            if (num > mayor) mayor = num;
        }
        System.out.println("Mayor numero ingresado: " + mayor);
        sc.close();
    }
}