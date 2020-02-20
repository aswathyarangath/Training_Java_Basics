import java.util.*;
class sticksArea{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of sticks");
		int n=s.nextInt();
		int area=0;
		if((n%2)==0){
			area=((n*2)/4)^2;
		}
		else{
			area=(((n-1)*2)/4)^2;
		}
		System.out.println("The area is "+area);
	}
}