import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // Calcular la sumatoria usando la fórmula matemática
        int sumatoria = N * (N + 1) / 2;
        
        System.out.println(sumatoria);
    }
}