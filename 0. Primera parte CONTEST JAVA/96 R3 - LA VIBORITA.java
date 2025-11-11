import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int cols = sc.nextInt();
        
        for(int i = 1; i <= filas; i++) {
            if(i % 2 == 1) {
                System.out.println("#".repeat(cols));
            } else if(i % 4 == 0) {
                System.out.println("#" + ".".repeat(cols-1));
            } else {
                System.out.println(".".repeat(cols-1) + "#");
            }
        }
    }
}