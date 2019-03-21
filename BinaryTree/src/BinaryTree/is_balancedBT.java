package BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class is_balancedBT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		is_balancedBT m = new is_balancedBT();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}
			return child;
		}

		
public boolean isBalanced() {
	return isBalanced(this.root);
}
		private boolean isBalanced(Node root) {
			if (root == null)
				return true;
	 
			if (getHeight(root) == -1)
				return false;
	 
			return true;
		}
	 
		public int getHeight(Node root) {
			if (root == null)
				return 0;
	 
			int left = getHeight(root.left);
			int right = getHeight(root.right);
	 
			if (left == -1 || right == -1)
				return -1;
	 
			if (Math.abs(left - right) > 1) {
				return -1;
			}
	 
			return Math.max(left, right) + 1;
	 
		}
	}
}