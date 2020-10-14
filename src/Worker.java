/**
 * The worker process, answer phone call when there is/are phone call(s) in
 * the queue that the worker responsible for.
 */
public class Worker extends Thread {
    private final Buffer queue;
    private final CallCentre1 callCentre;
    public int id;

    public Worker(CallCentre1 callCentre, Buffer queue, int id) {
        this.callCentre = callCentre;
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        while (callCentre.isProcessing) {
            callCentre.notEmpty.waitS(this);
            if (queue.isEmpty()) {
                ////////////////////////////////////////////////////////////////
                //      attention: stealer signalS()
                //      Or, maybe signal here?
                //      艹，我也不知道
//                callCentre.stealerLock.signalS();
                callCentre.notFull.signalS();
                continue;
            }
            Call temp = queue.remove();
            Event.WorkerAnswersCall(id, temp.id);
            System.out.println("Worker " + id  + " " + queue);
            callCentre.notFull.signalS();
        }
    }
}

