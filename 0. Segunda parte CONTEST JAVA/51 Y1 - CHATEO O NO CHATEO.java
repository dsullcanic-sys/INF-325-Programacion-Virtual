import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        sc.nextLine(); // limpiar salto de línea

        for (int t = 0; t < K; t++) {
            String usuario = sc.nextLine();
            Set<Character> distintos = new HashSet<>();

            for (char c : usuario.toCharArray()) {
                distintos.add(c);
            }

            if (distintos.size() % 2 == 0) {
                System.out.println("CHATEA CON ELLA");
            } else {
                System.out.println("IGNORALO");
            }
        }

        sc.close();
    }
}
