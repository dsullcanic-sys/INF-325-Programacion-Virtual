import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int jukiWins = 0;
        int yoguiWins = 0;
        
        for (int i = 0; i < N; i++) {
            int mi = sc.nextInt();
            int ci = sc.nextInt();
            
            if (mi > ci) {
                jukiWins++;
            } else if (ci > mi) {
                yoguiWins++;
            }
            // Empates no se cuentan
        }
        
        if (jukiWins > yoguiWins) {
            System.out.println("Juki");
        } else if (yoguiWins > jukiWins) {
            System.out.println("Yogui");
        } else {
            System.out.println("Empate");
        }
    }
}