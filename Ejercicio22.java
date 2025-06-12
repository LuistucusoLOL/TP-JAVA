import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese exponente: ");
        int exponente = sc.nextInt();
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}