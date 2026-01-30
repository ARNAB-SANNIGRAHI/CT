package dsa_DAY1_Assignment;

public class InsertElement {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int pos = 2;
		int value = 25;

		int[] newArr = new int[arr.length + 1];

		for (int i = 0, j = 0; i < newArr.length; i++) {
			if (i == pos) {
				newArr[i] = value;
			} else {
				newArr[i] = arr[j++];
			}
		}

		for (int x : newArr) {
			System.out.print(x + " ");
		}
	}
}
