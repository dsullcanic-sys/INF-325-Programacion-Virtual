import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        
    
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }
        
    
        Arrays.sort(numbers);
        
    
        int total = numbers[3];
        
    
        int a = total - numbers[2];
        int b = total - numbers[1];
        int c = total - numbers[0];
        
    
        int[] result = {a, b, c};
        Arrays.sort(result);
        
    
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}