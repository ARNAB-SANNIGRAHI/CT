package day25_DSALambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		List<Integer> list = filterOdd(arr);
		
	//	Consumer<Integer> consumer = integer -> System.out.println(integer);
		
		list.forEach(integer -> System.out.println(integer));
	}
	public static List<Integer> filterOdd(int[] arr){
		
		return Arrays.stream(arr).filter(value->value%2==0).boxed().toList();
	}
}
