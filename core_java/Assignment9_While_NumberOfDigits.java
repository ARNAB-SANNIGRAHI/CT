package core_java;

public class Assignment9_While_NumberOfDigits {

	public static void main(String[] args) {
		int num=12345;
		int count=0;
		if(num==0) {
			count=1;
		}else {
			if(num<0) {
				num=-num;
			}
			while(num>0) {
				count++;
				num=num/10;
			}
		}
		System.out.println(count);

	}

}
