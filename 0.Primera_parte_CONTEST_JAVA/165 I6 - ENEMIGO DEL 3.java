import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int N = sc.nextInt();
            int count = 0;
            int num = 0;
            
            while (count < N) {
                num++;
                if (num % 3 != 0 && num % 10 != 3) {
                    count++;
                }
            }
            
            System.out.println(num);
        }
    }
}