
import java.io.File;
import java.io.IOException;
public  class Create{
	public static void main(String args[]){
		try{
			File myObj=new File("E:myFile.txt");
			if(myObj.createNewFile()){
				System.out.println("File created :"+myObj.getName());
			}
			else{
				System.out.println("File already exists.");
			}
		}
		catch(Exception e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}