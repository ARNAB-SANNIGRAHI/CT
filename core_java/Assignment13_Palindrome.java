package core_java;

public class Assignment13_Palindrome {

	public static void main(String[] args) {
		int num=12321;
		int original=num;
		int reverse=0;
		if(num<0) {
			System.out.println("Negative numbers are not considered as palindrome");
		}else {
				while(num>0) {
					int digit = num%10;
					reverse = reverse*10+digit;
					num=num/10;
				}
				if(reverse==original) {
					System.out.println(original+" is a palindrome number.");
				}else {
						System.out.println(original+ " is not a palindrome number");
					}
				}
			}
		}

