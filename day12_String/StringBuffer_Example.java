package day12_String;

public class StringBuffer_Example {
	public static void main(String[] args) {
		
	StringBuffer s1 = new StringBuffer("xyz");
	StringBuffer s2 = new StringBuffer("xyz");
	
	System.out.println("---Show content---");
	System.out.println(s1);//xyz ->Content
	System.out.println(s1.toString());//xyz ->this and the previous line both are same because 											  										StringBuffer's content can not be printed without being   										overridden
	
	System.out.println("---checks equality---");
	System.out.println(s1.equals(s2));//false
	System.out.println(s1==s2);//false
	
	String s = new String(s1);// Convert StringBuffer to String
	StringBuffer s3 = new StringBuffer(s);// Convert String to StringBuffer
	
	System.out.println("---reversing the StringBuffer---");
	System.out.println(s1.reverse());//Reverses the StringBuffer
	
	System.out.println("---Appending---");
	s1.append("java");
	System.out.println(s1);//zyxjava ->add "java" at the end of the StringBuffer
	
	System.out.println("---Check default capacity---");
	StringBuffer s4 = new StringBuffer();
	System.out.println(s4.capacity());//16
	
	System.out.println("---insert method---");		
	StringBuffer s5 = new StringBuffer("xyz");
	s5.insert(1, "abc");
	System.out.println(s5);//xabcyz
	
	System.out.println("---delete method---");	
	StringBuffer s6 = new StringBuffer("xyz abc");
	s6.delete(0, 2);
	System.out.println(s6);//z abc
	
	System.out.println("---replace method---");	
	StringBuffer s7 = new StringBuffer("xyz abc");
	s7.replace(0, 2, "hii");
	System.out.println(s7);//hiiz abc
}
}