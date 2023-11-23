import java.util.Scanner;

public class node {
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is empty!");
		} else {
			while (current != null) {
				System.out.println(current.value + "\n");
				current = current.next;
			}
		}
	}

	public void insertAtBeginning(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertAtTail(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		newNode.next = null;
		tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = newNode;
	}

	public void insertAfterANode(Node preNode, int value) {
		Node newNode = new Node(value);
		if (preNode == null) {
			System.out.println("Previous Node is invalid!");
		}
		newNode.next = preNode.next;
		preNode.next = newNode;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		node lList = new node();
		int n;
		System.out.println("Enter n: ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			lList.addNode(sc.nextInt());
		}
		lList.insertAfterANode(lList.head.next, 4);
		lList.display();
	}
}
