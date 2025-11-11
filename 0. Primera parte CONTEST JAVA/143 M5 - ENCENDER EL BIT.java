import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        
        // Encontrar el primer bit apagado (0) empezando desde la derecha
        int mask = 1;
        while ((K & mask) != 0) {
            mask <<= 1;
        }
        
        // Encender el bit encontrado
        int resultado = K | mask;
        
        System.out.println(resultado);
    }
}