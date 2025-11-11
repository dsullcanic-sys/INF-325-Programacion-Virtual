import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        if(s.length() != n) {
            System.out.println("NO");
            return;
        }

        Set<Character> letras = new HashSet<>();
        
        for(char c : s.toLowerCase().toCharArray()) {
            if(Character.isLetter(c)) letras.add(c);
        }
        
        System.out.println(letras.size() == 26 ? "SI" : "NO");
    }
}

