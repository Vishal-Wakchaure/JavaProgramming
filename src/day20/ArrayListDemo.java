package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day10.Employee;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
//		Declaration 
		
		ArrayList mylist = new ArrayList();
		
//		List mylist = new ArrayList();
		
//		ArrayList <String>mylist = new ArrayList<String>();
//		ArrayList<Employee> mylist = new ArrayList<Employee>();
		
//		Adding data into ArrayList
		mylist.add(100);
		mylist.add(20.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
//		Size of ArrayList
		System.out.println("size of an arraylist" + mylist.size());
		
//		Printing Arraylist
		System.out.println(mylist);
		
//		Remove elements from arraylist
		mylist.remove(5);// here 5 is index of element
		System.out.println(mylist);
		
//		Insert element in the Arraylist
		mylist.add(4,"vishal");
		System.out.println(mylist);
		
//		Modifying elements in ArrayList(modify,replace,change)
		mylist.set(2,"python");
		System.out.println("After replacing" + mylist);
		
//		Access specific element from ArrayList'
		System.out.println(mylist.get(3));//here 3 is index	
		
//		Reading all elements from ArrayList
		
/*		Using normal for loop
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}*/
		
//		Using for each loop
//		for(Object x:mylist)
//		{
//			System.out.println(x);
//		}
		
//		Using iterator
		Iterator it = mylist.iterator();
		
		System.out.println(it.next());
		
		
		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}

//		Checking Arraylist Empty or not
		System.out.println("is arrayList Empty" + mylist.isEmpty());
		
//		Remove all elements from ArrayList
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements" +mylist);
		
//		remove all the elements/clear
		mylist.clear();
		System.out.println("Is ArrayList Empty?" + mylist.isEmpty());
		
		
		
	}
}
