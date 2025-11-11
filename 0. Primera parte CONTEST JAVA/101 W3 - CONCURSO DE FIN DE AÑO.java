import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numProblemas = sc.nextInt();
        int tiempoLimite = sc.nextInt();
        int tiempoDisponible = 240 - tiempoLimite;
        int problemasResueltos = 0;
        
        for(int i = 1; i <= numProblemas; i++) {
            int tiempoNecesario = 5 * i;
            if(tiempoDisponible >= tiempoNecesario) {
                tiempoDisponible -= tiempoNecesario;
                problemasResueltos++;
            } else {
                break;
            }
        }
        
        System.out.println(problemasResueltos);
    }
}