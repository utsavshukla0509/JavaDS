
public class SegmentTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,8,7,6,-2,-8,4,9};
SegmentTree tree=new SegmentTree(arr);
tree.display();
System.out.println("*****************");
System.out.println(tree.query(2, 6));
System.out.println("*****************");
System.out.println(tree.query(4, 5));
System.out.println("*****************");
tree.update(3, 14);
tree.display();
System.out.println("*****************");
System.out.println(tree.query(2, 6));
	}

}
