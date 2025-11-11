import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];

        for(int i = 0; i < n; i++) nums[i] = sc.nextLong();

        int max = 1, actual = 1;

        for(int i = 1; i < n; i++) {
            if(nums[i] >= nums[i-1]) {
                actual++;
                if(actual > max) max = actual;
            } else {
                actual = 1;
            }
        }
        System.out.println(max);
    }
}