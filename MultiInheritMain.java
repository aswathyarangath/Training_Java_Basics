class MultiInherit{
	protected String str;
	MultiInherit(){
		str="This";
	}
}
class ChildClass1 extends MultiInherit{
	ChildClass1(){
		str=str.concat(" is ");
	}
}

class ChildClass2 extends ChildClass1{
	ChildClass2(){
		str=str.concat("Multi level Inheritance");
	}
}
class ChildClass3 extends ChildClass2{
	ChildClass3(){
		str=str.concat(" Example");	
	}
	void display(){
		System.out.println(str);
	}
}
class MultiInheritMain{
	public static void main(String args[]){

		ChildClass3 ob=new ChildClass3();
		ob.display();
	}
}