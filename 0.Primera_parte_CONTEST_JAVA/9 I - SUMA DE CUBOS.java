import java.util.Scanner;
 
public class Main {
 
    public static boolean esCuboPerfecto(int x) {
        int r = (int) Math.round(Math.cbrt(x));
        return r * r * r == x;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for (int caso = 0; caso < t; caso++) {
            int N = sc.nextInt();
            boolean encontrado = false;
 
            int limite = (int) Math.cbrt(N);
            for (int a = 0; a <= limite && !encontrado; a++) {
                int a3 = a * a * a;
                for (int b = 0; b <= limite && !encontrado; b++) {
                    int b3 = b * b * b;
                    int c3 = N - a3 - b3;
                    if (c3 >= 0 && esCuboPerfecto(c3)) {
                        encontrado = true;
                    }
                }
            }
 
            if (encontrado) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
 
        sc.close();
    }
}