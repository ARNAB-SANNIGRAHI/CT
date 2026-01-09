package core_java;

public class Assignment7_ElseIf_SmallOrCapitalAlphabet {

	public static void main(String[] args) {
		char c='A';
				if(c>='A' && c<='Z') {
					System.out.println("Capital alphabet");
				}
				else if(c>='a' && c<='z') {
					System.out.println("Small alphaber");
				}
				else {
					System.out.println("Not an alphabet");
				}

	}

}
