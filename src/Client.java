import java.util.ArrayList;

/**
 * The client who make the phone call
 * randomly choose a queue to add the call
 * if all queues are full, wait
 */
public class Client extends Thread {
    private final CallCentre1 callCentre;
    private final int number;
    private int numOfCall;
    private final ArrayList<Integer> index;

    public Client(CallCentre1 callCentre, int number, int bufferNumber) {
        this.callCentre = callCentre;
        this.number = number;
        this.numOfCall = 0;
        this.index = new ArrayList<>();
        for (int i = 0; i< bufferNumber; i++) {
            index.add(i);
        }
    }

    public boolean makePhoneCall(Call call) {
        index.sort((integer, t1) -> (int) Math.floor((Math.random() * 3 - 1)));
        for (Integer integer : index) {
            if (!callCentre.getQueues().get(integer).isFull()) {
                callCentre.bufferMutex.waitS(call);
                callCentre.getQueues().get(integer).put(call);
                Event.CallAppendedToQueue(call.id, (char)(integer + 65));
                callCentre.bufferMutex.signalS();
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        while (numOfCall < number) {
            callCentre.notFull.waitS(this);
            callCentre.S.waitS(this);
            makePhoneCall(new Call(numOfCall + 1));
            callCentre.S.signalS();
            callCentre.notEmpty.signalS();
            numOfCall++;
        }
        callCentre.finishedCall = true;
    }
}

