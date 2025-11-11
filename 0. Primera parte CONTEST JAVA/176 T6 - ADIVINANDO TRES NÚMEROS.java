import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        long[] arr = new long[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Long.parseLong(parts[i]);
        }
        Arrays.sort(arr);

        long sumABC = arr[3];    // mayor valor
        long sumAB = arr[0];
        long sumAC = arr[1];
        
        long C = sumABC - sumAB;
        long A = sumAC - C;
        long B = sumABC - A - C;

        long[] res = {A, B, C};
        Arrays.sort(res);
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }
}
