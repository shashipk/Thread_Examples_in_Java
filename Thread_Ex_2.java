class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("name "+ Thread.currentThread().getName());
        System.out.println("Done !! name "+ Thread.currentThread().getName());
    }
}

public class Thread_Ex_2 {

    public static void main(String[] args) {

        MyThread2 myThread2 = new MyThread2();

        Thread t1 = new Thread(myThread2);

        t1.setName("Thread 1");

        t1.start();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                //Code that will run in  a new thread
                System.out.println("we are now in thread "+Thread.currentThread().getName());
                System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            }
        });

        thread.setName("2nd Thread");

        thread.run();
    }
}
