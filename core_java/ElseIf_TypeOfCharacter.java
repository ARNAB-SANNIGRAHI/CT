package core_java;

public class ElseIf_TypeOfCharacter {
public static void main(String[] args) {
	char c='A';
	if((c>='A' && c<='Z') || (c>='a' && c<= 'z')) {
		System.out.println("Alphabet");
	}else if(c>='0' && c<= '9') {
		System.out.println("Digit");
	}else {
		System.out.println("Special Character");
	}
}
}
