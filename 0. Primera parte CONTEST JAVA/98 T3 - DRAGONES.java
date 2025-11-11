import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuerza = sc.nextInt();
        int numDragones = sc.nextInt();
        
        Dragon[] dragones = new Dragon[numDragones];
        for(int i = 0; i < numDragones; i++) {
            dragones[i] = new Dragon(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(dragones);
        
        for(Dragon d : dragones) {
            if(fuerza > d.fuerzaReq) {
                fuerza += d.bonus;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("SI");
    }
    
    static class Dragon implements Comparable<Dragon> {
        int fuerzaReq;
        int bonus;
        
        Dragon(int f, int b) {
            fuerzaReq = f;
            bonus = b;
        }
        
        @Override
        public int compareTo(Dragon o) {
            return Integer.compare(fuerzaReq, o.fuerzaReq);
        }
    }
}