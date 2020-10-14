import java.util.Arrays;
import java.util.LinkedList;

public class Sem {
    int s;
    LinkedList<Object> cond;
    public Sem(int k) {
        s = k;
        cond = new LinkedList<>();
    }

    public void waitS(Object o) {
        if (s == 0) {
            waitC(cond, o);
        } else {
            s--;
        }
    }

    public void signalS() {
        if (cond.size() == 0) {
            s++;
        } else {
            signalC(cond);
        }
    }

    public void waitC(LinkedList<Object> cond, Object o) {
        cond.add(o);
        synchronized (o) {
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            o.notify();
        }
    }

    public void signalC(LinkedList<Object> cond) {
////////////////////////////////////////////////////////////////////////////////
//      Worker #3 has chosen Queue A
//      Worker #2 has chosen Queue B
//      Worker #1 has chosen Queue C
//      Call #1 has been appended to Queue A
//      Call #2 has been appended to Queue B
//      Worker #2 has answered call #2
//      Call #3 has been appended to Queue B
//      Worker #3 has answered call #1
//      Worker 2 Buffer{pool=[Call{id=0}, Call{id=3}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=2, out=1, id=1}
//      Worker 3 Buffer{pool=[Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}, Call{id=0}], poolSize=5, in=1, out=1, id=0}
//      Exception in thread "Thread-3" java.util.NoSuchElementException
//
//
        if (cond.size() != 0) {
            System.out.println(Arrays.toString(cond.toArray()));
            Object o = cond.pop();
            synchronized (o) {
                o.notify();
            }
        }
    }
}
