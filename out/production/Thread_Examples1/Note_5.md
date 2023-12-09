Stopping threads in the middle -
stop() method of the Thread class could be used to stop the thread in the middle. But this is the dangerous thing to do as it leaves the system in inconsistent state, because we are not giving the opportunity to the thread to rollback or reverse the actions that it has taken. And hence the stop method is deprecated and should not be used.

Correct approach would be to call the interrupt() method on the thread and then it is up to the thread to consider whether to stop or not.

A thread can then check if it was interrupted or not using interrupted() method of the Thread class. We can design the thread in a way that it reverses the actions/operations performed and then stop when interrupted.

Note - If you are not extending Thread class and instead implementing Runnable interface, then you can use Thread.isInterrupted() to check if the current thread is interrupted.

interrupted() and Thread.isInterrupted() both methods return true if the thread is interrupted when it is alive.




sleep() method -

sleep() method of the thread class is used to block the thread for the given time interval in milliseconds. This method throws InterruptedException if the thread is interrupted while it is in sleep.