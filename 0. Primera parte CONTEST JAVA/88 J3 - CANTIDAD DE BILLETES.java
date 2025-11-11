import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long monto = sc.nextLong();
        int[] valores = {100, 20, 10, 5, 1};
        long total = 0;

        for (int v : valores) {
            if (monto >= v) {
                total += monto / v;
                monto %= v;
            }
        }

        System.out.println(total);
    }
}