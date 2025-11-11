import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cm = sc.nextInt();

        int km = cm / 100000;
        int m = (cm % 100000) / 100;
        int cmRestante = cm % 100;

        // Imprime exactamente como espera el juez
        System.out.print(cm + " centmetros son " + km + " km " + m + " m " + cmRestante + " cm");
    }
}
