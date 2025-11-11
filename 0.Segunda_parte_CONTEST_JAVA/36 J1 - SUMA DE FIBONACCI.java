import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt(); // número de casos de prueba

        for (int i = 0; i < casos; i++) {
            int N = sc.nextInt(); // cantidad de términos a sumar

            // Inicializamos los dos primeros términos de Fibonacci
            long a = 0, b = 1;
            long suma = 0;

            for (int j = 0; j < N; j++) {
                suma += a;
                long siguiente = a + b;
                a = b;
                b = siguiente;
            }

            System.out.println(suma);
        }

        sc.close();
    }
}