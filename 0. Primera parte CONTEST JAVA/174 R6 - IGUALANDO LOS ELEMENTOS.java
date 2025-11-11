import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine().trim()); // número de casos
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().split(" ");
            long[] A = new long[n];
            long maxVal = Long.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                A[i] = Long.parseLong(parts[i]);
                if (A[i] > maxVal) {
                    maxVal = A[i];
                }
            }
            
            long maxDiff = 0;
            for (int i = 0; i < n; i++) {
                maxDiff = Math.max(maxDiff, maxVal - A[i]);
            }
            
            sb.append(maxDiff).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}