import java.util.ArrayList;
import java.util.Scanner;


public class replacewithsum {
public static int count=0;
	public static void main(String[] args) {
		replacewithsum b1 = new replacewithsum();
		BST bst = b1.new BST();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n != 0) {
			int m = scn.nextInt();
			bst.add(m);
			--n;
		}
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> arr1 = bst.pre3(list);
		bst.replaceWLS(arr1);
		System.out.println(bst);
	}

	public class BST {
		private class Node {
			int data;
			Node left;
			Node right;

			Node(int data, Node left, Node right) {
				this.data = data;
				this.left = left;
				this.right = right;
			}
		}

		private Node root;
		private int size;

		public BST() {
			this.root = null;
			this.size = 0;
		}

		public void add(int data) {
			if (this.isEmpty()) {
				this.root = new Node(data, null, null);
				this.size++;
			} else {
				this.add(this.root, data);
			}
		}

		private void add(Node node, int data) {
			if (data > node.data) {
				if (node.right != null) {
					this.add(node.right, data);
				} else {
					this.size++;
					node.right = new Node(data, null, null);
				}
			} else if (data < node.data) {
				if (node.left != null) {
					this.add(node.left, data);
				} else {
					this.size++;
					node.left = new Node(data, null, null);
				}
			} else {
				// nothing to do
			}
		}

		public void remove(int data) {
			this.root = this.remove(this.root, data);
		}

		private Node remove(Node node, int data) {
			if (node == null) {
				return null;
			}

			if (data > node.data) {
				node.right = this.remove(node.right, data);
				return node;
			} else if (data < node.data) {
				node.left = this.remove(node.left, data);
				return node;
			} else {
				// found the element
				if (node.left == null && node.right == null) {
					this.size--;
					return null;
				} else if (node.left == null) {
					this.size--;
					return node.right;
				} else if (node.right == null) {
					this.size--;
					return node.left;
				} else {
					// both children
					int lmax = this.max(node.left);
					node.data = lmax;
					node.left = this.remove(node.left, lmax);

					return node;
				}
			}
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

		public void replaceWLS(ArrayList<Integer> arr1) {
			this.root = replaceWLS(this.root, arr1);
			System.out.println();
		}

		private Node replaceWLS(Node node, ArrayList<Integer> arr1) {
			if (node == null) {
				return node;
			}
			replaceWLS(node.left, arr1);
			count=0;
			for (int i = 0; i < arr1.size(); i++) {
				if (arr1.get(i) == node.data&&count==0) {
					count++;
					int sum = 0;
					for (int j = i + 1; j < arr1.size(); j++) {
						if (node.data < arr1.get(j)) {
							sum = sum + arr1.get(j);
						} else {
							continue;
						}

					}
					node.data = sum;
				}
			}
			replaceWLS(node.right, arr1);
			count=0;
			for (int i = 0; i < arr1.size(); i++) {
				if (arr1.get(i) == node.data&&count==0) {
					count++;
					int sum = 0;
					for (int j = i + 1; j < arr1.size(); j++) {
						if (node.data < arr1.get(j)) {
							sum = sum + arr1.get(j);
						} else {
							continue;
						}
					}
					if(sum==0) {
						node.data=sum+node.data;
					}
					else {
					node.data = sum;
				}}
			}
			return node;
		}

		public ArrayList<Integer> pre3(ArrayList<Integer> list) {

			return pre3(this.root, list);
		}

		private ArrayList<Integer> pre3(Node node, ArrayList<Integer> list) {
			if (node == null) {
				return list;
			} else {
				ArrayList<Integer> list1 = pre3(node.left, list);
				list1.add(node.data);
				ArrayList<Integer> list2 = pre3(node.right, list1);
				list = list2;

			}
			return list;
		}
	}
}
