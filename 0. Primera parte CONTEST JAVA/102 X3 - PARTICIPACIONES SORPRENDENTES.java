import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] points = new int[N];
        
        for (int i = 0; i < N; i++) {
            points[i] = scanner.nextInt();
        }
        
        if (N <= 1) {
            System.out.println(0);
            return;
        }
        
        int amazingCount = 0;
        int currentMax = points[0];
        int currentMin = points[0];
        
        for (int i = 1; i < N; i++) {
            if (points[i] > currentMax) {
                amazingCount++;
                currentMax = points[i];
            } else if (points[i] < currentMin) {
                amazingCount++;
                currentMin = points[i];
            }
        }
        
        System.out.println(amazingCount);
    }
}