
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Example_3_0 {

    public static void main(String[] args) throws IOException {

        String sourceFile1 = "a.txt";
        String sourceFile2 = "b.txt";

        String destFile1 = "c.txt";
        String destFile2 = "d.txt";

        // 1. Copy a.txt to c.txt
        IOUtils.copyFile(sourceFile1, destFile1);

        // 2. Copy b.txt to d.txt
        IOUtils.copyFile(sourceFile2, destFile2);
    }
}


/* A simple utility to copy the content
 * of the given source file to the given
 * destination file. */
class IOUtils {

    /*
     * Copies the given source stream
     * i.e. src to the given
     * destination stream i.e. dest.
     */
    public static void copy(InputStream src, OutputStream dest) throws IOException {
        int value;
        while ((value = src.read()) != -1) {
            dest.write(value);
        }
    }

    /*
     * Copies the given srcFile to the destFile.
     */
    public static void copyFile(String srcFile, String destFile) throws IOException {
        FileInputStream fin = new FileInputStream(srcFile);
        FileOutputStream fout = new FileOutputStream(destFile);

        copy(fin, fout);

        fin.close();
        fout.close();
    }
}

