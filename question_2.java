import java.util.*;
class product{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of product");
		int n=s.nextInt();
		int arr[]=new int[n];
		int sum=0;
		double disc=0;
		double amt=0;
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("The entered elements are:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++){
		sum=sum+arr[i];
		}
		System.out.println("The sum is "+sum);
		disc=sum-(sum*0.2);
		
		System.out.println("The discount amount is "+disc);
		int small=arr[0];
		for(int i=0;i<n;i++){
			if(small>arr[i]){
				small=arr[i];
			}
		}
		System.out.println("The smallest element  is "+small);
		if(disc<small){
			System.out.println("Select offer 2");
		}
		else
			System.out.println("Select offer 1");
	}
}