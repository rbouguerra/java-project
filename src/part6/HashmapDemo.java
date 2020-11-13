package part6;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		
		
		//Declare hashmap
		//HashMap hm=new HashMap(); //declaration 1
		
		HashMap <Integer, String> hm=new HashMap<Integer, String>();
		
		// Adding pairs into hashmap
		hm.put(101, "Emna");
		hm.put(102, "Ridha");
		hm.put(103, "Imen");
		hm.put(104, "Achref");
		
		System.out.println(hm);
		
		//Remove a pair from hashmap
		hm.remove(102); // remove by key number
		System.out.println("After rmoving a pair " +hm);
		
		//Reading pairs using for loop "Enhanced loop"
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
