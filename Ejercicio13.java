import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione tipo de conversion:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese grados Celsius: ");
            double c = sc.nextDouble();
            double f = c * 9 / 5 + 32;
            System.out.println("Fahrenheit: " + f);
        } else if (opcion == 2) {
            System.out.print("Ingrese grados Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else {
            System.out.println("Opcion invalida");
        }
        sc.close();
    }
}