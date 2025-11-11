import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        
        while (K-- > 0) {
            String B = sc.nextLine();
            StringBuilder A = new StringBuilder();
            
            if (B.length() == 2) {
                // Caso especial: cadena de 2 caracteres
                System.out.println(B);
                continue;
            }
            
            // Reconstruir la cadena original
            A.append(B.charAt(0));
            A.append(B.charAt(1));
            
            for (int i = 3; i < B.length(); i += 2) {
                A.append(B.charAt(i));
            }
            
            System.out.println(A.toString());
        }
    }
}