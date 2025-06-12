import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println(anio + (bisiesto ? " es bisiesto" : " no es bisiesto"));
        sc.close();
    }
}