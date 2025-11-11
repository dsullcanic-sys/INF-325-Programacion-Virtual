import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double harmonic = 0.0;
        
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }
        
        System.out.printf("%.4f%n", harmonic);
    }
}