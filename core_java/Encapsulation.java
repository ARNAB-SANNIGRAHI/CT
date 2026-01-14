package core_java;

public class Encapsulation {
	String name;
	private int pass;
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.name="Raju";
		e.setPass(123);
		System.out.println(e.name);
		System.out.println(e.getPass());
	}
}
