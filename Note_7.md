Deadlock -
Two threads are said to be in a deadlock when both the threads are circularly waiting for a lock over the object and hence they both get into a situation where they can not proceed with the execution.


Assume that for a writer to write lock should be acquired on both the Book and the Pen. And also assume there is only one instance of the book and the pen is available. In that case assume that writer1 acquires lock over the book object and writer 2 acquires lock over the pen object. Now writer1 is waiting for the pen and writer2 is waiting for the book, and they both are deadlocked.