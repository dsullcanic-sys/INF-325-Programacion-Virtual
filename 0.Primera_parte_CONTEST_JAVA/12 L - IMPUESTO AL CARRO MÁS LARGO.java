import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            double tiempo = scanner.nextDouble();
            double velocidad = scanner.nextDouble();
            double longitud = velocidad * tiempo;
            System.out.printf("%.3f%n", longitud);
        }
    }
}