import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Leer tamaño del vector
        int[] vector = new int[N];
        
        // Leer los elementos del vector
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }
        
        // Imprimir el vector en orden inverso
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(vector[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}