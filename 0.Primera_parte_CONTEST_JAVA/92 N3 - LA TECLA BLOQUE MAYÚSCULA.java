import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        
        if(texto.equals(texto.toLowerCase())) {
            System.out.println(texto);
        } else {
            String resultado = texto.substring(0,1).toUpperCase() + texto.substring(1).toLowerCase();
            System.out.println(resultado);
        }
    }
}