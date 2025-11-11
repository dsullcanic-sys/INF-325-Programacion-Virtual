import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        for (int i = 0; i < K; i++) {
            if (N % 10 != 0) {
                N--;
            } else {
                N /= 10;
            }
        }
        
        System.out.println(N);
    }
}