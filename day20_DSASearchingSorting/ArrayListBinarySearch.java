package day20_DSASearchingSorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(50);
        a.add(22);

        Collections.sort(a);

        int target = 22;
        int index = binarySearch(a, target);

        	System.out.println(index);
    }

    public static int binarySearch(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid) == target) {
                return mid;
            } else if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
