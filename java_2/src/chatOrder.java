import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
 
public class chatOrder1 {
 
	static void Input(ArrayList<String> list, HashSet<String> hs) {
		Scanner sc = new Scanner(System.in);
		int n;
		//System.out.println("Enter n ");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String x;
			do {
				x = sc.nextLine();
			} while (x.isEmpty() || x.length() > 10);
			x.toLowerCase();
			list.add(x);
			hs.add(x);
		}
	}
 
	static void result(ArrayList<String> list, HashSet<String> hs) {
		for (int i = list.size() - 1; i >= 0; i--) {
           if(hs.contains(list.get(i)) && hs != null) {
        	   System.out.println(list.get(i));
        	   hs.remove(list.get(i));
           }
		}
	}
 
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
        Input(list,hs);
        result(list,hs);
	}
}
//https://codeforces.com/submissions/khuyen2903