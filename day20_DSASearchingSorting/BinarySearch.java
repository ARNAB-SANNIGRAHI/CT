 package day20_DSASearchingSorting;
public class BinarySearch {
		public static void main(String[] args) {
			int[] arr = {1,5,7,9,13,14,19,20};
			int k = 20;
			int n = arr.length;
			int start = 0;
			int end = n-1;
			
			while(start <= end){
				int mid = start + ((end-start)/2);
				
				if(arr[mid]==k) {
					System.out.println(mid);
					break;
				}else if(arr[mid] < k) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
			
		}
}
