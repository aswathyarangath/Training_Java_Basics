class thisExample{
	void ex(){
		System.out.println("current class:");
	}
	void display(){
		System.out.println("hello n");
		ex();
		this.ex();
	}
}
class Main{
	public static void main(String args[]){
		thisExample a=new thisExample();
		a.display();
	}
}