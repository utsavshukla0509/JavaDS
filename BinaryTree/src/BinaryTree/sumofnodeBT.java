package BinaryTree;

import java.util.Scanner;

public class sumofnodeBT {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		sumofnodeBT m = new sumofnodeBT();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.sumOfNodes(0));

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

		public int sumOfNodes(int n) {
			return this.sumOfNodes(this.root,n) ;
		}
		
		private int sumOfNodes(Node node,int n) {
			
			if (node == null) {
				return n;
			}
			n=n+node.data;
			int a=this.sumOfNodes(node.left,n);
			int b=this.sumOfNodes(node.right,a);

			return b;
		}
	}
}
