import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        while (K-- > 0) {
            int[] nums = new int[7];
            for (int i = 0; i < 7; i++) {
                nums[i] = sc.nextInt();
            }
            
            Arrays.sort(nums);
            
            System.out.println(nums[0] + " " + nums[1] + " " + (nums[6] - nums[0] - nums[1]));
        }
    }
}