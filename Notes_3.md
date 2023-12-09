Parallel Mode -


The two copy operations above are initiated through two different threads, which enables us to perform the operation in parallel. For this we defined a CopyTask which is a Runnable task, you should pass the source and the destination to the constructor which are then used to perform the copy operation once the task execution begins.

