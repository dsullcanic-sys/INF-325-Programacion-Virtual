import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mapa de conversión de dígitos a letras
        char[] conversion = {'M', 'U', 'R', 'C', 'I', 'E', 'L', 'A', 'G', 'O'};
        
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < N; i++) {
            String codificado = sc.nextLine();
            StringBuilder decodificado = new StringBuilder();
            
            for (int j = 0; j < codificado.length(); j++) {
                char c = codificado.charAt(j);
                if (Character.isDigit(c)) {
                    // Convertir dígito a letra según la clave
                    decodificado.append(conversion[c - '0']);
                } else {
                    // Mantener letras sin cambios
                    decodificado.append(c);
                }
            }
            
            System.out.println(decodificado.toString());
        }
    }
}