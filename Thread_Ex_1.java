
class MyThread1 extends Thread{

    public void run(){
        System.out.println("thread is running..." + Thread.currentThread().getName());
        System.out.println("name: "+ Thread.currentThread().getName());
    }
}

public class Thread_Ex_1 {

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();

        t1.setName("MyThread 1");

        MyThread1 t2 = new MyThread1();

        t2.setName("MyThread 2");

        t1.start();
        t2.start();

    }
}
