import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        StringBuilder salida = new StringBuilder();

        for (int caso = 0; caso < casos; caso++) {
            int n = entrada.nextInt();

            long numPrevPrev = 4;   // a1
            long numPrev = 7;       // a2
            double suma = 0.0;

            for (int i = 1; i <= n; i++) {
                long numerador;
                if (i == 1) {
                    numerador = numPrevPrev; // 4
                } else if (i == 2) {
                    numerador = numPrev;     // 7
                } else {
                    // a_i = a_{i-1} + a_{i-2} - 2*(i-3)
                    numerador = numPrev + numPrevPrev - 2L * (i - 3);
                    numPrevPrev = numPrev;
                    numPrev = numerador;
                }

                int denominador = 2 * i;
                suma += (double) numerador / (double) denominador;
            }

            salida.append(String.format(Locale.US, "%.4f%n", suma));
        }

        System.out.print(salida.toString());
    }
}
