import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRegistros = sc.nextInt();
        sc.nextLine();
        
        HashMap<String, Integer> registros = new HashMap<>();
        
        for(int i = 0; i < numRegistros; i++) {
            String nombre = sc.nextLine();
            
            if(!registros.containsKey(nombre)) {
                registros.put(nombre, 1);
                System.out.println("OK");
            } else {
                int cont = registros.get(nombre);
                System.out.println(nombre + cont);
                registros.put(nombre, cont + 1);
            }
        }
    }
}