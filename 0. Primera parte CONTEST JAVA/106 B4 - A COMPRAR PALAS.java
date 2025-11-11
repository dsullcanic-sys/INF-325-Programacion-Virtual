import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int R = scanner.nextInt();
        
        int n = 1;
        while (true) {
            int total = n * K;
            if (total % 10 == R || total % 10 == 0) {
                System.out.println(n);
                return;
            }
            n++;
        }
    }
}