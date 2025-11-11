import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // cantidad de números
        LinkedHashMap<Integer, Integer> contador = new LinkedHashMap<>(); // preserva el orden

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        // Imprimir cada número único con su cantidad de ocurrencias
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}
