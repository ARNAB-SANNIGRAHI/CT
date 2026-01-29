package day17_DSA;
import java.util.*;

public class ArrayCreation {
	 public static void main(String[] args) {
		 
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int[] arr1 = new int[4];
		
		arr1[0]=12;
		arr1[1]=13;
		arr1[2]=14;
		arr1[3]=14;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		for(int element: arr) {
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		System.out.println(Arrays.toString(arr));
	}
}
