import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        while (casos-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            
            System.out.println(calcular(p));
        }
    }
    
    public static int calcular(int[] p) {
        int min = p[0], max = p[0];
        int posMin = 0, posMax = 0;
        
        for (int i = 1; i < p.length; i++) {
            if (p[i] < min) {
                min = p[i];
                posMin = i;
            }
            if (p[i] > max) {
                max = p[i];
                posMax = i;
            }
        }
        
        if (posMin > posMax) {
            int temp = posMin;
            posMin = posMax;
            posMax = temp;
        }
        
        int op1 = posMax + 1;
        int op2 = p.length - posMin;
        int op3 = (posMin + 1) + (p.length - posMax);
        
        return Math.min(op1, Math.min(op2, op3));
    }
}