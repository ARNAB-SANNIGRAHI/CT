package day14_CollectionFramework;
import java.util.ArrayList;

public class NonGeneric_ArrayList {
public static void main(String[] args) {
	//Generic ->Same type element<Datatype>
	//Non Generic -> Different type elements
	
	//Create an arraylist
	ArrayList a1 = new ArrayList();// It is non generic
	
	//Add elements in ArrayList
	a1.add("java");
	a1.add(45.5);
	a1.add(true);
	a1.add(20);
	a1.add(null);
	a1.add(null);
	int a=99;
	a1.add(a);//auto boxing
	
	//Prints the ArrayList
	System.out.println(a1);
	
	//Read element by index
	System.out.println("First element:"+a1.get(0));
	System.out.println("Second element: "+a1.get(1));
	
	//Update element
	a1.set(1, "JavaScript");//Replace elements
	
	//Delete  element
	a1.remove(null);
	a1.remove(2);
	
	//Print updated list
	System.out.println("Updated list: "+a1);
}
}
