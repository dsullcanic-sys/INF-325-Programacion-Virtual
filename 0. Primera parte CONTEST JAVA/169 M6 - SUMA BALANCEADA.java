import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int N = sc.nextInt();
            
            if (N % 4 != 0) {
                System.out.println("NO");
                continue;
            }
            
            System.out.println("SI");
            StringBuilder sb = new StringBuilder();
            
            // Primera mitad (pares)
            for (int i = 1; i <= N/2; i++) {
                sb.append(2*i).append(" ");
            }
            
            // Segunda mitad (impares)
            for (int i = 1; i < N/2; i++) {
                sb.append(2*i - 1).append(" ");
            }
            
            // Último número impar para igualar sumas
            sb.append(3*(N/2) - 1);
            
            System.out.println(sb.toString());
        }
    }
}