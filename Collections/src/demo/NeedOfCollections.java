package demo;

public class NeedOfCollections {

	public static void main(String[] args) {
		
		//for each number  a new variable is required
		int a=10;
		int b=20;
		int c=30;
		
		//array can store n objects and created just once
		int[] arr=new int[10000];
		
		//limitation:
//		1. Fixed in size
//		2. Array can hold only homogenous elements
//		3. 
			
		Student[]  students = new Student[10];
		
		students[0] = new Student();
		students[1] = new Student(); 
		//students[2] = new Book();// error while storing
		
		Object[] objArray = new Object[10];
		objArray[0] = new Student();
		objArray[1] = new Student(); 
		objArray[2] = new Book();
		
		
		System.out.println(objArray);
		

	}

}

class Book{
	
}

class Student{
	
}
