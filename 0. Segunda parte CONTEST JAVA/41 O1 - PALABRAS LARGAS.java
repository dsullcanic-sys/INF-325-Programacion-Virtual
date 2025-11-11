import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // limpiar el salto de línea después del número

        for (int i = 0; i < N; i++) {
            String palabra = sc.nextLine();

            if (palabra.length() > 10) {
                int intermedias = palabra.length() - 2;
                String abreviada = palabra.charAt(0) + String.valueOf(intermedias) + palabra.charAt(palabra.length() - 1);
                System.out.println(abreviada);
            } else {
                System.out.println(palabra);
            }
        }

        sc.close();
    }
}
