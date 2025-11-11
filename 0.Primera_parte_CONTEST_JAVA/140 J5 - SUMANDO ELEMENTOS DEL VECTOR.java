import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Leer tamaño del vector
        int suma = 0;
        
        for (int i = 0; i < N; i++) {
            suma += scanner.nextInt(); // Sumar cada elemento
        }
        
        System.out.println(suma);
    }
}