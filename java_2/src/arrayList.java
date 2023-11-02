import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		System.out.println("enter n: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> b = new ArrayList<Integer>();
			//length of each line
			int l = sc.nextInt();
			for (int j = 0; j < l; j++) {
				b.add(sc.nextInt());
			}
			a.add(b);
		}
		System.out.println(a);
		System.out.println("enter q: ");
		int q = sc.nextInt();
		int x, y;
		for (int i = 0; i < q; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > n)
				System.out.println("ERROR!");
			else if (y <= a.get(x-1).size())
					System.out.println(a.get(x-1).get(y-1));
				else {
					System.out.println("ERROR!");
			}
		}
	}
}
/*
 * 3 2 13 14 3 1 2 3 2 45 67
 */
