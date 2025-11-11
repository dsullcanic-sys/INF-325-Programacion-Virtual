import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // pisos
        int M = sc.nextInt(); // viajes
        
        int[] P = new int[N]; // empleados por piso
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        
        long[] V = new long[M]; // chocolates por viaje
        for (int i = 0; i < M; i++) {
            V[i] = sc.nextLong();
        }
        
        // Procesar cada viaje
        for (int i = 0; i < M; i++) {
            long chocolates = V[i];
            for (int j = 0; j < N; j++) {
                chocolates %= P[j];
            }
            System.out.println(chocolates);
        }
    }
}
