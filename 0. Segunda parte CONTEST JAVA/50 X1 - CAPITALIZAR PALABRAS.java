import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palabra = sc.nextLine();
        if (palabra.length() > 0) {
            String resultado = palabra.substring(0,1).toUpperCase() + palabra.substring(1);
            System.out.println(resultado);
        }

        sc.close();
    }
}
