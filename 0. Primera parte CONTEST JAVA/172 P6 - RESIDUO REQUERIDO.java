import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();
            
            // Calcular el máximo K ≤ Z donde K ≡ Y mod X
            long K = (Z - Y) / X * X + Y;
            
            System.out.println(K);
        }
    }
}