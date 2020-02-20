class A{
	public void methodA(){
		System.out.println("Super class method");
	}
}
class B extends A{
	public void methodB(){
			System.out.println("Super class method B");
	}
}
class C extends A{
	public void methodC(){
			System.out.println("Super class method C");
	}


	public static void main(String args[]){
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		ob1.methodA();
		ob2.methodB();
		ob3.methodC();
	}
}
	