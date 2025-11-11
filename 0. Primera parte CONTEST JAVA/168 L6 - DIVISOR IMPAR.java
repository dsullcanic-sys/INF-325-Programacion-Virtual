import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            long N = sc.nextLong();
            
            // Verificar si N es par y no potencia de 2
            if (N % 2 == 1 && N > 1) {
                System.out.println("SI");
            } else {
                // Si N es par, verificar si tiene algún divisor impar > 1
                // Esto ocurre si N no es potencia de 2
                System.out.println((N & (N - 1)) == 0 ? "NO" : "SI");
            }
        }
    }
}