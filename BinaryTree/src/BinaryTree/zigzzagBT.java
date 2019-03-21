package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class zigzzagBT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		zigzzagBT m = new zigzzagBT();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
			levelOrderZZ(this.root);
		}

		public void levelOrderZZ(Node node) {
			if (node == null) {
				return;
			}
			Stack<Node> stack1 = new Stack<>();
			Stack<Node> stack2 = new Stack<>();

			stack1.push(node);
			boolean leftToRight = true;

			while (!stack1.isEmpty()) {

				Node node1 = stack1.pop();

				System.out.print(node1.data + " ");

				if (leftToRight) {
					if (node1.left != null) {
						stack2.push(node1.left);
					}

					if (node1.right != null) {
						stack2.push(node1.right);
					}
				} else {
					if (node1.right != null) {
						stack2.push(node1.right);
					}

					if (node1.left != null) {
						stack2.push(node1.left);
					}
				}

				if (stack1.isEmpty()) {
					leftToRight = !leftToRight;
					Stack<Node> temp = stack1;
					stack1 = stack2;
					stack2 = temp;
				}
			}
		}
	}
}
