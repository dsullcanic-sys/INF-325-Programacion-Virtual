import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            
            // Fórmula exacta: x^[(n+1)/2]
            double exponente = (n + 1) / 2.0;
            long resultado = (long) Math.round(Math.pow(x, exponente));
            
            System.out.println(resultado);
        }
    }
}