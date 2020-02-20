public class Add{
	public int add(int a, int b){
		return(a+b);
	}
	public int add(int a, int b,int c){
		return (a+b+c);
	}
	public double add(double a, double b){
		return (a+b);
	}
	public static void main(String args[]){
		Add ob=new Add();
		System.out.println(ob.add(10,20));
		System.out.println(ob.add(10,20,30));
		System.out.println(ob.add(12.3,23.5));
	}
}
	
	