import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fila1 = 0, col1 = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = sc.nextInt();
                if (val == 1) {
                    fila1 = i;
                    col1 = j;
                }
            }
        }

        int movimientos = Math.abs(fila1 - 3) + Math.abs(col1 - 3);
        System.out.println(movimientos);

        sc.close();
    }
}
