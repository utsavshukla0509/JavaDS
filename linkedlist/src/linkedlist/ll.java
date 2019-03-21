package linkedlist;

public class ll {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		 list.addFirst(10);
		 list.display();
				
				list.addLast(20);
				 list.addLast(30);
				 list.addLast(40);
				 list.addLast(50);
				 list.addAt(2, 25);
				 list.addFirst(5);
				 list.display();

				 System.out.println(list.getFirst());
				 System.out.println(list.getLast());
				 System.out.println(list.getAt(2));

				 list.removeFirst();
				 list.display();
			
				 list.removeLast();
			 list.display();
				
				 list.removeAt(2);
				 list.display();

//				list.addLast(10);
//				list.addLast(20);
//				list.addLast(30);
//				list.addLast(40);
//
//				list.addLast(50);
//				list.display();
//				list.display();
	}

}
