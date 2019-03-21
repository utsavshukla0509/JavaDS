package main;

import java.util.Arrays;
import java.util.Scanner;

public class histogram {

	public static void main(String args[]) throws Exception {
		// Your Code Here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		histogram obj = new histogram();
		StacksUsingArrays stack = obj.new StacksUsingArrays(arr.length);
		long[] ans = histogramUsingStacks(arr, stack);
		Arrays.sort(ans);
		System.out.print(ans[ans.length-1]);
		
	}

	public static long[] histogramUsingStacks(int[] arr, StacksUsingArrays stack) throws Exception {

		long []arr1=new long[arr.length];
		long count=1;
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
			int element =stack.pop();
			int j=i-1;
			int k=i+1;
			if(j==-1||k==arr.length) { 
		                                if(j!=-1) {
		                                	while(j>=0) {
		                            			if(arr[j]<element) {break;}
		                            			else {count++;}
		                            			j--;
		                            		}
		                                }
		                                else {while(k<arr.length) {
		                            		if(arr[k]<element) {break;}
		                            		else {count++;}
		                            		k++;
		                            		}
		                            	}
			
			 }
			else {
				while(j>=0) {
					if(arr[j]<element) {break;}
					else {count++;}
					j--;
				}
			while(k<arr.length) {
				if(arr[k]<element) {break;}
				else {count++;}
				k++;
				}
			}
			arr1[i]=element*count;
			count=1;
			}
			return arr1;
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(long arr) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = (int) arr;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}