import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero = scanner.next();
        
        if (esCapicua(numero)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
    
    public static boolean esCapicua(String numero) {
        int izquierda = 0;
        int derecha = numero.length() - 1;
        
        while (izquierda < derecha) {
            if (numero.charAt(izquierda) != numero.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}