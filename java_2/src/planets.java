import java.util.*;

public class planets {
	static int price(int a[], int c, int n) {
		int oneTime = 0;
		int moreOne = 0;
		for (int x : a) {
			if (x > 1)
				moreOne++;
			else if (x == 1)
				oneTime++;
		}
		System.out.println(oneTime + " " + moreOne);
		if (c == 1)
			return oneTime + moreOne;
		else {
			int price = oneTime + moreOne * c;
			if (price < n)
				return price;
			else
				return n;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, n, c;
		do {
			System.out.println(" The quantity of testcases: ");
			t = sc.nextInt();
		} while (t < 1 || t > 100);
		for (int i = 0; i < t; i++) {
			do {
				System.out.println(" The number of planets , the cost of 2th machine: ");
				n = sc.nextInt();
				c = sc.nextInt();
			} while (n < 1 || n > 100 || c < 1 || c > 100);
			int mark[] = new int[100];
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
				mark[a[j]]++;
			}
			System.out.println("The minimum cost: " + price(mark, c, n));
		}

	}
}
//https://codeforces.com/problemset/problem/1730/A
