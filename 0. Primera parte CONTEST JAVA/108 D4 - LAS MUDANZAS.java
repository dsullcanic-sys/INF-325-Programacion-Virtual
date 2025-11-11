import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] tasks = new int[M];
        
        for (int i = 0; i < M; i++) {
            tasks[i] = scanner.nextInt();
        }
        
        long totalTime = 0;
        int currentPos = 1;
        
        for (int i = 0; i < M; i++) {
            int target = tasks[i];
            if (target > currentPos) {
                totalTime += target - currentPos;
            } else if (target < currentPos) {
                totalTime += N - currentPos + target;
            }
            currentPos = target;
        }
        
        System.out.println(totalTime);
    }
}