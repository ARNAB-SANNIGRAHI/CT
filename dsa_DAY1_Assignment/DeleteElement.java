package dsa_DAY1_Assignment;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int pos = 1;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != pos) {
                newArr[j++] = arr[i];
            }
        }

        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}

