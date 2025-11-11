import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // Calcetines rojos
        int B = scanner.nextInt(); // Calcetines azules
        
        int differentDays = Math.min(A, B);
        int remainingA = A - differentDays;
        int remainingB = B - differentDays;
        int sameDays = (remainingA + remainingB) / 2;
        
        System.out.println(differentDays + " " + sameDays);
    }
}