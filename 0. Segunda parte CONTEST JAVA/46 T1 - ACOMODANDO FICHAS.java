import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int maxFichas = (M * N) / 2; // división entera

        System.out.println(maxFichas);

        sc.close();
    }
}
