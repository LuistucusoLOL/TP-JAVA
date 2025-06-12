public class Ejercicio9 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci hasta el 100: ");
        while (a <= 100) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}