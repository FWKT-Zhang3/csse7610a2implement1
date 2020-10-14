import java.util.ArrayList;
import java.util.HashMap;

public class CallCentre1{

    private final HashMap<Integer, Buffer> queues;
    public Sem notFull, notEmpty, S, bufferMutex, stealerLock;
    public boolean isProcessing, finishedCall;
    public Client client;
    public Worker[] workers;
    public Stealer stealer;
    private final int bufferNumber;

    public CallCentre1(int bufferNumber, int bufferSize, int clientNumber) {
        this.bufferNumber = bufferNumber;
        // Semaphores
        bufferMutex = new Sem(1);
        stealerLock = new Sem(0);
        notEmpty = new Sem(0);
        notFull = new Sem(bufferSize * bufferNumber);
        S = new Sem(1);

        //random index
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i< bufferNumber; i++) {
            index.add(i);
        }
        index.sort((integer, t1) -> (int) Math.floor((Math.random() * 3 - 1)));

        // buffer, client, worker, stealer
        queues = new HashMap<>();
        workers = new Worker[bufferNumber];
        for (int a = 0; a < bufferNumber; a++) {
            Buffer temp = new Buffer(bufferSize, a);
            Worker worker = new Worker(this, temp, index.get(a) + 1);
            workers[index.get(a)] = worker;
            Event.WorkerChoosesQueue(worker.id, (char)(temp.id + 65));
            queues.put(a, temp);
        }

        stealer = new Stealer(this);
        client = new Client(this, clientNumber, bufferNumber);

        // Auxiliary variable
        isProcessing = true;
        finishedCall = false;
    }

    public void startWorking() {
        // client make call
        client.start();
        // worker take the call
        for (Worker w : workers) {
            w.start();
        }
        // stealer steal the call from other queue,
//        stealer.start();

        Outer:
        while (true) {
            if (finishedCall) {
                for (int a = 0; a < bufferNumber; a++) {
                    if (!queues.get(a).isEmpty()) {
                        continue Outer;
                    }
                }
                break;
            }
        }
        for (Worker w : workers) {
            w.interrupt();
        }
//        stealer.interrupt();
        Event.AllCallsAnswered();
    }

    public HashMap<Integer, Buffer> getQueues() {
        return queues;
    }

    public static void main(String[] args) {
        CallCentre1 c = new CallCentre1(3, 5, 25);
        c.startWorking();
    }
}
