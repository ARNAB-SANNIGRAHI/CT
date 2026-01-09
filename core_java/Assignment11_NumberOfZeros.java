package core_java;

public class Assignment11_NumberOfZeros {
public static void main(String[] args) {
	        int num = 1002050;
	        int count = 0;

	        if (num == 0) {
	            count = 1;
	        } else {
	            if (num < 0) {
	                num = -num;
	            }

	            while (num > 0) {
	                int digit = num % 10;
	                if (digit == 0) {
	                    count++;
	                }
	                num = num / 10;
	            }
	        }

	        System.out.println("Number of zeros = " + count);
	    }
}
