import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        sc.close();
 
        StringBuilder impares = new StringBuilder();
        StringBuilder pares = new StringBuilder();
 
        for (int i = 0; i < texto.length(); i++) {
            if (i % 2 == 0) {
                impares.append(texto.charAt(i));
            } else {
                pares.append(texto.charAt(i));
            }
        }
 
        String resultado = impares.toString() + pares.toString();
        System.out.println(resultado);
    }
}