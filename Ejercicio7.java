import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine().toLowerCase();
        int vocales = 0, consonantes = 0;

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) vocales++;
                else consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        sc.close();
    }
}