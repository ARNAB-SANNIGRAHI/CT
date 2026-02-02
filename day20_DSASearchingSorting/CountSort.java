package day20_DSASearchingSorting;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 6};
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] hash = new int[max + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (hash[i] > 0) {
                arr[index] = i;
                index++;
                hash[i]--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
