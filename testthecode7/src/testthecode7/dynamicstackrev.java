package testthecode7;

public class dynamicstackrev {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
dynamicstack stack=new dynamicstack(5);
for(int i=1;i<=5;i++) {
	stack.push(i*10);
}
dynamicstack helper=new dynamicstack(5);
stack.display();
reversestack(stack,helper);
stack.display();
	}
	public static void reversestack(dynamicstack stack,dynamicstack helper) {
		
	}

}
