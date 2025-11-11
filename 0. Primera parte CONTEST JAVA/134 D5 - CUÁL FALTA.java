import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] vector = new int[N];
        
        // Leer los elementos del vector
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }
        
        // Ordenar el vector
        Arrays.sort(vector);
        
        // Buscar el número faltante
        int faltante = -1;
        for (int i = 1; i < N; i++) {
            if (vector[i] != vector[i-1] + 1) {
                faltante = vector[i-1] + 1;
                break;
            }
        }
        
        System.out.println(faltante);
    }
}