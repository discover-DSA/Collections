package arrayList;

import java.io.*;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		int n=5;
		
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		for(int i=1; i<=n; i++)
			al.add(i);
		
		System.out.print(al);
		
		al.remove(3);
		System.out.println();
		
		System.out.print(al);
		
		System.out.println();
		//printing elements one by one
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i)+ " ");}
		

	}

}
