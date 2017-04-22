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


    Task[] optimizedArrayofTasks;  // Optimized Task List

    Task[] unoptimizedArrayofTasks;  //All task entered by USER

    Task[] completedTasks;  // DISPLAY PURPOSE ONLY --> GUI

   // Task[] PastDeadlineTasks; To be implemented once basic gets working

    int numberofTasksCompleted; // A counter to get number of task completed

    Task[] optimizedArrayofTasks; // To be completed tasks
    
    Task[] unoptimizedArrayofTasks; //will have all the Task : old, new, and completed

    float efficiency;


//--------------------------------------------------------------

    /**
     * Priority: 1 to 5
     * 
     * Task Type : 2 --> Work
     *             1 --> School
     *             0 --> Personal
     *
     * isTaskCompleted : 0 --> Not Completed
     *                   1 --> Completed              
     *
     */

    public class Task
    {
        char[] TaskName;
        int TaskType;
        int Priority;
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
       // optimizedArray = unoptimizedArray;
        Task substitute = new Task();
        int max,score[taskCount],j,i;

           for(i=0;(i<=taskCount && unoptimizedArray[i].isTaskCompleted == 0);i++)
           {
               score[i]=0;
               score[i] = unoptimizedArray[i].Priority + unoptimizedArray[i].TaskDifficulty + unoptimizedArray[i].TaskType  ;
           }

           //Bubble Sort to get the tasks with highest priority
        for( i=0;(i<taskCount && unoptimizedArray[i].isTaskCompleted == 0);i++)
        {
            max=score[i];
            for(j=1;(j<=taskCount && unoptimizedArray[j].isTaskCompleted == 0);j++)
            {
                if(max < score[j])
                {
                    substitute = unoptimizedArray[i];
                    unoptimizedArray[i] = unoptimizedArray[j];
                    unoptimizedArray[j] =  substitute;
                }
                else if(max == score[j])
                {
                   if(unoptimizedArray(j).Priority > unoptimizedArray(i).Priority )
                   {
                       substitute = unoptimizedArray[i];
                       unoptimizedArray[i] = unoptimizedArray[j];
                       unoptimizedArray[j] =  substitute;
                   }
                }
            }
        }
        unoptimizedArray = optimizedArray;
        return optimizedArray;
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

    /**
     *
     * This is FOR DISPLAY PURPOSE ONLY --> GUI
     *
     * takes all the task and puts it into array of completed task
     *
     */

    public void getCompletedTasks(Task[] unoptimizedArray)
    {
        int sizeofArrayofCompletedTasks=0;
        for(int i=0;i<=taskCount;i++)
        {
            if(unoptimizedArray[i].isTaskCompleted == 1)
            {
                completedTasks[sizeofArrayofCompletedTasks+1] =  unoptimizedArray[i];
            }
        }
    }

       
//------------------------------------------------------------

   
    public void main(String[] args)
    {
        int taskDeclared = 0; // keeps a track of  number of tasks declared by USER/CUSTOMER
        //Maxplan GUI
        optimizedArrayofTasks = calculateOptimizedArray(unoptimizedArrayofTasks);
        taskCount = taskDeclared;
        efficiency = calculateEfficiency(unoptimizedArrayofTasks);
    }

//------------------------------------------------------------


}

//======================================================================================
