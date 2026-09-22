import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ColoreList {

	private static final Object Blue = null;

	public static void main(String[] args) {
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
		//create the arraylist of string
		ArrayList<String> list=new ArrayList<>();//creating the arrayList to store the text value
		
		Iterator iterator=list.iterator();
		//add some colors to list
		list.add("Red");//insert the items into the list
		list.add("green");
		list.add("Blue");
		list.add("Yellow");
		list.add("purple");
		//2.insert an element into the array list at the first position
		list.add(0,"marron");
		//3.retrieve an element (at a specified index) from a given array list.
		list.get((3));
		System.out.println(list.get(3));
		
		//print the collection
		System.out.println("list of colors:"+list);//print all the list at once
		//to traverse the list
		//import java.util.Listiterator
		ListIterator<String>listiterator=list.listIterator();
		//to print the collection we used loop
		while(listiterator.hasNext())
		{
			System.out.println(listiterator.next());
		}
		
		//4. Modify the above Java program to update specific array element by given element.
	     list.set(2, "gray");
	     System.out.println(list);
	     //5.Modify the above Java program to remove the third element from a array list.
	     list.remove(5);
	     System.out.println(list);
	     //6.Modify the above Java program to search an element in a array list
	   /* if(list.contains(Red)) {
	    	System.out.println("color is present");
	    }
	    	else
	    	{
	    		System.out.println("color is not present");
	    	
	    }*/
	    //7.sort a given arrayList.
	    Collections.sort(list);
	    System.out.println("After sorting: "+list);
	    //8.copy an Arraylist into anather.
	    ArrayList<String>list2=new ArrayList<>();
	    //give the same size as list
	    for(int itemp=0;itemp<list.size(); itemp++)
	    {
	    	list2.add(null);
	    }
	    Collections.copy(list2, list);
	    System.out.println("copied Array: " +list2);
	    //9.Shuffle elementsin array list
	    Collections.shuffle(list2);
	    System.out.println("Shuffle list:" +list2);
	    //10.reverse element of arraylist
	    Collections.reverse(list2);
	    System.out.println("rafter reverse arraylist: "+list2);
	}

}
