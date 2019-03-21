package testthecode8;

import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public BinaryTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeinput(s, null, false);
	}

	private Node takeinput(Scanner s, Node parent, boolean isleftorright) {
		if (parent == null) {
			System.out.println("Enter the root Node");
		} else {
			if (isleftorright) {
				System.out.println("Enter the data for left child of node" + " " + parent.data);
			} else {
				System.out.println("Enter the data for right child of node" + " " + parent.data);
			}
		}
		int nodedata = s.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;
		boolean choice = false;
		System.out.println("Do you want to create a left child" + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeinput(s, node, true);
		}
		choice = false;
		System.out.println("Do you want to create a right child" + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeinput(s, node, false);
		}
		return node;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {

		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END" + "=>");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.println("<=" + node.right.data);
		} else {
			System.out.println("<=" + "END");
		}
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}

	public int size() {
		int m = size(this.root);
		return m;
	}

	private int size(Node node) {
		int count = 0;
		count++;
		if (node.left != null) {

			count = count + size(node.left);
		}
		if (node.right != null) {
			count = count + size(node.right);
		}
		return count;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int n = 0;
		int m = 0;
		int max = 0;

		if (node.left != null) {

			m = max(node.left);
		}
		if (node.right != null) {
			n = max(node.right);
		}
		if (n > m) {
			max = n;
		} else {
			max = m;
		}
		return max;
	}

	public void pre1() {
		pre(this.root);
	}

	private void pre(Node node) {
		if (node == null) {
			return;
		} else {
			System.out.print(node.data + " ");
			pre(node.left);
			pre(node.right);
		}
	}

	public void pre2() {
		pre2(this.root);
	}

	private void pre2(Node node) {
		if (node == null) {
			return;
		} else {
			pre2(node.left);

			pre2(node.right);
			System.out.print(node.data + " ");
		}
	}

	public void pre3() {
		pre3(this.root);
	}

	private void pre3(Node node) {
		if (node == null) {
			return;
		} else {
			pre3(node.left);
			System.out.print(node.data + " ");
			pre3(node.right);

		}
	}

	public boolean isbst() {
		return isbst(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isbst(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		}
		if (!isbst(node.left, min, node.data)) {
			return false;
		} else if (!isbst(node.right, node.data, max)) {
			return false;
		}
		return true;
	}
	public void levelorder() {
		levelorder(this.root);
	}
	private void levelorder(Node node) {
		
	}
}
