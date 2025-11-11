import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int n = sc.nextInt();
            System.out.println(calcularPasos(n));
        }
    }
    
    public static int calcularPasos(int n) {
        int pasos = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            pasos++;
        }
        return pasos;
    }
}