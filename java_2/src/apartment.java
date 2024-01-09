import java.io.*;
import java.util.*;

public class apartment {
    public static class fastScanner {
        BufferedReader br;
        StringTokenizer st;

        public fastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public Long nextLong() {
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

    public static void result(fastScanner fs, PrintWriter pw) {
        int n = fs.nextInt();
        int m = fs.nextInt();
        int k = fs.nextInt();
        List<Long> applicant = new ArrayList<>();
        List<Long> apartment = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            applicant.add(fs.nextLong());
        }
        for (int i = 0; i < m; i++) {
            apartment.add(fs.nextLong());
        }
        Collections.sort(applicant);
        Collections.sort(apartment);
        int cnt = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (Math.abs(applicant.get(i) - apartment.get(j)) <= k) {
                cnt++;
                i++;
                j++;
            } else {
                if (applicant.get(i) - apartment.get(j) > k)
                    j++;
                else
                    i++;
            }
        }
        pw.println(cnt);
        pw.close();
    }

    public static void main(String[] args) {
        fastScanner fs = new fastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        result(fs, pw);

    }
}
//https://cses.fi/problemset/task/1084

