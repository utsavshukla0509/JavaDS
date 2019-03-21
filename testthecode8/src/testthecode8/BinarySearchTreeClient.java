package testthecode8;

public class BinarySearchTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinarySearchTree tree=new BinarySearchTree();
tree.add(50);
tree.add(25);
tree.add(75);
tree.add(12);
tree.add(37);
tree.add(62);
tree.add(87);
tree.add(70);
tree.add(31);

tree.display();
System.out.println(tree.min());
System.out.println(tree.max());
//tree.remove(31);
//tree.display();
//tree.add(31);
//System.out.println();
tree.remove(87);
tree.display();
	}

}
