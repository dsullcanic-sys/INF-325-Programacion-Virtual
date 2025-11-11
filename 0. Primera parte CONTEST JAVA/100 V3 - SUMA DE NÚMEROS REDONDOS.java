import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        for(int i = 0; i < casos; i++) {
            int num = sc.nextInt();
            ArrayList<Integer> componentes = new ArrayList<>();
            int multiplicador = 1;
            
            while(num > 0) {
                int digito = num % 10;
                if(digito != 0) {
                    componentes.add(digito * multiplicador);
                }
                num /= 10;
                multiplicador *= 10;
            }
            
            // Ordenar de mayor a menor
            componentes.sort((a, b) -> b - a);
            
            System.out.println(componentes.size());
            for(int comp : componentes) {
                System.out.print(comp + " ");
            }
            System.out.println();
        }
    }
}