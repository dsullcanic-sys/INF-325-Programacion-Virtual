import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int N = sc.nextInt();
            int posicion = 0;
            int pasos = 0;
            int salto = 1;
            boolean llega = false;
            
            while (posicion < N) {
                posicion += salto;
                pasos++;
                if (posicion == N) {
                    llega = true;
                    break;
                }
                salto++;
            }
            
            if (llega) {
                System.out.println("Llegas al cuadrado " + pasos);
            } else {
                System.out.println("No llegas");
            }
        }
    }
}