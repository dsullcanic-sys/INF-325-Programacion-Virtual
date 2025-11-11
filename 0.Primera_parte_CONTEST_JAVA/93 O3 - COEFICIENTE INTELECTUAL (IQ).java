import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        
        if(n == 3) {
            int dif1 = nums[1] - nums[0];
            int dif2 = nums[2] - nums[1];
            
            if(dif1 == dif2) {
                System.out.println(1);
            } else if(dif1 != dif2 && dif1 == nums[2] - nums[0]) {
                System.out.println(2);
            } else if(dif1 != dif2 && dif2 == nums[1] - nums[0]) {
                System.out.println(3);
            } else {
                System.out.println(1);
            }
            return;
        }
        
        int[] difs = new int[n-1];
        for(int i = 0; i < n-1; i++) difs[i] = nums[i+1] - nums[i];
        
        int difCorrecta;
        if(difs[0] == difs[1] || difs[0] == difs[2]) {
            difCorrecta = difs[0];
        } else if(difs[1] == difs[2]) {
            difCorrecta = difs[1];
        } else {
            int maxDif = Math.max(Math.max(difs[0], difs[1]), difs[2]);
            if(difs[0] == maxDif && difs[1] != maxDif && difs[2] != maxDif) {
                System.out.println(2);
                return;
            } else if(difs[1] == maxDif && difs[0] != maxDif && difs[2] != maxDif) {
                System.out.println(3);
                return;
            } else {
                System.out.println(4);
                return;
            }
        }
        
        for(int i = 0; i < difs.length; i++) {
            if(difs[i] != difCorrecta) {
                if(i == 0) {
                    System.out.println(difs[1] == difCorrecta ? 1 : 2);
                    return;
                } else if(i == difs.length-1) {
                    System.out.println(n);
                    return;
                } else {
                    if(difs[i-1] == difCorrecta && difs[i+1] == difCorrecta) {
                        System.out.println(i+2);
                    } else {
                        System.out.println(difs[i-1] != difCorrecta ? i+1 : i+2);
                    }
                    return;
                }
            }
        }
        System.out.println(n);
    }
}