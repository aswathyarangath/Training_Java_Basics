class mutableStringBuilder{
	public static void main(String args[]){

		//append()
		StringBuilder sb=new StringBuilder("Java");
		sb.append("Technology");
		System.out.println(sb);
	
		//insert()
		sb.insert(1,"Technology");
		System.out.println(sb);

		//replace()
		sb.replace(1,3,"Java");
		System.out.println(sb);

		//delete()
		StringBuilder s=new StringBuilder("Python");
		s.delete(1,3);
		System.out.println(s);

		//reverse
		StringBuilder x=new StringBuilder("Python");
		System.out.println(x.reverse());











	}
}