/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job_analysis;

/**
 *
 * @author j
 */
public class Job_Analysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int testlength[] = {4,2,3,1};
        int testdeadline[] = {4,2,3,1};
        int testprofit[] = {4,2,3,1};
        
        JobScheduler a = new JobScheduler(testlength,testdeadline,testprofit);
        a.printJobs();
        
    
    }
    
}
