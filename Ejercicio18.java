import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        boolean esPalindromo = palabra.equalsIgnoreCase(new StringBuilder(palabra).reverse().toString());
        System.out.println(esPalindromo ? "Es palindromo" : "No es palindromo");
        sc.close();
    }
}