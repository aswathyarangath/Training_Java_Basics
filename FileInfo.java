import java.io.File;
	public class FileInfo{
		public static void main(String args[]){
			File ob=new File("NewFile.txt");
			if(ob.exists()){
				System.out.println("Filename:" +ob.getName());
				System.out.println("Absolute path:" +ob.getAbsolutePath());
				System.out.println("Writeable:" +ob.canWrite());
				System.out.println("Readable:" +ob.canRead());
				System.out.println("File size in bytes:" +ob.length());
			}
			else{
				System.out.println("The file doesnot exists.");
			}
		}
	}