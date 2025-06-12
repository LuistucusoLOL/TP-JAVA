import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();
        int longitud = texto.length();
        System.out.println("Longitud: " + longitud);
        sc.close();
    }
}