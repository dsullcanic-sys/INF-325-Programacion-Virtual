import java.util.Scanner;
 
public class Main {
    
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        for (int c = 0; c < casos; c++) {
            int n = sc.nextInt();
            System.out.print(n + ": ");
            
            if (!esPrimo(n)) {
                System.out.print("-1 ");
            } else {
                int resto = 1;
                for (int i = 0; i < 40; i++) {
                    resto *= 10;
                    int decimal = resto / n;
                    System.out.print(decimal + " ");
                    resto %= n;
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}