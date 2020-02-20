import java.util.*;
class digitSum{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two digit number");
		int n=s.nextInt();
		int a=0,b=0,sum=0;
		a=n%10;
		b=n/10;
		sum=a+b;
		System.out.println("The bird said " + sum);
	}
}