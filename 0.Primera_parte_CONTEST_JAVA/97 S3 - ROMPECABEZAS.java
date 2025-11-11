import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] piezas = new int[m];
        
        for(int i = 0; i < m; i++) piezas[i] = sc.nextInt();
        Arrays.sort(piezas);
        
        int minDif = Integer.MAX_VALUE;
        
        for(int i = 0; i <= m - n; i++) {
            int dif = piezas[i + n - 1] - piezas[i];
            if(dif < minDif) minDif = dif;
        }
        
        System.out.println(minDif);
    }
}