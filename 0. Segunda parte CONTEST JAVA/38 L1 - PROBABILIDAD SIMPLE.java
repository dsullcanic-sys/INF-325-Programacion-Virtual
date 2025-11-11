import java.util.Scanner;

public class Main {

    // Función para calcular el máximo común divisor (GCD)
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // número de casos de prueba

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();

            int count = 0;
            // Contamos todas las parejas (x,y) de enteros positivos
            for (int x = 1; x <= A; x++) {
                if (A % x == 0) {
                    int y = A / x;
                    count++; // cada par (x,y) válido
                }
            }

            // La probabilidad es 1/count
            int numerador = 1;
            int denominador = count;

            // Simplificamos la fracción usando gcd
            int g = gcd(numerador, denominador);
            numerador /= g;
            denominador /= g;

            System.out.println(numerador + "/" + denominador);
        }

        sc.close();
    }
}
