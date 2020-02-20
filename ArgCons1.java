class ArgCons{
	ArgCons1 ob;
	ArgCons(ArgCons1 ob){
		this.ob=ob;
	}
	void display(){
		System.out.println(ob.data);
	}
}
class ArgCons1{
	int data=10;
	ArgCons1(){
		ArgCons b=new ArgCons(this);
		b.display();
	}
	public static void main(String args[]){
		ArgCons1 a=new ArgCons1();
	}
}