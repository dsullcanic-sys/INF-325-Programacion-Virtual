import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encoded = scanner.nextLine();
        
        int length = encoded.length();
        int half = (length + 1) / 2;
        
        StringBuilder decoded = new StringBuilder();
        
        // Reconstruir la cadena original
        for (int i = 0; i < half; i++) {
            // Agregar caracter de posición impar (índice par)
            if (i < half) {
                decoded.append(encoded.charAt(i));
            }
            // Agregar caracter de posición par (índice impar)
            if (i + half < length) {
                decoded.append(encoded.charAt(i + half));
            }
        }
        
        System.out.println(decoded.toString());
    }
}