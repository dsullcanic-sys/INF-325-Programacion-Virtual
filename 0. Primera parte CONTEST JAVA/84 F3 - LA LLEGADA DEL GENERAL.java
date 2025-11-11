import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] alturas = new int[n];

        for(int i = 0; i < n; i++) alturas[i] = sc.nextInt();

        int max = -1, posMax = -1;
        int min = 101, posMin = -1;

        for(int i = 0; i < n; i++) {
            if(alturas[i] > max) {
                max = alturas[i];
                posMax = i;
            }
            if(alturas[n-1-i] < min) {
                min = alturas[n-1-i];
                posMin = n-1-i;
            }
        }

        int tiempo = posMax + (n-1 - posMin);
        if(posMax > posMin) tiempo--;
        
        System.out.println(tiempo);
    }
}