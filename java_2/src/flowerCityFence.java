import java.util.*;
public class flowerCityFence {
	static int searchX(int a[], int x) {
		int l = 0, r = a.length - 1;
		int index = 0;
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (a[m] >= x){
					index = m + 1;
					l = m + 1;
			}              
			else {
					r = m - 1;
			}
		}
		return index;
	}
	static void check(int a[]) {
		int cnt = 0;
		for (int j = 0; j < a.length; j++) {
			if(searchX(a, j + 1)== a[j]) cnt++;
		}
		if(cnt == a.length) System.out.println("YES");
		else System.out.println("NO");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t, n;
		do {
			System.out.println("the number of testcase: ");
			t = sc.nextInt();
		} while (t < 0 || t > 10000);
		for (int i = 0; i < t; i++) {
			System.out.println("Enter n: ");
			n = sc.nextInt();
			int a[] = new int[n];
			
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			check(a);
		}
	}
}
/*
7
5
5 4 3 2 1
3
3 1 1
3
4 2 1
1
2
5
5 3 3 1 1
5
5 5 5 3 3
2
6 1

 */
