package BinaryTree;

import java.util.Scanner;


public class lowestcommonancestorBT {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		lowestcommonancestorBT m = new lowestcommonancestorBT();
		BinaryTree bt = m.new BinaryTree();
		int n=scn.nextInt();
		int p=scn.nextInt();
		System.out.println(bt.lca(n,p));

	}
	public class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;

			public Node(int data, Node left, Node right) {
				// TODO Auto-generated constructor stub
				this.data = data;
				this.left = left;
				this.right = right;
			}
		}

		private Node root;
		private int size;

		public BinaryTree() {
			// TODO Auto-generated constructor stub
			
			this.root = takeInput(scn, null, false);
		}

		private Node takeInput(Scanner scn, Node parent, boolean isLeftorRight) {
			
			int nodeData = scn.nextInt();
			Node node = new Node(nodeData, null, null);
			this.size++;

			boolean choice = false;
			//System.out.println("Do you have left child for " + node.data);
			choice = scn.nextBoolean();
			if (choice) {
				node.left = this.takeInput(scn, node, true);
			}

			choice = false;
			//System.out.println("Do you have right child for " + node.data);
			choice = scn.nextBoolean();
			if (choice) {
				node.right = this.takeInput(scn, node, false);
			}

			return node;

		}

	

		public int lca(int data1, int data2) {
			return this.lca(this.root, data1, data2).data;
		}

		private Node lca(Node node, int data1, int data2) {
			if (node == null) {
				return null;
			}
			if (node.data == data1 || node.data == data2) {
				return node;
			}
			Node llca = this.lca(node.left, data1, data2);
			Node rlca = this.lca(node.right, data1, data2);

			if (llca != null && rlca != null) {
				return node;
			} else if (llca != null) {
				return llca;
			} else if (rlca != null) {
				return rlca;
			} else {
				return null;
			}
		}

	}

}
