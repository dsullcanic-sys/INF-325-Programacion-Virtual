import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] positions = new int[3];
        for (int i = 0; i < 3; i++) {
            positions[i] = scanner.nextInt();
        }
        Arrays.sort(positions);
        int meetingPoint = positions[1];
        int totalDistance = Math.abs(positions[0] - meetingPoint) + 
                          Math.abs(positions[1] - meetingPoint) + 
                          Math.abs(positions[2] - meetingPoint);
        
        System.out.println(totalDistance);
    }
}