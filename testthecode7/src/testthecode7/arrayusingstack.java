package testthecode7;

public class arrayusingstack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
stackusingarray stack=new stackusingarray(5);
for(int i=1;i<=5;i++) {
	stack.push(i*10);
	stack.display();
}
while(!stack.isEmpty()) {
	stack.display();
	stack.pop();
	
}
stack.pop();
	}

}
