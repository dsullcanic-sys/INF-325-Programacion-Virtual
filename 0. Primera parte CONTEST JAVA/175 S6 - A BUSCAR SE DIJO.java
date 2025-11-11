import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            String[] parts = br.readLine().split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            int C = Integer.parseInt(parts[2]);

            if (A + B >= 10 || A + C >= 10 || B + C >= 10) {
                sb.append("SI\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb.toString());
    }
}
