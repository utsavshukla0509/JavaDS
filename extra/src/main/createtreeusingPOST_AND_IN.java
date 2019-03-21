package main;

import java.util.Scanner;

public class createtreeusingPOST_AND_IN {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		createtreeusingPOST_AND_IN m = new createtreeusingPOST_AND_IN();
		int[] post = takeInput();
		int[] in = takeInput();
		int n = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == post[post.length - 1]) {
				n = i;
			}
		}
		BinaryTree bt = m.new BinaryTree();

		bt.add(in, n);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public void add(int[] arr1, int n) {
			this.root = add(arr1, n, 0, arr1.length - 1);
		}

		private Node add(int[] arr1, int n, int lo, int hi) {
			if (arr1.length % 2 != 0) {
				if (lo > hi) {
					return null;
				}
				int mid = n;
				Node nn = new Node();
				nn.data = arr1[mid];
				nn.left = add(arr1, ((lo + mid) / 2), lo, mid - 1);
				nn.right = add(arr1, ((hi + mid) / 2) + 1, mid + 1, hi);
				return nn;
			} else {
				if (lo > hi) {
					return null;
				}
				int mid = n;
				Node nn = new Node();
				nn.data = arr1[mid];
				nn.left = add(arr1, ((lo + mid) / 2), lo, mid - 1);
				nn.right = add(arr1, ((hi + mid) / 2) + 1, mid + 1, hi);

				return nn;
			}
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
