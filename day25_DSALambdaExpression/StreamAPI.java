package day25_DSALambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class StreamAPI {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		System.out.println(filterOdd(arr));
	}
	public static List<Integer> filterOdd(int[] arr){
		
//		IntPredicate intpredicate = (int value) -> {
//			return value%2==0;
//		};
//		return Arrays.stream(arr).filter(intpredicate).boxed().toList();
		
		return Arrays.stream(arr).filter(value->value%2==0).boxed().toList();
	}
}