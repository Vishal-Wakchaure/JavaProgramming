package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapDemo {
	
	public static void main(String[] args) {
		
//		Declaration 
//		HashMap hm = new HashMap();
//		Map hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
//		Adding pairs 
		hm.put(101, "Vishal");
		hm.put(102,"Saurabh");
		hm.put(103, "Saurabh");
		hm.put(104, "Abhi");
		System.out.println(hm);
		
		System.out.println("size of hashmap: " +hm.size());
		
//		Remove pair
		hm.remove(102); //103 is the key value of pair
		System.out.println("After removing pair" +hm);
		
//		access value of the key
		System.out.println(hm.get(103));
		
//		Get all the keys from hashmap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
//		Reading data from hashmap
		
//		Using for each
		
		for(int k : hm.keySet())
		{
			System.out.println(k+ "    "+hm.get(k));
		}
//		Using Iterator
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+ "   "+entry.getValue());
			it.next();
		}
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
