import java.util.Scanner;
 
public class Main {
    public static int sumaDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
 
        for (int c = 0; c < casos; c++) {
            int N = sc.nextInt();
 
            int actualGrande = 35;
            for (int i = 1; i <= N; i++) {
                if (i % 2 != 0) {
                    System.out.print(actualGrande);
                    if (i < N) System.out.print("  ");
                } else {
                    int suma = sumaDigitos(actualGrande);
                    System.out.print(suma);
                    if (i < N) System.out.print("  ");
                    actualGrande += suma;
                }
            }
            System.out.println();
        }
 
        sc.close();
    }
}