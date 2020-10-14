import java.util.Vector;

public class Stealer extends Thread{
    CallCentre1 callCentre;

    public Stealer(CallCentre1 c)  {
        this.callCentre = c;
    }

    @Override
    public void run() {
        while (callCentre.isProcessing) {
            callCentre.stealerLock.waitS(this);
            callCentre.notEmpty.waitS(this);
            callCentre.S.waitS(this);
            for(int a = 0; a < callCentre.getQueues().size(); a++) {
                if (!callCentre.getQueues().get(a).isEmpty()) {
                    callCentre.bufferMutex.waitS(this);
                    Call temp = callCentre.getQueues().get(a).steal();
                    Event.WorkerStealsCall(1, 1, 'A');
                    callCentre.bufferMutex.signalS();
                    break;
                }
            }
            callCentre.S.signalS();
            callCentre.notFull.signalS();
        }
    }
}
