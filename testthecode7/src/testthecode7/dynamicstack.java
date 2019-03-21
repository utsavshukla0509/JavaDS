package testthecode7;

import java.util.ArrayList;

public class dynamicstack extends stackusingarray{
	public dynamicstack() throws Exception {

		this(DEFAULT_CAPACITY);
	}
	public dynamicstack(int capacity) throws Exception{
		super(capacity);
	}
	public void push(int value)throws Exception{
		if(tos==data.length) {throw new Exception("Stack is full");
			
		}
int []arr=new int[2*this.data.length];
 for(int i=0;i<tos;i++) {
	 arr[i]=this.data[i];
 }
 
 this.data=arr;
 tos++;
 arr[tos]=value;
	}
}