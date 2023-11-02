import java.util.Scanner;
import java.util.ArrayList;

public class blockTower {
	public static int move(ArrayList<Integer> a) {
		int res = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			if (res < a.get(i)) {
				res = (res + a.get(i)) / 2 + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter t: ");
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				a.add(j, sc.nextInt());
			}
			System.out.println(move(a));
		}
	}
}
