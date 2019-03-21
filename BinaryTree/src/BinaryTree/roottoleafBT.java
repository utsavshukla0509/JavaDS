package BinaryTree;

import java.util.Scanner;

public class roottoleafBT {
static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roottoleafBT obj = new roottoleafBT();
		BinaryTree tree = obj.new BinaryTree();

		
		int n = s.nextInt();
		String str="";
		tree.roottoleaf(str, n);
	}

	public class BinaryTree{
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

		public BinaryTree() {
			
			this.root = takeinput(s, null, false);
		}

		private Node takeinput(Scanner s, Node parent, boolean isleftorright) {
			// if (parent == null) {
			// System.out.println("Enter the root Node");
			// } else {
			// if (isleftorright) {
			// System.out.println("Enter the data for left child of node" + " " +
			// parent.data);
			// } else {
			// System.out.println("Enter the data for right child of node" + " " +
			// parent.data);
			// }
			// }
			int nodedata = s.nextInt();
			Node node = new Node(nodedata, null, null);
			this.size++;
			boolean choice = false;
			// System.out.println("Do you want to create a left child" + node.data);
			choice = s.nextBoolean();
			if (choice) {
				node.left = takeinput(s, node, true);
			}
			choice = false;
			// System.out.println("Do you want to create a right child" + node.data);
			choice = s.nextBoolean();
			if (choice) {
				node.right = takeinput(s, node, false);
			}
			return node;

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

		public void roottoleaf(String str, int n) {

			roottoleaf1(this.root, str, n, 0);
		}

		private void roottoleaf1(Node node, String str, int n, int sum) {
			if (flag > 0) {
				return;
			}
			if (node == null) {
				if (sum == n) {

					System.out.print(str);
					System.out.println();
					flag++;
					return;
				}

				return;
			}
			if (sum > n) {
				return;
			}
			

			str+=node.data+" ";
			sum += node.data;
			roottoleaf1(node.left, str, n, sum);
			roottoleaf1(node.right, str, n, sum);
			flag = 0;
		}

	}
public static int flag=0;
}
