package testthecode8;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//50 true 25 true 12 false false true 86 false false true 75 true 19 false false true 81 false false
BinaryTree tree=new BinaryTree();
tree.display();
System.out.println(tree.size());
//System.out.println(tree.max());
tree.pre1();
System.out.println();
tree.pre2();
System.out.println();
tree.pre3();
System.out.println();
System.out.println(tree.isbst());
	}

}

//10 true 16 true 4 true 10 false false false true 10 false true 4 false false true 4 false true 10 false true 15 true 1 true 5 false false false false