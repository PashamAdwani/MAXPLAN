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

    Task[] optimizedArrayofTasks;

    Task[] unoptimizedArrayofTasks;

    float efficiency;



//--------------------------------------------------------------

    /**
     *
     */

    public class Task
    {
        int TaskID;   //used for identification as an input for array(optimized)
        char[] TaskName;
        int TaskType;
        Date TaskDeadline;
        Date TaskCompleted;
        int TaskDifficulty;
        char[] TaskDescription;
    }
//----------------------------------------------------------------

    public void getUserInput(Task t)
    {

    }

//----------------------------------------------------------------
    public void initTask(int nthTask)
    {
        Task t = new Task();
        getUserInput(t);
        unoptimizedArrayofTasks[nthTask] = t; // PUSH INTO UN-OPTIMIZED ARRAY
    };

//-----------------------------------------------------------------

    public void calculateOptimizedArray(Task[] unoptimizedArray)
    {

    }

//----------------------------------------------------------------

     public float calculateEfficiency(Task[] optimizedArray)
     {
        int totalTasksCompletedOnTime = 0;
         float efficiency;
           for(int i=0;i<taskCount;i++)
           {
              if(optimizedArray[i].TaskDeadline > = optimizedArray[i].TaskCompleted)
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
        efficiency = calculateEfficiency(optimizedArrayofTasks);
    }

//------------------------------------------------------------


}

//======================================================================================