import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea

        for (int t = 0; t < K; t++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            String s1Lower = s1.toLowerCase();
            String s2Lower = s2.toLowerCase();

            int cmp = s1Lower.compareTo(s2Lower);

            if (cmp < 0) {
                System.out.println(-1);
            } else if (cmp > 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}
