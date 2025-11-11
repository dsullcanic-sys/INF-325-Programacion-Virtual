import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.nextLine().charAt(0);
 
        if (Character.isLowerCase(letra)) {
            System.out.println(Character.toUpperCase(letra));
        } else if (Character.isUpperCase(letra)) {
            System.out.println(Character.toLowerCase(letra));
        } else {
            // Si no es letra, se imprime tal cual (opcional)
            System.out.println(letra);
        }
        sc.close();
    }
}