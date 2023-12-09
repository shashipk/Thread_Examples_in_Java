Notes - Designing Threads

Thread -

A thread is a light weight process, it is given its own context and stack etc. for preserving the state. Thread state enables the CPU to switch back and continue from where it stopped.

Creating Threads in Java -

When you launch Java application, JVM internally creates few threads, e.g. Main thread for getting started with main() and GarbageCollector for performing garbage collection and few other threads which are need for execution of a Java application.

You can create a thread and execute the tasks with in the application, this enables you to perform parallel activities with in the application.

There are two approaches,

1) Extending the Thread class and performing the task. This is not a preferred approach because you are not extending the Thread functionality, instead you are using the Thread to execute a task, hence you should prefer the second approach.

2) Implementing the Runnable interface and then submitting this task for execution. Similarly there is a Callable interface(explained later) as well.



run() method -

Once you choose your approach, you can consider the run() method as the entry point for thread execution. To simplify just think like main() for a program, run() for a thread.

start() method -

Execution of the thread should be initiated using the start() method of the Thread class. This submits the thread for execution. This takes the associated thread to ready state, this doesn't mean it is started immediately. i.e. in simple terms, when you call the start() method, it marks the thread as ready for execution and waits for the CPU turn.


There are three threads in the above program (system threads ignored). One the Main thread that prints "M" and thr that prints "T" and thr2 that prints "-". Because they are executed in parallel, you will see the output like MMMTTT---MMMTTT--- ...