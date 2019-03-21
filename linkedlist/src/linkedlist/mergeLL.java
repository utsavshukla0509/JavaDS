package linkedlist;

import java.util.Scanner;

public class mergeLL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		mergeLL obj = new mergeLL();
		LinkedList list = obj.new LinkedList();

		int N = scn.nextInt();
		int M = scn.nextInt();

		for (int i = 0; i < N; i++) {
			list.addLast(scn.nextInt());
		}

		LinkedList other = obj.new LinkedList();

		for (int i = 0; i < M; i++) {
			other.addLast(scn.nextInt());
		}

		LinkedList ll = merge(list, other);
		ll.sort();
		ll.display();

	}

	private static LinkedList merge(LinkedList list, LinkedList other) {
		if (list.size == 0) {
			return other;
		} else if (other.size == 0) {
			return list;
		}  else {
			list.tail.next = other.head;
			other.head = null;
			list.tail = null;
			list.size = list.size + other.size;

			return list;
		}
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

		public void sort() {
			Node temp1 = this.head;

			while (temp1 != null) {
				Node temp2 = temp1.next;
				{
					while (temp2 != null) {
						Node temp3 = new Node(0, null);
						temp3.data = 0;
						if (temp1.data > temp2.data) {
							temp3.data = temp1.data;
							temp1.data = temp2.data;
							temp2.data = temp3.data;
						}
						temp2 = temp2.next;
					}
					temp1 = temp1.next;
				}
			}
		}

	}

}
