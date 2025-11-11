import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea
        String S = sc.nextLine();

        int quitar = 0;
        for (int i = 1; i < N; i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                quitar++;
            }
        }

        System.out.println(quitar);
        sc.close();
    }
}
