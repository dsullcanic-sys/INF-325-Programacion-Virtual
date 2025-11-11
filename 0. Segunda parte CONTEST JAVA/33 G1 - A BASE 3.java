import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();

        StringBuilder base3 = new StringBuilder();

        while (N > 0) {
            int residuo = N % 3;
            base3.append(residuo);
            N /= 3;
        }

        System.out.println(base3.reverse().toString());
    }
}
