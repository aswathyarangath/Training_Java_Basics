import java.util.*;
class choco{
	public static void main(String args[]){
		int n=0;
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  number of chocolates and children");
		int co=s.nextInt();
		int ch=s.nextInt();
		System.out.println("The number of chocolates "+ co +" and the number of children is "+ ch);
		for(i=1;i<ch;i++){
			if(ch>i){
				co=co-i;
			}
			
			
			
			System.out.println("No. of chocolates left "+ co);
			System.out.println("The  number of last person who got chocolate : "+i);
		
		}
		

		}
}