package day23_DSAHeap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
	 
    public static int leastInterval(char[] tasks, int n) {
 
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : tasks)
            freq.put(c, freq.getOrDefault(c, 0) + 1);
 
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(freq.values());
 
        int time = 0;
 
        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;
 
            while (cycle > 0 && !maxHeap.isEmpty()) {
                int count = maxHeap.poll();
                if (count > 1) temp.add(count - 1);
                time++;
                cycle--;
            }
 
            for (int t : temp)
                maxHeap.add(t);
 
            if (maxHeap.isEmpty()) break;
            time += cycle; // idle slots
        }
        return time;
    }
 
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(tasks, 2));
    }
}