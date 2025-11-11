import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            int termino = (i % 2 == 1) ? (i + 1) / 2 : -i / 2;
            
            System.out.print(termino);
            if (i < N) {
                System.out.print(" ");
            }
        }
    }
}