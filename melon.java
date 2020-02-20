import java.util.*;
class melon{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the weight of water melon");
		int n=s.nextInt();
		if(n%2==0){
			System.out.println("Can be divided");
			for(int i=1;i<n;i++){
			int a=n-i;
			System.out.println("Probability is :" + i + " & " + a);
		}
		}
		else{
			System.out.println("Can't be divided");
		}
		
	}
}