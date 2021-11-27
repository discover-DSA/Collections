package listInterface;

import java.util.*;

public class IteratingOverList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Geeks");
		al.add("Geeks");
		al.add(1,"For");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		for(String str : al)
		{
			System.out.print(str + " ");
		}

	}

}
