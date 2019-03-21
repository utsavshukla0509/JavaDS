package testthecode7;

public class dynamicqueue extends arrayusingqueue {

	public dynamicqueue() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public dynamicqueue(int capacity) throws Exception {
		super(capacity);
	}

	public void enqueue(int value) throws Exception {
		if (this.size == this.data.length) {

			int[] arr = new int[this.data.length];
			for (int i = 0; i < this.size; i++) {
             arr[i]=this.data[(this.front+i)%this.data.length];
			}
			this.data=arr;
			this.front=0;
		}
		super.enqueue(value);
	}
}
