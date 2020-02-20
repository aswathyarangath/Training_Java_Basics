class Bike{
	int speed=60;
}
class Cycle extends Bike{
	int speed=20;
	void show(){
		System.out.println("Average speed: "+super.speed);
		System.out.println("Average speed: "+speed);
	}
}
class Sample1{
	public static void main(String args[]){
		Cycle c=new Cycle();
		c.show();
	}
}