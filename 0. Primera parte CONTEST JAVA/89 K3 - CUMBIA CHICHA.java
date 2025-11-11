import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cancion = sc.nextLine();
        String resultado = cancion.replaceAll("WUB", " ").trim().replaceAll(" +", " ");
        System.out.println(resultado);
    }
}