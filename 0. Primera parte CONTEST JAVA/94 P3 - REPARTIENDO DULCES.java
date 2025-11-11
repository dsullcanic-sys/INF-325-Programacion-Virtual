import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        for(int i = 0; i < casos; i++) {
            int num = sc.nextInt();
            System.out.println(num < 2 ? 0 : (num - 1) / 2);
        }
    }
}