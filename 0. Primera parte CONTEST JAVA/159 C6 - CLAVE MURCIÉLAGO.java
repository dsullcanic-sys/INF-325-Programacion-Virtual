import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Crear mapa de conversión
        HashMap<Character, Character> mapa = new HashMap<>();
        mapa.put('M', '0');
        mapa.put('U', '1');
        mapa.put('R', '2');
        mapa.put('C', '3');
        mapa.put('I', '4');
        mapa.put('E', '5');
        mapa.put('L', '6');
        mapa.put('A', '7');
        mapa.put('G', '8');
        mapa.put('O', '9');

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < N; i++) {
            String palabra = sc.nextLine();
            StringBuilder resultado = new StringBuilder();
            
            for (char c : palabra.toCharArray()) {
                if (mapa.containsKey(c)) {
                    resultado.append(mapa.get(c));
                } else {
                    resultado.append(c);
                }
            }
            
            System.out.println(resultado.toString());
        }
    }
}