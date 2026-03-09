package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
//		Declaration 
		
		HashSet Myset = new HashSet();
		
//		Set Myset = new HashSet();
//		
//		HashSet <String>Myset = new HashSet<String>();
		
//		Adding elements into hashset
//		Myset.add(100);
		Myset.add(10.5);
		Myset.add("Welcome");
		Myset.add(true);
		Myset.add('A');
		Myset.add(100);
		Myset.add(null);
		Myset.add(null);
		
//		Printing hashset
		System.out.println(Myset);//[null, A , 100 , 10.5 , Welcome , true]
		
//		Size of Hashset
		System.out.println("size of hashset: "+ Myset.size());
		
//		Removing element from hashset
		Myset.remove(10.5);   // 10.5 is value not an index
		System.out.println("After removing" + Myset);
		
//		Inserting element  --Not possible
		
//		Access Specific element --Not possible
		
//		Convert Hashset--> ArrayList
		ArrayList al = new ArrayList(Myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
//		Read all the elements using for each loop
		/*for(Object x:Myset)
		{
			System.out.println(x);
		}*/
		
//	Using Iterator
		Iterator<Object> it = Myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//		clearing all the elements in hashset
		Myset.clear();
		System.out.println(Myset);
		System.out.println(Myset.isEmpty());
	}

}
