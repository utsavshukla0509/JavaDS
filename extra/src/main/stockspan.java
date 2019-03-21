package main;

import java.util.Scanner;

public class stockspan {
	public static void main(String args[]) throws Exception {
		// Your Code Here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] prices = new int[N];
		for (int i = 0; i < N; i++) {
			prices[i] = s.nextInt();
		}
		stockspan obj = new stockspan();
		StacksUsingArrays stack = obj.new StacksUsingArrays(prices.length);
		int[] ans = StockSpanUsingStacks(prices, stack);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println("END");

	}

	public static int[] StockSpanUsingStacks(int[] prices, StacksUsingArrays stack) throws Exception {
		int[] arr1 = new int[prices.length];
		int count = 1;
		for (int i = 0; i < prices.length; i++) {
			stack.push(prices[i]);
			int j = i;
			if (j == 0) {
				count = 1;
				stack.pop();
			} else {
				int element = stack.pop();
				while (j != 0) {
					if (prices[j - 1] < element) {
						count++;
						j--;
					} else {
						break;
					}
				}
			}
			arr1[i] = count;
			count = 1;
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

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
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
