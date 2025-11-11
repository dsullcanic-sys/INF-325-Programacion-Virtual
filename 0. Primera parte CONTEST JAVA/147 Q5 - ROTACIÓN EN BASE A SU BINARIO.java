import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        
        for (int i = 0; i < K; i++) {
            int N = scanner.nextInt();
            String binary = Integer.toBinaryString(N);
            String numStr = Integer.toString(N);
            
            for (int j = 0; j < binary.length(); j++) {
                if (numStr.length() == 1) break; // No se puede rotar números de un dígito
                
                char bit = binary.charAt(j);
                if (bit == '1') {
                    // Rotación a la izquierda: mueve primer dígito al final
                    numStr = numStr.substring(1) + numStr.charAt(0);
                } else {
                    // Rotación a la derecha: mueve último dígito al principio
                    numStr = numStr.charAt(numStr.length() - 1) + numStr.substring(0, numStr.length() - 1);
                }
            }
            
            System.out.println(numStr);
        }
    }
}