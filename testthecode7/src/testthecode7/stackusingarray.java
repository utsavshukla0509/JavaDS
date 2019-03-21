package testthecode7;

public class stackusingarray {
	protected int[] data;
	protected int tos;
	public static final int DEFAULT_CAPACITY = 10;

	public stackusingarray() throws Exception {

		this(DEFAULT_CAPACITY);
	}

	public stackusingarray(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("Invalid Capacity");
		}
		this.data = new int[capacity];
		tos=-1;
	}

	public int size() {

		return this.tos;
	}

	public boolean isEmpty() {
		if (tos == -1) {
			return true;
		} else {
			return false;
		}
	}
public void push(int value)throws Exception{
	if(tos==data.length) {throw new Exception("Stack is full");
		
	}
	this.data[this.tos]=value;
}
public int pop() throws Exception{
	if(this.size()==0) {throw new Exception("Stack is empty");}
	int rv=this.data[this.tos];
	this.data[this.tos]=0;
	tos--;
	return rv;
}
public int top() throws Exception{
	if(this.size()==0) {throw new Exception("stack is empty");}
	 int rv=this.data[this.tos];
	 return rv;
	}
public void display() {
	for(int i=this.size()-1;i>=0;i--) {
		System.out.println(this.data[this.tos]);
	}
}
}

