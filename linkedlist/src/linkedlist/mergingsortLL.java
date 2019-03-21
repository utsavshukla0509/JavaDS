package linkedlist;

import java.util.Scanner;

public class mergingsortLL {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();

		mergingsortLL obj = new mergingsortLL();
		LinkedList list = obj.new LinkedList();

		for (int i = 0; i < N; i++) {
			list.addLast(scn.nextInt());
		}

		list.head = list.mergeSort(list.head);
		list.display();

	}

	public class LinkedList {
		private class Node {
			int data;
			Node next;

			Node(int data, Node next) {
				this.data = data;
				this.next = next;
			}
		}

		Node head;
		Node tail;
		int size;

		public LinkedList() {
			// TODO Auto-generated constructor stub
			this.head = null;
			this.tail = null;
			this.size = 0;
		}

		public int size() {
			return this.size;
		}

		public boolean isEmpty() {
			return this.size() == 0;
		}

		public void addFirst(int data) {
			Node node = new Node(data, this.head);
			this.head = node;
			if (this.isEmpty()) {
				this.tail = node;
			}
			this.size++;
		}

		public void addLast(int data) {
			Node node = new Node(data, null);
			if (this.isEmpty()) {
				this.head = node;
				this.tail = node;
			} else {
				this.tail.next = node;
				this.tail = node;
			}
			this.size++;
		}

		private Node getNodeAt(int index) throws Exception {
			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid Index");
			}

			Node temp = this.head;
			int counter = 0;
			while (counter < index) {
				temp = temp.next;
				counter++;
			}

			return temp;
		}

		public void addAt(int index, int data) throws Exception {
			if (index < 0 || index > this.size) {
				throw new Exception("Invalid Index");
			}
			if (index == 0) {
				this.addFirst(data);
			} else if (index == this.size) {
				this.addLast(data);
			} else {
				Node temp = this.getNodeAt(index - 1);
				Node node = new Node(data, temp.next);
				temp.next = node;
				this.size++;
			}

		}

		public int getFirst() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			return this.head.data;
		}

		public int getLast() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			return this.tail.data;
		}

		public int getAt(int index) throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid index");
			}

			return this.getNodeAt(index).data;
		}

		public void removeFirst() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			if (this.size == 1) {
				this.head = null;
				this.tail = null;
			} else {
				this.head = this.head.next;
			}
			this.size--;
		}

		public void removeLast() throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			if (this.size == 1) {
				this.head = null;
				this.tail = null;
			} else {
				Node temp = this.getNodeAt(this.size - 2);
				temp.next = null;
				this.tail = temp;
			}
			this.size--;
		}

		public void removeAt(int index) throws Exception {
			if (this.isEmpty()) {
				throw new Exception("List is Empty");
			}

			if (index < 0 || index >= this.size) {
				throw new Exception("Invalid Index");
			}

			if (index == 0) {
				this.removeFirst();
			} else if (index == this.size - 1) {
				this.removeLast();
			} else {
				Node temp = this.getNodeAt(index - 1);
				temp.next = temp.next.next;
				this.size--;
			}

		}

		public void display() {
			Node temp = this.head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}

		public Node sortedMerge(Node a, Node b) {
			Node result = null;

			if (a == null)
				return b;
			if (b == null)
				return a;
			if (a.data <= b.data) {
				result = a;
				result.next = sortedMerge(a.next, b);
			} else {
				result = b;
				result.next = sortedMerge(a, b.next);
			}
			return result;

		}

		public Node mergeSort(Node temp) {
			if (temp == null || temp.next == null) {
				return temp;
			}

			Node middle = middle(temp);
			Node temp1 = middle.next;

			middle.next = null;

			Node left = mergeSort(temp);

			Node right = mergeSort(temp1);

			Node sortedlist = sortedMerge(left, right);
			return sortedlist;
		}

		public Node middle(Node temp) {
			if (temp == null)
				return temp;
			Node temp1 = temp.next;
			Node temp2 = temp;

			while (temp1 != null) {
				temp1 = temp1.next;
				if (temp1 != null) {
					temp2 = temp2.next;
					temp1 = temp1.next;
				}
			}
			return temp2;
		}
	}

}
