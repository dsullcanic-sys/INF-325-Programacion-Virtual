import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Leer tamaño del vector
        int sumaImpares = 0;
        int sumaPares = 0;
        
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (i % 2 == 0) {  // Posiciones impares (índice 0, 2, 4...)
                sumaImpares += num;
            } else {            // Posiciones pares (índice 1, 3, 5...)
                sumaPares += num;
            }
        }
        
        System.out.println(sumaImpares + " " + sumaPares);
    }
}