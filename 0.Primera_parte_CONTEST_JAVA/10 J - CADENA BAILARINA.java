import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine()); // Número de casos
 
        for (int caso = 0; caso < t; caso++) {
            String linea = sc.nextLine();
            StringBuilder bailarina = new StringBuilder();
 
            int posLetra = 0; // contador solo para letras
            for (int i = 0; i < linea.length(); i++) {
                char ch = linea.charAt(i);
                if (ch != ' ') {
                    if (posLetra % 2 == 0) {
                        bailarina.append(Character.toUpperCase(ch));
                    } else {
                        bailarina.append(Character.toLowerCase(ch));
                    }
                    posLetra++;
                } else {
                    bailarina.append(' '); // mantener espacio
                }
            }
 
            System.out.println(bailarina.toString());
        }
        sc.close();
    }
}