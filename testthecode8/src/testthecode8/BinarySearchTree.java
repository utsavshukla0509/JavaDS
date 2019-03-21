package testthecode8;

public class BinarySearchTree {
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

	BinarySearchTree() {
		this.root = null;
		this.size = 0;
	}

	public void add(int data) {
		if (this.root == null) {
			Node mnode = new Node(data, null, null);
			this.root = mnode;
			this.size++;
		} else {
			this.add(this.root, data);
		}
	}

	private void add(Node node, int data) {

		if (data < node.data) {
			if (node.left == null) {
				Node lnode = new Node(data, null, null);
				node.left = lnode;
				this.size++;
			} else {
				add(node.left, data);
			}
		} else {
			if (node.right == null) {
				Node rnode = new Node(data, null, null);
				node.right = rnode;
				this.size++;
			} else {
				add(node.right, data);
			}
		}

	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		int rv = node.data;
		if (node.left != null) {
			rv = min(node.left);
		}
		return rv;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int rv = node.data;
		if (node.left != null) {
			rv = max(node.right);
		}
		return rv;
	}

	public void remove(int data) {
		this.remove(this.root, data,this.root);
	}

	private void remove(Node node, int data,Node node1) {
		if (node.data == data) {

			if (node.left != null||node.right!=null) {
				node1=node.left;
				node1=node.right;
                return;      
			}
			if(node.left == null&&node.right==null) {
				node1.left=null;
				
				return;
			}
			
		}
		
		node1.data=node.data;
		

		if (data < node.data) {
			remove(node.left, data,node1);
		} else {
			remove(node.right, data,node1);
		}

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
}
