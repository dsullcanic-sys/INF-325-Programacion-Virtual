import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();
        long A = sc.nextLong();

        long filas = (N + A - 1) / A; // cantidad de losas a lo largo
        long columnas = (M + A - 1) / A; // cantidad de losas a lo ancho

        long totalLosas = filas * columnas;

        System.out.println(totalLosas);

        sc.close();
    }
}
