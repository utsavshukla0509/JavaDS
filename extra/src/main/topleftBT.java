package main;

import java.util.LinkedList;
import java.util.Scanner;

public class topleftBT {
	public static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topleftBT obj = new topleftBT();
		BinaryTree tree = obj.new BinaryTree();

		tree.TLBT();
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

		public void TLBT() {
			TLBT(this.root,1);
		}

		private void TLBT(Node node,int level) {

			
			        
			        if (node==null) {return;}
			 
			      
			        if (max < level)
			        {
			            System.out.print(node.data+" ");
			            max = level;
			        }
			 
			       
			        TLBT(node.left, level+1);
			        TLBT(node.right, level+1);
			    }
		
	}
public static int max=0;
}
