import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            // Encontrar el número medio sin ordenar
            int medio = a + b + c 
                      - Math.min(Math.min(a, b), c) 
                      - Math.max(Math.max(a, b), c);
            
            System.out.println(medio);
        }
    }
}