import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();  // Número de días
        int B = sc.nextInt();  // Bacterias iniciales
        
        // Calcular el crecimiento exponencial
        long bacterias = B * (long)Math.pow(2, X);
        
        System.out.println(bacterias);
    }
}