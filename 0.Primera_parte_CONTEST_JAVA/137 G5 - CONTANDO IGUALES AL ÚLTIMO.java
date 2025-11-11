import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Leer tamaño del vector
        int[] vector = new int[N];
        int contador = 0;
        
        // Leer los elementos del vector
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }
        
        // Obtener el último elemento
        int ultimo = vector[N-1];
        
        // Contar cuántos elementos son iguales al último
        for (int i = 0; i < N; i++) {
            if (vector[i] == ultimo) {
                contador++;
            }
        }
        
        System.out.println(contador);
    }
}