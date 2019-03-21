import java.util.Scanner;

public class REplacewithsumofgreaternode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		REplacewithsumofgreaternode b1 = new REplacewithsumofgreaternode();
		BST bst = b1.new BST();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int m = scn.nextInt();
			arr[i] = m;

		}

		int[] arr1 = new int[n];
		for (int j = 0; j < n; j++) {
			int sum = 0;
			for (int k = j; k < n; k++) {
				sum = sum + arr[k];
			}
			arr1[j] = sum;
		}

		bst.replace(arr1);
		bst.pre1();
	}

	public class BST {
		private class Node {
			int data;
			Node left;
			Node right;

		}

		private Node root;
		private int size;

		public BST() {
			this.root = null;
			this.size = 0;
		}

		public int size() {
			return this.size;
		}

		public boolean isEmpty() {
			return this.size() == 0;
		}

		public void display() {
			System.out.println(this);
		}

		public int max() {
			return this.max(this.root);
		}

		private int max(Node node) {
			int rv = node.data;

			if (node.right != null) {
				rv = this.max(node.right);
			}

			return rv;
		}

		@Override
		public String toString() {
			return this.toString(this.root);
		}

		private String toString(Node node) {
			if (node == null) {
				return "";
			}

			String retVal = "";

			if (node.left != null) {
				retVal += node.left.data + " => ";
			} else {
				retVal += "END" + " => ";
			}

			retVal += node.data;

			if (node.right != null) {
				retVal += " <= " + node.right.data;
			} else {
				retVal += " <= " + "END";
			}

			retVal += "\n";

			retVal += this.toString(node.left);
			retVal += this.toString(node.right);

			return retVal;
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

		public void replace(int[] arr1) {
			this.root = replace(arr1, 0, arr1.length - 1);
		}

		private Node replace(int[] arr1, int lo, int hi) {
			if (lo > hi) {
				return null;
			}
			int mid = (lo + hi) / 2;
			Node nn = new Node();
			nn.data = arr1[mid];
			nn.left = replace(arr1, lo, mid - 1);
			nn.right = replace(arr1, mid + 1, hi);
			return nn;
		}
	}
}
