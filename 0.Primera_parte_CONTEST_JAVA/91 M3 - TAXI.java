import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGrupos = sc.nextInt();
        int[] grupos = new int[5];
        
        for(int i = 0; i < numGrupos; i++) grupos[sc.nextInt()]++;
        
        int taxis = grupos[4];
        int combinar = Math.min(grupos[3], grupos[1]);
        taxis += combinar;
        grupos[3] -= combinar;
        grupos[1] -= combinar;
        taxis += grupos[3];
        taxis += grupos[2] / 2;
        grupos[2] %= 2;
        
        if(grupos[2] > 0) {
            taxis++;
            grupos[1] = Math.max(0, grupos[1] - 2);
        }
        
        taxis += (grupos[1] + 3) / 4;
        System.out.println(taxis);
    }
}