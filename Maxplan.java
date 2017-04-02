import java.util.Date;



/**
 * MAXPLAN by
 *
 * Ciaran Cordial
 * Micheal Hassoun
 * Pasham Adwani
 *
 * on 02-04-2017.
 */



//===========================================================================================



public class Maxplan {


//--------------------------------------------------------------



    int taskCount;

    Task[] optimizedArrayofTasks; // To be completed tasks
    
    Task[] unoptimizedArrayofTasks; //will have all the Task : old, new, and completed 

    float efficiency;
    


//--------------------------------------------------------------

    /**
     * Priority: 1 to 5
     * 
     * Task Type : 0 --> Work
     *             1 --> School
     *             2 --> Personal
     *
     * isTaskCompleted : 0 --> Not Completed
     *                   1 --> Completed              
     *
     */

    public class Task
    {
        char[] TaskName;
        int TaskType;
        Date TaskDeadline;
        Date TaskCompleted;
        int TaskDifficulty;
        char[] TaskDescription;
        boolean isTaskCompleted; 
    }
//----------------------------------------------------------------

    /**
    *
    * GUI function to get user's Input
    *
    */
    
    public void getUserInput(Task t)
    {

    }

//----------------------------------------------------------------
    
    /**
    *Function to initialize a new Task dynamically
    */
    
    public void initTask(int nthTask)
    {
        Task t = new Task();
        getUserInput(t);
        unoptimizedArrayofTasks[nthTask] = t; // PUSH INTO UN-OPTIMIZED ARRAY
    };

//-----------------------------------------------------------------

    /**
    * MOST IMPORTANT
    * Takes the INCOMPLETE task from un-Optimized array and optimize it for best results 
    */
    
    public void calculateOptimizedArray(Task[] unoptimizedArray)
    {

    }

//----------------------------------------------------------------

     public float calculateEfficiency(Task[] unoptimizedArray)
     {
        int totalTasksCompletedOnTime = 0;
         float efficiency;
           for(int i=0;i<taskCount;i++)
           {
              if(unoptimizedArray[i].TaskDeadline > = unoptimizedArray[i].TaskCompleted && unoptimizedArray[i].isTaskCompleted == 1)
              {
                  totalTasksCompletedOnTime = totalTasksCompletedOnTime + 1;
              }
           }
           efficiency = (float) (totalTasksCompletedOnTime/taskCount)*100;
         return efficiency;
     }

//------------------------------------------------------------

    public void main(String[] args)
    {
        int taskDeclared = 0; // keeps a track of  number of tasks declared by USER/CUSTOMER
        //Maxplan GUI
        taskCount = taskDeclared;
        efficiency = calculateEfficiency(unoptimizedArrayofTasks);
    }

//------------------------------------------------------------


}

//======================================================================================
