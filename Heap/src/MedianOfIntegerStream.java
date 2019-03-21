
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Queue;

public class MedianOfIntegerStream {

	public Queue<Integer> minHeap;
	public Queue<Integer> maxHeap;
	public int numOfElements;
	private static Scanner s;

	public MedianOfIntegerStream() {
		minHeap = new PriorityQueue<Integer>();
		maxHeap = new PriorityQueue<Integer>(10, new MaxHeapComparator());
		numOfElements = 0;
	}

	public void insert(Integer num) {
		maxHeap.add(num);
		if (numOfElements % 2 == 0) {
			if (minHeap.isEmpty()) {
				numOfElements++;
				return;
			} else if (maxHeap.peek() > minHeap.peek()) {
				Integer maxHeapRoot = maxHeap.poll();
				Integer minHeapRoot = minHeap.poll();
				maxHeap.add(minHeapRoot);
				minHeap.add(maxHeapRoot);
			}
		} else {
			minHeap.add(maxHeap.poll());
		}
		numOfElements++;
	}

	@SuppressWarnings("deprecation")
	public String getMedian() {
		String str="";
		if (numOfElements % 2 != 0)
			return str+maxHeap.peek();
		else
			return str+maxHeap.peek() +" "+ minHeap.peek();
	}

	private class MaxHeapComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		MedianOfIntegerStream streamMedian = new MedianOfIntegerStream();

		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			streamMedian.insert(s.nextInt());
		}
		System.out.println(streamMedian.getMedian()); // should be 5

	}
}