import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String texto = sc.nextLine();
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println("Invertido: " + invertido);
        sc.close();
    }
}