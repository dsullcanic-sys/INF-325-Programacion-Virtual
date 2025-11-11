import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] cards = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }
        
        Arrays.sort(cards, Collections.reverseOrder());
        
        int pabloScore = 0;
        int dereckScore = 0;
        
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) { 
                pabloScore += cards[i];
            } else { 
                dereckScore += cards[i];
            }
        }
        
        System.out.println(pabloScore + " " + dereckScore);
    }
}