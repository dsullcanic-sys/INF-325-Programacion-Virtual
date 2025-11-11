import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine().trim();
        
        texto = texto.substring(1, texto.length() - 1).trim();
        Set<Character> letras = new HashSet<>();
        
        for(char c : texto.toCharArray()) {
            if(c >= 'a' && c <= 'z') letras.add(c);
        }
        
        System.out.println(letras.size());
    }
}