/**
 * Class Event
 * DO NOT MODIFY THIS CLASS
 *
 * This class is used to log and print all events happening during the lifetime of the call centre
 *
 * NOTE : Please make sure that you have called EVERY event method below in your main program when ever such event happens.
 * This class will be replaced with a similar class that will validate the program flow automatically.
 *
 */
public class Event {


    /**
     * Call this event method when a worker chooses a queue to service
     *
     * @param worker int (either 1, 2 or 3)
     * @param queue char (either 'A','B' or 'C')
     *
     */
    public static void WorkerChoosesQueue(int worker, char queue){
        System.out.println("Worker #"+worker+" has chosen Queue "+queue);
    }


    /**
     * Call this event method when a worker answers a call from their own queue
     *
     * @param worker int (either 1 or 2 or 3)
     * @param call int (values between 1-25 inclusive)
     *
     */
    public static void WorkerAnswersCall(int worker, int call){
        System.out.println("Worker #"+worker+" has answered call #"+call);
    }


    /**
     * Call this event method when a worker steals a call from another queue
     *
     * @param worker int (either 1 or 2 or 3)
     * @param call int (values between 1-25 inclusive)
     * @param queue char (either 'A','B' or 'C')
     *
     */
    public static void WorkerStealsCall(int worker, int call, char queue){
        System.out.println("Worker #"+worker+" has stolen call #"+call+" from Queue "+queue);
    }


    /**
     * Call this event method when a caller appends a call to a queue
     *
     * @param call int (values between 1-25 inclusive)
     * @param queue char (either 'A','B' or 'C')
     *
     */
    public static void CallAppendedToQueue(int call, char queue){
        System.out.println("Call #"+call+" has been appended to Queue "+queue);
    }

    /**
     * Call this event method when all 25 calls have been answered
     *
     */
    public static void AllCallsAnswered(){
        System.out.println("All calls have been answered! Terminating call centre now.");
    }


}
