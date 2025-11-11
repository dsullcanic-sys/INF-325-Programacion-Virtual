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
            
            int commonValue;
            if (arr[0] == arr[1] || arr[0] == arr[2]) {
                commonValue = arr[0];
            } else {
                commonValue = arr[1];
            }
        
            for (int j = 0; j < N; j++) {
                if (arr[j] != commonValue) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}