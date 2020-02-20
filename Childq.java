class Parent{}
public class Childq extends Parent{
	public void check(){
		System.out.println("Successful casting.");
	}
	public static void show(Parent p){
		if (p instanceof Childq){
			Childq b1=(Childq)p;
			b1.check();
		}
	}
	public static void main(String args[]){
		Parent p=new Childq();
		Childq.show(p);
	}
}