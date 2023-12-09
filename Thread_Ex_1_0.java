

class MyTask {

    public void doTask() {
        for(int i=1; i <= 1500; i++) {
            System.out.print("T");
        }
    }
}

public class Thread_Ex_1_0 {

    public static void main(String[] args) {

        // Print M's
        for(int i=1; i <= 1500; i++) {
            System.out.print("M");
        }

        // Call the task to print T's
        Task t1 = new Task();
        t1.doTask();
    }
}
