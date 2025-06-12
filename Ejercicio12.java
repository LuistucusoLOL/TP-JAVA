import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num = sc.nextInt(), suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        System.out.println("Suma de digitos: " + suma);
        sc.close();
    }
}