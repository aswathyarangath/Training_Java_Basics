class argThis{
	void display(argThis ob){
		System.out.println("method is invoked");
	}
	void thisex(){
		display(this);
	}

	public static void main(String args[]){
		argThis s1=new argThis();
		s1.thisex();
	}
}