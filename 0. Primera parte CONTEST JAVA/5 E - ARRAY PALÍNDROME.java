import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int N = scanner.nextInt();
        int[] arreglo = new int[N];
 
        for (int i = 0; i < N; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        if (esPalindromo(arreglo)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
    
    public static boolean esPalindromo(int[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        
        while (izquierda < derecha) {
            if (arreglo[izquierda] != arreglo[derecha]) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}