import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (A % B == 0) {
            System.out.println(A + " es divisible por " + B);
        } else if (B % A == 0) {
            System.out.println(B + " es divisible por " + A);
        } else {
            System.out.println(-1);
        }
    }
}