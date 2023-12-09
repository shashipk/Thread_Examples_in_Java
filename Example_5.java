
class MyThread5 extends Thread {

    public void run() {

        // Intentionally kept in infinite loop
        for( ;; ) {

            // Returns true if the thread is interrupted.
            if (interrupted()) {

                // You are supposed to rollback or reverse the operation
                // in progress and stop.

                System.out.println("Thread is interrupted hence stopping..");

                // Terminates the loop.
                break;
            }

            System.out.print("T");
        }
    }
}



public class Example_5 {


    public static void main(String[] args) {

        MyThread5 thr = new MyThread5();
        thr.start();

        // Just for demo, wait for 2 seconds
        // before interrupting thr.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread.
        thr.interrupt();
    }
}
