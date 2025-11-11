import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] participantes = new int[N];
        
        for (int i = 0; i < N; i++) {
            participantes[i] = sc.nextInt();
        }
        
        Arrays.sort(participantes);
        int equipos = 0;
        
        for (int i = 0; i <= N - 3; i += 3) {
            if (participantes[i] + K <= 5 && 
                participantes[i+1] + K <= 5 && 
                participantes[i+2] + K <= 5) {
                equipos++;
            } else {
                break;
            }
        }
        
        System.out.println(equipos);
    }
}