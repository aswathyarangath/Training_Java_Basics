class Parent{
	public void p1(){
		System.out.println("Parent method");
	}
}
public class Child extends Parent{
	public void c1(){
		System.out.println("Child method");
	}
	public static void main(String args[]){
		Child obj=new Child();
		obj.c1();
		obj.p1();
	}
}