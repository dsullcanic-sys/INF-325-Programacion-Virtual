import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int saltos = X / 5;  // Cantidad de saltos de 5 posiciones
        
        if (X % 5 != 0) {    // Si queda un residuo, necesita un salto adicional
            saltos++;
        }
        
        System.out.println(saltos);
    }
}