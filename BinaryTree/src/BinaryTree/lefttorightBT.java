package BinaryTree;

import java.util.Scanner;

public class lefttorightBT {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lefttorightBT obj = new lefttorightBT();
		BinaryTree tree = obj.new BinaryTree();
tree.printLeafNodes();
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

			// return
			return child;
		}
public void printLeafNodes() {
	printLeafNodes(this.root);
}
		private void printLeafNodes(Node node) {
			if (node == null) {
				return;
			}
			if (node.left == null && node.right == null) {
				System.out.printf("%d ", node.data);
			}
			printLeafNodes(node.left);
			printLeafNodes(node.right);
		}

	}
}
