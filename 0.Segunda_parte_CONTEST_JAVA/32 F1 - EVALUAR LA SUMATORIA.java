import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        int resultado;

        if (N % 2 == 0) {
            resultado = N / 2;
        } else {
            resultado = (N - 1) / 2 - N;
        }

        System.out.println(resultado);
    }
}
