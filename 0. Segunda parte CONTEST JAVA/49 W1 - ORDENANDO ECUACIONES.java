import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        // Dividir la cadena por '+'
        String[] numeros = S.split("\\+");

        // Ordenar los números como enteros
        Arrays.sort(numeros);

        // Reconstruir la cadena ordenada con '+'
        String resultado = String.join("+", numeros);

        System.out.println(resultado);
        sc.close();
    }
}
