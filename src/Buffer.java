import java.util.Arrays;

public class Buffer {
    private final Call[] pool;
    private final int poolSize;
    public int in, out, id;
    public Buffer(int poolSize, int id) {
        this.pool = new Call[poolSize];
        this.poolSize = poolSize;
        in = 0;
        out = 0;
        this.id = id;
        for (int c = 0; c < poolSize; c++) {
            pool[c] = new Call(0);
        }
    }

    public void put(Call c) {
        pool[in] = c;
        in = (in + 1) % poolSize;
    }

    public Call remove() {
        Call temp =  pool[out];
        pool[out] = new Call(0);
        out = (out + 1) % poolSize;
        return temp;
    }

    public Call steal() {
        in = (in - 1 + poolSize) % poolSize;
        Call temp = pool[in];
        pool[in] = new Call(0);
        return temp;
    }

    public boolean isEmpty() {
        for (Call a : pool) {
            if (a.id > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isFull() {
        for (Call a : pool) {
            if (a.id == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Buffer{" +
                "pool=" + Arrays.toString(pool) +
                ", poolSize=" + poolSize +
                ", in=" + in +
                ", out=" + out +
                ", id=" + id +
                '}';
    }
}

class Call {
    int id;
    public Call(int i) {
        this.id = i;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id=" + id +
                '}';
    }
}
