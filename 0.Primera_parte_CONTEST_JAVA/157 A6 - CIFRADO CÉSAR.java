import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        
        while (K-- > 0) {
            String palabra = sc.nextLine();
            String cifrado = cifrarPalabra(palabra);
            System.out.println(cifrado);
        }
    }
    
    public static String cifrarPalabra(String palabra) {
        if (palabra.isEmpty()) return "";
        
        // Calcular clave de desplazamiento (máxima frecuencia)
        Map<Character, Integer> frecuencias = new HashMap<>();
        int maxFrecuencia = 0;
        
        for (char c : palabra.toCharArray()) {
            int frecuencia = frecuencias.getOrDefault(c, 0) + 1;
            frecuencias.put(c, frecuencia);
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
            }
        }
        
        int clave = maxFrecuencia;
        char primeraLetra = (char) ('A' + (clave - 1) % 26);
        
        // Construir texto cifrado
        StringBuilder cifrado = new StringBuilder();
        cifrado.append(Character.toUpperCase(primeraLetra));
        
        for (char c : palabra.toCharArray()) {
            int original = c - 'A' + 1;
            int cifradoPos = (original + clave - 1) % 26 + 1;
            char cifradoChar = (char) ('A' + cifradoPos - 1);
            cifrado.append(cifradoChar);
        }
        
        return cifrado.toString();
    }
}