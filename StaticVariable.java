class Student{
	int id;

	String name;
	static String college="SCMS";
	Student(int i,String n){
		id=i;
		name=n;
	}
	
	void display(){
		System.out.println(id+" "+name+" "+college);
	}
}
public class StaticVariable{
	public static void main(String args[]){
		Student s1=new Student(101,"rani");
		Student s2=new Student(108,"gopi");
		s1.display();
		s2.display();
	}
}