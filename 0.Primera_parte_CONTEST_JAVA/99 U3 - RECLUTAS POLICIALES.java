import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eventos = sc.nextInt();
        int oficiales = 0;
        int crimenes = 0;
        
        for(int i = 0; i < eventos; i++) {
            int evento = sc.nextInt();
            
            if(evento > 0) {
                oficiales += evento;
            } else if(evento == -1) {
                if(oficiales > 0) {
                    oficiales--;
                } else {
                    crimenes++;
                }
            }
        }
        
        System.out.println(crimenes);
    }
}