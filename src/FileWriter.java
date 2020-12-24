import java.io.File;
import java.io.IOException;

public class FileWriter {
    File file;
    java.io.FileWriter fileWriter;

    public FileWriter() throws IOException {
        this.file = new File("midas.txt");
        this.fileWriter = new java.io.FileWriter(file,true);
    }

    public synchronized void writeToFile(String message) throws IOException {
        fileWriter.write("\n" + message + "\n");
        fileWriter.flush();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
