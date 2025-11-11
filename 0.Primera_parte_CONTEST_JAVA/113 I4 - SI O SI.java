import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < T; i++) {
            String s = scanner.nextLine();
            if (s.length() == 2 && s.equalsIgnoreCase("si")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}