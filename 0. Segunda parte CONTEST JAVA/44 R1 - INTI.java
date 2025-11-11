import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // limpiar el salto de línea

        int X = 0;

        for (int i = 0; i < N; i++) {
            String linea = sc.nextLine();

            if (linea.contains("++")) {
                X++;
            } else if (linea.contains("--")) {
                X--;
            }
        }

        System.out.println(X);
        sc.close();
    }
}
