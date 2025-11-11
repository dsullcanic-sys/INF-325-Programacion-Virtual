import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int pasajeros = 0;
        int capacidadMinima = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt(); // salen
            int B = sc.nextInt(); // entran

            pasajeros -= A;
            pasajeros += B;

            if (pasajeros > capacidadMinima) {
                capacidadMinima = pasajeros;
            }
        }

        System.out.println(capacidadMinima);
        sc.close();
    }
}
