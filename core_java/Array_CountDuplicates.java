package core_java;

public class Array_CountDuplicates {


    public static void findDuplicates(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n]; // To mark already counted elements

        System.out.println("Duplicate elements and their frequency:");

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue; 
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println("Element " + arr[i] + " appeared " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 2, 4, 5, 3, 2, 5, 5};

        findDuplicates(array);
    }
}
