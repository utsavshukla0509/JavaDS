package testthecode7;

public class arrayusingqueue {

protected int[]data;
protected int front;
protected int size;

public static final int DEFAULT_CAPACITY=10;
public arrayusingqueue() throws Exception{
	this(DEFAULT_CAPACITY);
}
public arrayusingqueue(int capacity) throws Exception{
	if(capacity<1) {throw new Exception("invalid capacity");}
    this.data=new int [capacity];
    this.size=0;
    this.front=0;
}
public arrayusingqueue  size() {
	return this.size();
}
public boolean isEmpty() {
	return this.size==0;
}
public void enqueue(int value) throws Exception{
	if(this.size==this.data.length) {
		throw new Exception("queue is full");
	}
	int ai=(this.front+this.size)%this.data.length;
	this.data[ai]=value;
	this.size++;
}
public int dequeue() throws Exception{
	if(this.size==0) {
		throw new Exception("queue is empty");
	}
	int rr=this.data[this.front];
	this.data[this.front]=0;
	this.front=(this.front+1)%this.data.length;
	this.size--;
	return rr;
}
public int front() throws Exception{
	if(this.size==0) {throw new Exception("Queue is empty");}
	int rc=this.data[this.size];
	return rc;
}
public void display() {
  for(int i=0;i<this.size;i++) {
	  int ai=(this.size+i)%this.data.length;
	  System.out.println(this.data[ai]);
  }
}
}
