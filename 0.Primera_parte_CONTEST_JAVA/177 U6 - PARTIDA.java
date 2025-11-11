import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int countSafe = 0, countUnsafe = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int val = sc.nextInt();
                if (val < 0) {
                    countSafe++;
                } else {
                    countUnsafe++;
                }
            }
        }

        if (countSafe > countUnsafe || countSafe < 2) {
            System.out.println("HUYE RAPIDO");
        } else {
            System.out.println("ESTAS SEGURO");
        }
    }
}

