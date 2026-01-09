package core_java;

public class Assignment12_AverageOfDigits {
public static void main(String[] args) {
	int num=12345;
	int sum=0;
	int count=0;
	while(num>0) {
		int digit = num%10;
		sum += digit;
		count++;
		num=num/10;
	}
	double average = (count==0) ? 0 : (double)sum/count;
	System.out.println("Average of digits are: "+average);
}
}
