import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Precalcular primos hasta 31623 (raíz de 10^9)
        HashSet<Long> primes = new HashSet<>();
        boolean[] isPrime = new boolean[31624];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        
        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes.add((long)i);
            }
        }
        
        // Procesar cada número
        for (int num : numbers) {
            long root = (long)Math.sqrt(num);
            if (root * root == num && primes.contains(root)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}