package main;

import java.util.Scanner;

public class greatestnousingstack {
	
	public class stackpracticeback {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 100;

		public stackpracticeback() throws Exception {
			this(DEFAULT_CAPACITY);
		}

		public stackpracticeback(int capacity) throws Exception {
			if (capacity < 1) {
				throw new Exception("Invalid Capacity");
			}

			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public void push(int value) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is full");
			}

			this.tos++;
			this.data[this.tos] = value;
		}

		public void display() {
			for (int i = this.tos; i >= 0; i--) {
				System.out.print(this.data[i] + ", ");
			}

			System.out.println("END");
		}
		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}

			int rv = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return rv;
		}
		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}
		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}

			int rv = this.data[this.tos];
			return rv;
		}
		public void greatest(stackpracticeback stack ,int arr[], int n) throws Exception 
	    {
	        int i = 0;
	
	        stack.tos = -1;
	        int element, next;
	 
	        stack.push(arr[0]);
	 
	        for (i = 1; i < n; i++) 
	        {
	            next = arr[i];
	 
	            if (stack.isEmpty() == false) 
	            {
	                element = stack.pop();
	 
	                while (element < next) 
	                {
	                    System.out.println(element+","+next);
	                    if (stack.isEmpty() == true)
	                        break;
	                    element = stack.pop();
	                }
	 
	                if (element > next)
	                    stack.push(element);
	            }
	 
	            stack.push(next);
	        }
	 
	        while (stack.isEmpty() == false) 
	        {
	            element = stack.pop();
	            next = -1;
	            System.out.println(element+ "," +next);
	        }
	    }
	}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	//	greatestnousingstack obj=new greatestnousingstack();
		stackpracticeback stack = obj.new stackpracticeback();
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int m = s.nextInt();
			int arr[] = new int[m];
			for (int j = 0; j < m; j++) {
				arr[j]=s.nextInt();		
			}
			stack.greatest(stack,arr,arr.length);
			}
		}
}

	
