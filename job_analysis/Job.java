package job_analysis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j
 */
class Job {
   int jobNumber;
   int length;
   int deadline;
   int profit;
   int start;
   int finish;
 

   
   public Job(int jn, int len, int d, int p)
   {
       jobNumber = jn; length = len; deadline = d;
       profit = p;  start = -1;  finish = -1;
   }
   
    public int getDeadline()
   {
       return deadline;
   }
    
     public int getLength()
   {
       return length;
   }

   public int getProfit()
   {
       return profit;
   }

   public String toString()
   {
       return "#" + jobNumber + ":(" + length + "," + deadline + ","
               + profit + "," + start + "," + finish + ")";
   }
} //end of Job class

