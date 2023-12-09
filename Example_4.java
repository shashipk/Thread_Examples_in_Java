
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ExecutorService
public class Example_4 {

    public static void main(String[] args) throws IOException {

        String sourceFile1 = "a.txt";
        String sourceFile2 = "b.txt";

        String destFile1 = "c.txt";
        String destFile2 = "d.txt";

        // Creates a fixed thread pool of size 5.

        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Assume you are submitting 100 copy tasks,
        // then executor service uses a fixed thread
        // pool of size 5 to execute them.

        executor.execute(new CopyTask(sourceFile1, destFile1));
        executor.execute(new CopyTask(sourceFile2, destFile2));
    }
}
