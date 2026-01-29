package day17_DSA;

public class ReverseArrayReturn {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		ReverseArrayReturn obj = new ReverseArrayReturn();
		int[] reversed = obj.arrayReverse(arr);
		for (int x : reversed) {
			System.out.print(x + " ");
		}

	}

	public int[] arrayReverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		return arr;
	}

}
