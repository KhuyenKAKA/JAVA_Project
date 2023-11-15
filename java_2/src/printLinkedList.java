import java.util.Scanner;
import java.util.LinkedList;

public class printlLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int n;
		System.out.println("Enter quantity of elements: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ll.add(sc.nextInt());
		}
		for (int x : ll) {
			System.out.println("\n" + x);
		}
	}
}
//https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem?isFullScreen=true