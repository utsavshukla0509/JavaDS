package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListoflevelsBT {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayListoflevelsBT obj = new ArrayListoflevelsBT();
		BinaryTree tree = obj.new BinaryTree();
		System.out.println(tree.levelArrayList());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;
		private ArrayList list;

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


		public ArrayList<ArrayList<Integer>> levelArrayList() {
			return levelArrayList(this.root);
		}
		private ArrayList<ArrayList<Integer>> levelArrayList(Node root)
		{
		    int h = height(root);
		    int i;
		    list = new ArrayList<>();
		    
		    ArrayList<ArrayList<Integer>>list2=new ArrayList<>();
		    for (i=1; i<=h; i++)
		    {ArrayList list1=new ArrayList<>();
		       list=printGivenLevel(root, i,list1);
		        list2.add(list);
		    }
		    return list2;
		}
		public ArrayList<ArrayList<Integer>> printGivenLevel(Node root, int level,ArrayList list1)
		{
		    if (root == null)
		        return list1;
		    if (level == 1)
		        list1.add(root.data);
		    else if (level > 1)
		    {
		       ArrayList listl= printGivenLevel(root.left, level-1,list1);
		       ArrayList  listr=printGivenLevel(root.right, level-1,listl);
		      // list1= listr;
		    }
		   return list1;
		}
		public  int height(Node root) {
			if (null == root)
				return 0;
			int hLeftSub = height(root.left);
			int hRightSub = height(root.right);
			return Math.max(hLeftSub, hRightSub) + 1;
		}

//         //50 true 12 true 18 false false true 13 false false true 70 true 56 false false true 81 false false

	}
}
