import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            if (N % 10 == 0) {
                N /= 10;
            } else {
                N -= 1;
            }
        }

        System.out.println(N);
        sc.close();
    }
}
