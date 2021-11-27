package listInterface;

import java.util.ArrayList;
import java.util.List;

//Java Program to Add ELements to a List
public class List2 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Geeks");
		al.add("Geeks");
		al.add(1, "For");
		
		//Initial ArrayList
		System.out.println(al);
		
		//Update in the ArrayList
		al.set(1,"geeks");
		
		//Updated ArrayList
		System.out.println(al);
		
		//Remove element from List
		al.remove(0);
		System.out.println(al);
		al.remove("for");
		System.out.println(al);

	}

}
