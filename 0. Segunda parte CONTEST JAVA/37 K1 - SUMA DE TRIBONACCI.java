import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt(); // número de casos de prueba

        for (int i = 0; i < casos; i++) {
            int N = sc.nextInt(); // cantidad de términos a sumar

            long suma = 0;
            long a = 0, b = 1, c = 1; // los tres primeros términos

            for (int j = 1; j <= N; j++) {
                long actual;
                if (j == 1) actual = a;
                else if (j == 2) actual = b;
                else if (j == 3) actual = c;
                else {
                    actual = a + b + c;
                    a = b;
                    b = c;
                    c = actual;
                }
                suma += actual;
            }

            System.out.println(suma);
        }

        sc.close();
    }
}
