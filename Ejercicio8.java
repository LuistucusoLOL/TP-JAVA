import java.util.Scanner;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secreto = rand.nextInt(100) + 1;
        int intento, intentos = 0;

        do {
            System.out.print("Adivina el numero (1-100): ");
            intento = sc.nextInt();
            intentos++;
            if (intento < secreto) System.out.println("El numero es mayor");
            else if (intento > secreto) System.out.println("El numero es menor");
        } while (intento != secreto);

        System.out.println("Lo adivinaste en " + intentos + " intentos.");
        sc.close();
    }
}