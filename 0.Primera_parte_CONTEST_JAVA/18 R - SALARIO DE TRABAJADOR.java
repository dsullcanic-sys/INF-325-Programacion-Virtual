import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            double horas = scanner.nextDouble();
            double salarioPorHora = scanner.nextDouble();
            double pagoTotal;
            
            if (horas <= 40) {
                pagoTotal = horas * salarioPorHora;
            } else {
                double horasNormales = 40;
                double horasExtras = horas - 40;
                pagoTotal = (horasNormales * salarioPorHora) + 
                           (horasExtras * salarioPorHora * 1.5);
            }
            
            System.out.printf("%.2f%n", pagoTotal);
        }
    }
}