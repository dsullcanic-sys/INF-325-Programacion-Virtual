import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();
        int C = scanner.nextInt();
        int R = scanner.nextInt();
        int P = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();
        
        int totalDrink = K * L;
        int totalSlices = C * R;
        int totalSalt = P;
        
        int toastsByDrink = totalDrink / (N * M);
        int toastsBySlices = totalSlices / N;
        int toastsBySalt = totalSalt / (N * S);
        
        int minToasts = Math.min(Math.min(toastsByDrink, toastsBySlices), toastsBySalt);
        
        System.out.println(minToasts);
    }
}