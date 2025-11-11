import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int resultado = 0;
        int longitud = N.length();
        
        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(N.charAt(i));
            int posicion = longitud - i;  // Posición desde la izquierda (comenzando en 1)
            resultado += digito * factorial(posicion);
        }
        
        System.out.println(resultado);
    }
    
    private static int factorial(int n) {
        if (n == 0) return 1;  // 0! = 1
        return n * factorial(n - 1);
    }
}