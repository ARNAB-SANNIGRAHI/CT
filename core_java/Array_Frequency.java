package core_java;

public class Array_Frequency {

    public static void frequency(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];

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

            System.out.println("Element " + arr[i] + " occurs " + count + " time(s)");
        }
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 2, 4, 5, 3, 2};

        frequency(array);
    }
}
