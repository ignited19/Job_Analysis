package job_analysis;

/**
* Author: Ignited19
* Date: 08/23/2018
* Project Job Scheduling Methods & Analysis
*/

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;


public class JobScheduler{
    
    static private Comparator<Job> deadlines;
    static private Comparator<Job> lengths;
    static private Comparator<Job> profits;
    private int nJobs;
    private Job[] jobs;
  
    
    
    static{
        deadlines = new Comparator<Job>(){
            @Override
            public int compare(Job a1, Job a2){
                return Integer.compare(a1.getDeadline(), a2.getDeadline());
            }
        };
    }
    
     static {
       lengths = new Comparator<Job>() {
           @Override
           public int compare(Job b1, Job b2) {
               return Integer.compare(b1.getLength(), b2.getLength());
           }
       };
   }

   static {
       profits = new Comparator<Job>() {
           @Override
           public int compare(Job b1, Job b2) {
               return Integer.compare(b2.getProfit(), b1.getProfit());
           }
       };
   }
   
   public JobScheduler(int[] joblength, int[] deadline, int[]profit){
       nJobs=joblength.length;
       jobs = new Job[nJobs]; //Instantiates the array size of jobs
       
       for(int i=0; i<nJobs; i++){
           jobs[i]=new Job(i, joblength[i],deadline[i],profit[i]);
       }
   }
    
   public void printJobs(){
       for(int i=0; i<nJobs;i++){
           System.out.println("#" + jobs[i].jobNumber + ":(" + jobs[i].length + "," + jobs[i].deadline + ","
                   + jobs[i].profit + "," + jobs[i].start + "," + jobs[i].finish + ")");

       }
   }
  int testlength[] = {1,1,1,1};
  int testdeadline[] = {2,2,2,2};
  int testprofit[] = {3,3,3,3};
  

  

  
  
    
}