import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        
        while (K-- > 0) {
            String[] palabras = sc.nextLine().split(" ");
            String base = palabras[0];
            int contador = 0;
            
            for (int i = 1; i <= 3; i++) {
                if (esRotacion(base, palabras[i])) {
                    contador++;
                }
            }
            
            System.out.println(contador);
        }
    }
    
    public static boolean esRotacion(String base, String palabra) {
        if (base.length() != palabra.length()) {
            return false;
        }
        
        String concatenada = palabra + palabra;
        return concatenada.contains(base);
    }
}