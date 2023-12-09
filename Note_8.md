Read/Write Lock -
Read/Write Lock gives us more flexibility during locking and unlocking. Based on the type of operation being performed over the object we can segregate the locks into

1) readLock

2) writeLock

readLock allows us to lock the object for read operation, and the interesting point is that the read operation can be shared i.e if two threads are waiting for readLock then both of them can proceed forward with the operation as read operation doesn't change the data.

Where as writeLock is mutually exclusive i.e. if a writeLock is accepted then all the other lock requests should wait till the thread that owns the lock releases it.

For example let us assume the following chronologically ordered lock requests

T1 -> lock.readLock();

T2 -> lock.readLock();

T3 -> lock.readLock();

T4 -> lock.writeLock();

T5 -> lock.readLock();

Here T1, T2, T3 can share the readLock and proceed forward with the operation.  Where T4 should wait till T1, T2 and T3 unlocks.

Why T5 is waiting ?

Because writeLock is requested by T4 before its request and hence all subsequent requests to read/write locks should wait.

This is in contrast to synchronized methods/blocks because for synchronized method/block there is no segregation of read and write operations. Object is locked no matter whether it is read or write.

Caution - It is always better to put the unlock operation in finally, as you need to unlock irrespective of exceptions.

Example -
Example is just for demo, hence lock/unlock operations are kept in incr() method itself. They can be added to getX() and setX() operations as well.