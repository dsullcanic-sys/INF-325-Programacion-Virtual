import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();  // Costo primera palta
        int n = sc.nextInt();  // Dinero disponible
        int w = sc.nextInt();  // Cantidad de paltas
        
        // Calcular costo total de w paltas
        int costoTotal = k * w * (w + 1) / 2;
        
        // Calcular dinero a prestar
        int prestamo = Math.max(0, costoTotal - n);
        
        System.out.println(prestamo);
    }
}