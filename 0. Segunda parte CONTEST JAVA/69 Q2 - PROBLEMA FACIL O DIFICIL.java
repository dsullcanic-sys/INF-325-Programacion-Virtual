import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean dificil = false;

        for (int i = 0; i < N; i++) {
            int respuesta = sc.nextInt();
            if (respuesta == 1) {
                dificil = true;
            }
        }

        if (dificil) {
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }

        sc.close();
    }
}
