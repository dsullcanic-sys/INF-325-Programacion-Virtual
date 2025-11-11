import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int[] dp = new int[N + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i >= A && dp[i - A] != -1) {
                dp[i] = Math.max(dp[i], dp[i - A] + 1);
            }
            if (i >= B && dp[i - B] != -1) {
                dp[i] = Math.max(dp[i], dp[i - B] + 1);
            }
            if (i >= C && dp[i - C] != -1) {
                dp[i] = Math.max(dp[i], dp[i - C] + 1);
            }
        }
        
        System.out.println(dp[N]);
    }
}