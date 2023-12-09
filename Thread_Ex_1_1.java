public class Thread_Ex_1_1 {

    public static void main(String[] args) {

        Task t1 = new Task();
        // Starts a separate Thread using the
        // the start method of the Thread class.
        t1.start();

        // runs in the Main thread and prints 1500 M's
        for(int i=1; i <= 150; i++) {
            System.out.println("M " + Thread.currentThread().getName());
        }
    }
}

class Task extends Thread {

    // Thread execution begins here.
    public void run() {
        // performs the task i.e. prints 1500 T's
        doTask();
    }

    public void doTask() {
        for(int i=1; i <= 150; i++) {
            System.out.println("T " + Thread.currentThread().getName() );
        }
    }
}



