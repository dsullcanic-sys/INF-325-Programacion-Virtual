import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            if (A + B == C) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}