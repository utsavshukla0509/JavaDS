package BinaryTree;

import java.util.LinkedList;
import java.util.Scanner;

public class levelorderBT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		levelorderBT obj = new levelorderBT();
		BinaryTree bt = obj.new BinaryTree();
		bt.levelOrderNewLine();

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

		public void levelOrderNewLine() {

			if (root == null)
				return;

			LinkedList<Node> queue = new LinkedList<Node>();
			queue.add(root);

			while (true) {
				int nodeCount = queue.size();
				if (nodeCount == 0)
					break;

				while (nodeCount > 0) {
					Node node = queue.peek();
					System.out.print(node.data + " ");
					queue.remove();
					if (node.left != null)
						queue.add(node.left);
					if (node.right != null)
						queue.add(node.right);
					nodeCount--;
				}
				System.out.println();
			}
		}

	}
}
