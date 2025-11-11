import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        for (int i = 0; i < K; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int median = -1;
            for (int j = 0; j < N; j++) {
                int left = 0;
                int right = 0;
                for (int k = 0; k < N; k++) {
                    if (arr[k] < arr[j]) {
                        left++;
                    } else if (arr[k] > arr[j]) {
                        right++;
                    }
                }
                if (left == right && (left + right + 1) == N) {
                    median = arr[j];
                    break;
                }
            }
            System.out.println(median);
        }
    }
}