import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.nextLine());
        
        StringBuilder output = new StringBuilder();
        
        while (K-- > 0) {
            String cifrado = sc.nextLine();
            output.append(descifrar(cifrado)).append('\n');
        }
        
        System.out.print(output);
    }
    
    private static String descifrar(String cifrado) {
        if (cifrado.isEmpty()) return "";
        
        // Obtener clave del primer carácter
        int clave = cifrado.charAt(0) - 'A' + 1;
        
        // Descifrar el resto del texto
        char[] original = new char[cifrado.length() - 1];
        
        for (int i = 1; i < cifrado.length(); i++) {
            int cifradoPos = cifrado.charAt(i) - 'A' + 1;
            int originalPos = (cifradoPos - clave + 25) % 26 + 1;  // +25 para evitar negativos
            original[i - 1] = (char)('A' + originalPos - 1);
        }
        
        return new String(original);
    }
}