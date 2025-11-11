import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // número de problemas
        int total = 0;

        for (int i = 0; i < N; i++) {
            int diana = sc.nextInt();
            int vania = sc.nextInt();
            int tania = sc.nextInt();

            int suma = diana + vania + tania;
            if (suma >= 2) {
                total++;
            }
        }

        System.out.println(total);
        sc.close();
    }
}
