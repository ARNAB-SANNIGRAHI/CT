package day14_CollectionFramework;
import java.util.ArrayList;

public class ArrayList_Methods {
public static void main(String[] args) {
	//Generic ->Same type element<Datatype>
	//Non Generic -> Different type elements
	
	//Create an arraylist
	ArrayList<String> a1 = new ArrayList<String>();// It is generic
	
	//Add elements in ArrayList
	a1.add("java");
	a1.add("C++");
	a1.add("python");
	a1.add("sql");
	
	//Prints the ArrayList
	System.out.println(a1);
	
	//Read element by index
	System.out.println("First element:"+a1.get(0));
	System.out.println("Second element: "+a1.get(1));
	
	//Update element
	a1.set(1, "JavaScript");
	
	//Delete  element
	a1.remove("sql");
	a1.remove(2);
	
	//Print updated list
	System.out.println("Updated list: "+a1);
}
}
