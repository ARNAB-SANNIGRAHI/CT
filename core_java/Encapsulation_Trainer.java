package core_java;

public class Encapsulation_Trainer {
	int id;
	String name;
	private int pass;
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public static void main(String[] args) {
		Encapsulation_Trainer t = new Encapsulation_Trainer();
		t.id = 001;
		t.name="Raju";
		t.setPass(123);
		System.out.println(t.name);
		System.out.println(t.getPass());
	}
}
