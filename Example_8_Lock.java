
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Example_8_Lock {

    public static void main(String[] args) {

        Sample2 obj = new Sample2();
        obj.setX(10);

        MyThread8 t1 = new MyThread8(obj);
        MyThread8 t2 = new MyThread8(obj);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println( obj.getX() );
    }
}



class Sample2 {

    private int x;

    // ReadWriteLock object for requesting the lock.
    ReadWriteLock rw_lock = new ReentrantReadWriteLock();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void incr() {

        // Request the write lock as the
        // operation is intended to modify the data.

        Lock lock = rw_lock.writeLock();
        lock.lock();

        try {

            int y = getX();
            y++;

            // Just for simulation
            try { Thread.sleep(1); } catch(Exception e) {}

            setX(y);

        } finally {
            // Unlock
            lock.unlock();
        }
    }

}

class MyThread8 extends Thread {

    Sample2 obj;

    public MyThread8(Sample2 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.incr();
    }
}

