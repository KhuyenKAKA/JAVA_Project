
import java.io.*;
import java.util.*;


public class DistinctNumbers {
    public static class FasterScanner {
        BufferedReader br;
        StringTokenizer st;

        public FasterScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        String next() {
            while (!st.hasMoreTokens()) try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            {
                return st.nextToken();
            }
        }
    }

    public static void main(String[] args) {
        FasterScanner fs = new FasterScanner();
        PrintWriter pr = new PrintWriter(System.out);
        HashSet<Long> set = new HashSet<>();
        int n = fs.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(fs.nextLong());
        }
        pr.println(set.size());
        pr.flush();
        pr.close();
    }
}
//https://cses.fi/problemset/task/1621