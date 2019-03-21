package testthecode7;

public class arrayusingq {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
arrayusingqueue queue=new arrayusingqueue(5);
for(int i=1;i<=5;i++) {
	queue.enqueue(i*10);
	queue.display();
}
while(!queue.isEmpty()) {
	queue.display();
	queue.dequeue();
	
}
queue.dequeue();
	}
}
