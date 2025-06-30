// Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline.
// It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1.
// Maximize the total profit if only one job can be scheduled at a time

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;
// import java.util.Comparator;

public class JobSequencingProblem {
    static class Job {
        public int id,deadline,profit;

        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        // int job[][] = {{4,20,0},{1,10,1},{1,40,2},{1,30,3}};
        // Arrays.sort(job,Comparator.comparingDouble(o -> o[1]));
        // int time = 0;
        // int profit = 0;
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i = job.length-1; i >= 0; i--) {
        //     if(time < job[i][0]){
        //         time++;
        //         arr.add(job[i][2]);
        //         profit += job[i][1]; 
        //     }
        // }
        // System.out.println(profit);
        // for(int i = 0; i < arr.size(); i++) {
        //     System.out.print((char)('A' + arr.get(i)) + " ");
        // }
        // System.out.println();

        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit - a.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int p = 0;
        for(int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(time < curr.deadline){
                time++;
                seq.add(curr.id);
                p += curr.profit; 
            }
        }

        System.out.println("max job = " + seq.size());
        System.out.println("max profit = " + p);
        for(int i = 0; i < seq.size(); i++) {
            System.out.print((char)('A' + seq.get(i)) + " ");
        }
        System.out.println();
    }
}
