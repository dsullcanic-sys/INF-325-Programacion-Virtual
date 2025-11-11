import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int calificacion = sc.nextInt();
            String categoria;
            
            if (calificacion >= 1900) {
                categoria = "SENIOR (CAT.1)";
            } else if (calificacion >= 1600) {
                categoria = "SemiSENIOR (CAT.2)";
            } else if (calificacion >= 1400) {
                categoria = "JUNIOR (CAT.3)";
            } else {
                categoria = "INICIANTE (CAT.4)";
            }
            
            System.out.println(categoria);
        }
    }
}