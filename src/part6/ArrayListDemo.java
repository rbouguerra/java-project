package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//How to declare array list
		
//		ArrayList list= new ArrayList(); //we can store any type of elements
//		ArrayList <Integer> list=new ArrayList<Integer>();//store Integer elements
		
		ArrayList <String> list=new ArrayList<String>();// store string elements
		
		//Adding values to arraylis
		list.add("Takoua"); //0
		list.add("Achref");//1
		list.add("Jalaa");
		list.add("Mariem");
		list.add("Ridha");
		list.add("Mouadh");
		list.add("Jihen");
		
		//list.add(100); //number
		//list.add('A'); //character
		
		
		//print all the value
		System.out.println(list);
		
		//size of array list
		System.out.println(list.size());
		System.out.println("Before removing elements: " +list);
		
		//remove an element
		list.remove(3); // remove Mariem
		System.out.println(list.size());
		System.out.println("After removing elements: " +list);
		
		//insert a new element into array list
		list.add(3, "Zied");
		System.out.println(list.size());
		System.out.println("After insert elements: " +list);
		
		//read values from array list using for loop (Enhanced for loop (les boucles améliorés))
//		for(String s: list) {
//			System.out.println(s);
//		}
//		
		
		for(Object s:list) { //Object can store any type of value
			System.out.println(s);
		}
		

	}

}
