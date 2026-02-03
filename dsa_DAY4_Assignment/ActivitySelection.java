package dsa_DAY4_Assignment;

import java.util.*;

class Activity {
    int start, finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {

    public static void selectActivities(Activity[] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        System.out.println("Selected activities:");
        int lastFinish = activities[0].finish;
        System.out.println("(" + activities[0].start + ", " + activities[0].finish + ")");

        for (int i = 1; i < activities.length; i++) {
            if (activities[i].start >= lastFinish) {
                System.out.println("(" + activities[i].start + ", " + activities[i].finish + ")");
                lastFinish = activities[i].finish;
            }
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 2),
            new Activity(3, 4),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(8, 9),
            new Activity(5, 9)
        };

        selectActivities(activities);
    }
}
