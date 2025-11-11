import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        int inicio = Math.max(X, Y);
        int fin = Math.min(X, Y);
        
        for (int i = inicio; i >= fin; i--) {
            System.out.println(i);
        }
    }
}