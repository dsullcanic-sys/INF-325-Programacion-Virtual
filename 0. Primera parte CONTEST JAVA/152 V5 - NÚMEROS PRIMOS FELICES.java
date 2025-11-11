import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (!esPrimo(n)) {
            System.out.println("No es Primo");
            return;
        }
        
        if (esFeliz(n)) {
            System.out.println("Primo Feliz");
        } else {
            System.out.println("Primo Infeliz");
        }
    }
    
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public static boolean esFeliz(int num) {
        Set<Integer> vistos = new HashSet<>();
        
        while (num != 1 && !vistos.contains(num)) {
            vistos.add(num);
            num = sumaCuadradosDigitos(num);
        }
        
        return num == 1;
    }
    
    public static int sumaCuadradosDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            int digito = num % 10;
            suma += digito * digito;
            num /= 10;
        }
        return suma;
    }
}