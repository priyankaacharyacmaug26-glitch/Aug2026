import java.util.Set;
import java.util.TreeSet;
public class ColorSet {

	public static void main(String[] args) {
		//11.create a new tree set, add some colors (string) and print out the tree set
		Set<String> colors=new TreeSet<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("white");
		colors.add("black");
		 
		System.out.println("Treeset:"+colors);
		//to print one by one
		
		
		//12.Java program to add all the elements of a specified tree set to another tree se
		TreeSet colors1=new TreeSet<>();
		colors1.add("grey");
		colors.add("pink");
		colors1.addAll(colors);
		System.out.println(colors1);
		//13.reverse order
		System.out.println("reverse order: "+colors1.descendingSet());
			
			//14.get the first and last elements in a tree set.  
             System.out.println("get first elemenet: "+colors1.first());
             System.out.println("get last element: "+colors1.last());
			//15.Write a Java program to get the element in a tree set which is greater than or equal to the given element. (Hint : Use the ceiling method of the TreeSet)
             TreeSet<Integer> set=new TreeSet<>();
             set.add(10);
             set.add(20);
             set.add(30);
             set.add(40);
             set.add(50);
             System.out.println(set.ceiling(25));
             //ceiling print the neerest value
             System.out.println(set);
		}
	
		
		
		
		
	}


