import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resultados = sc.nextLine();
        
        int victoriasDereck = 0;
        int victoriasMarco = 0;
        
        for (int i = 0; i < resultados.length(); i++) {
            char resultado = resultados.charAt(i);
            if (resultado == 'D') {
                victoriasDereck++;
            } else if (resultado == 'M') {
                victoriasMarco++;
            }
        }
        
        if (victoriasDereck > victoriasMarco) {
            System.out.println("Dereck");
        } else if (victoriasMarco > victoriasDereck) {
            System.out.println("Marco");
        } else {
            System.out.println("Empate");
        }
    }
}