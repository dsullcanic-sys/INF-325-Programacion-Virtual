import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int middle = (N + 1) / 2;
        
        for (int i = 1; i <= middle; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        for (int i = middle - 1; i >= 1; i--) {
            for (int j = 0; j < N; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}