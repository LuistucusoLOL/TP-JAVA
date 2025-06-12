import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int producto = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese numero " + i + ": ");
            producto *= sc.nextInt();
        }
        System.out.println("Producto: " + producto);
        sc.close();
    }
}