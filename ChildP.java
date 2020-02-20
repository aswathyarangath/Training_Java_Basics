class Parent{
	void view(){
		System.out.println("this is a parent class method");
	}
}
class Child extends Parent{
	void view(){
		super.view();
		System.out.println("this is a child class method");
	}

}
class ChildP{
	public static void main(String args[]){
		Parent ob=new Child();
		ob.view();
		
	}
}