class Student{
	int id;

	String name;
	static String college="SCMS";
	static void change(){
		college="SH";
	}
	Student(int i,String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println(id+" "+name+" "+college);
	}
}
public class StaticMethod{
	public static void main(String args[]){
		Student.change();
		Student s1=new Student(101,"rani");
		Student s2=new Student(108,"gopi");
		Student s3=new Student(456,"ravi");
		s1.display();
		s2.display();
		s3.display();
	}
}