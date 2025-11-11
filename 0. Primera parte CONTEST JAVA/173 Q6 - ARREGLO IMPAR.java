import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            int malPosicionadosPares = 0;
            int malPosicionadosImpares = 0;
            
            for (int i = 0; i < N; i++) {
                if (i % 2 != A[i] % 2) {
                    if (i % 2 == 0) {
                        malPosicionadosPares++;
                    } else {
                        malPosicionadosImpares++;
                    }
                }
            }
            
            if (malPosicionadosPares != malPosicionadosImpares) {
                System.out.println(-1);
            } else {
                System.out.println(malPosicionadosPares);
            }
        }
    }
}