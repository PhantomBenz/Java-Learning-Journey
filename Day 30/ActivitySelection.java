// You are given n activities with their start and end times. Select the maximum number of activities that can 
// be performed by a single person, assuming that a person can only work on a single activity at a time. Activity 
// are sorted according to end time.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void activity(int start[], int end[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int data = 0;
        int l = 0;
        for(int i=0; i < end.length; i++) {
            if (start[i] >= l) {
                ans.add(i);
                data++;
                l = end[i];
            }
        }
        System.out.println(data); 
        for(int i=0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void activity(int activities[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int data = 0;
        int l = 0;
        for(int i=0; i < activities.length; i++) {
            if (activities[i][1] >= l) {
                ans.add(activities[i][0]);
                data++;
                l = activities[i][2];
            }
        }
        System.out.println(data); 
        for(int i=0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};  
        

        // if start and end were not sorted
        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // lambda function -> shortform of function


        activity(activities);
    }
}