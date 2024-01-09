import java.io.*;
import java.util.*;
public class ferrisWheel {
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
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
            return st.nextToken();
        }
        
    }
    public static void result(FastScanner fs, PrintWriter pr){
        int n = fs.nextInt();
        int x = fs.nextInt();
        List<Long> weight = new ArrayList<>();
        for(int i = 0; i < n; i++){
            weight.add(fs.nextLong()) ;
        }
        Collections.sort(weight);
        int cnt = 0;
        int i = 0;
        int j = n - 1;
        while(i <= j){
            if(weight.get(i) + weight.get(j) > x){
                cnt++;
                j--;
            }
            else {
                cnt++;
                j--;
                i++;
            }
        }
        pr.println(cnt);
        pr.flush();
        pr.close();
    }
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter pr = new PrintWriter(new BufferedOutputStream(System.out));
        result(fs,pr);
    }
}
//https://cses.fi/problemset/task/1090