package testthecode10;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Heap heap=new Heap<>();
//
//heap.add(35);
//heap.add(30);
//heap.add(20);
//heap.add(8);
//heap.add(12);
//heap.add(25);
//heap.add(10);
//heap.add(5);
//heap.add(15);
//heap.display();
//System.out.println("**********");
//heap.add(45);
//heap.display();
	

//heap.add(new Student(2,800,"A"));
//heap.add(new Student(5,500,"B"));
//heap.add(new Student(4,600,"C"));
//heap.add(new Student(8,200,"D"));
//
//heap.add(new Student(1,900,"E"));
//heap.add(new Student(9,100,"F"));
//heap.add(new Student(7,300,"G"));
//heap.add(new Student(3,700,"H"));
//heap.add(new Student(6,400,"I"));
//
//heap.display();
//
//System.out.println("*********");
//heap.remove();
//heap.display();

Student[] students=new Student[9];
students[0]=new Student(2,800,"A");
students[1]=new Student(5,500,"B");
students[2]=new Student(4,600,"C");
students[3]=new Student(8,200,"D");

students[4]=new Student(1,900,"E");
students[5]=new Student(9,100,"F");
students[6]=new Student(7,300,"G");
students[7]=new Student(3,700,"H");
students[8]=new Student(6,400,"I");
Heap<Student> heap=new Heap<>(students,false);
heap.display();

}

private static class Student implements Comparable<Student>{
int marks;
String name;
int rank;

public Student(int rank,int marks,String name) {
	// TODO Auto-generated constructor stub
	this.rank=rank;
	this.marks=marks;
	this.name=name;
}

public String toString() {
	return "{name="+this.name+"; marks="+this.marks+"; rank="+this.rank+"}";
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.marks-o.marks;
}
}}