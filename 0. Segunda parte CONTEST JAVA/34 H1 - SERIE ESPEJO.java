import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();

        StringBuilder salida = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int k = (i + 1) / 2;          // 1,1,2,2,3,3,...
            int valor = (i % 2 == 1) ? k  // posiciones impares: positivo
                                     : -k; // posiciones pares: negativo
            salida.append(valor).append(" ");
        }
        System.out.print(salida.toString());
    }
}
