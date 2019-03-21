package main;

import java.util.LinkedList;

import java.util.*;

public class treetopview {

	public static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treetopview obj = new treetopview();
		BinaryTree tree = obj.new BinaryTree();

		tree.topview();
	}

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
		private Scanner s;

		public BinaryTree() {
			s = new Scanner(System.in);
			this.root = takeinput();
		}

		private Node takeinput() {
			LinkedList<Node> queue = new LinkedList<Node>();
			Node n = new Node(s.nextInt(), null, null);
			queue.add(n);

			this.size++;
			while (!queue.isEmpty()) {
				Node temp = queue.getFirst();
				Node node1 = new Node(s.nextInt(), null, null);

				Node node2 = new Node(s.nextInt(), null, null);

				if (node1.data != -1) {
					temp.left = node1;
					queue.addLast(node1);
					this.size++;
				}
				if (node2.data != -1) {
					temp.right = node2;
					queue.addLast(node2);
					this.size++;
				}
				queue.removeFirst();
			}
			return n;
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

		public void topview() {
			this.topview(this.root);
		}

		private void topview(Node node) {

			String str = "";

			Node left = node.left;
			Node right = node.right;

			String str1 = "";
			while (left != null) {
				str1 += left.data + " ";
				left = left.left;
			}

			StringBuilder str2 = new StringBuilder();
			str2.append(str1);
			str2 = str2.reverse();

			str += str2;

			str += " " + node.data + " ";

			while (right != null) {
				str += right.data + " ";
				right = right.right;
			}

			System.out.print(str.substring(1));
		}

	}

}
