import java.io.IOException;

public class Example_3_1 {

    public static void main(String[] args) throws IOException {

        String sourceFile1 = "a.txt";
        String sourceFile2 = "b.txt";

        String destFile1 = "c.txt";
        String destFile2 = "d.txt";

        // A new thread is created to initiate copy
        // from a.txt to c.txt
        // Thread-1

        new Thread(new CopyTask(sourceFile1, destFile1)).start();

        // A new thread to initiate copy from
        // b.txt to d.txt
        // Thread-2

        new Thread(new CopyTask(sourceFile2, destFile2)).start();
    }
}


/*
 * A Runnable task to copy the given source file
 * to the given destination file.
 */
class CopyTask implements Runnable {

    String sourceFile;
    String destFile;

    public CopyTask(String sourceFile, String destFile) {
        this.sourceFile = sourceFile;
        this.destFile = destFile;
    }

    /*
     * Initiate the copy once thread execution begins.
     */
    public void run() {
        try {
            IOUtils.copyFile(sourceFile, destFile);
            System.out.println("Copied from - " + sourceFile + " to " + destFile);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}

