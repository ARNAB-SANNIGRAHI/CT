package array_assignments;

public class BinarySearch_25 {
    static void binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        binarySearch(arr, 30);
    }
}

