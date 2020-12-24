import java.io.IOException;

public class FileWriterThread extends  Thread{
    FileWriter fileWriter;
    private String message;

    public FileWriterThread(FileWriter fileWriter,String message) {
        this.fileWriter = fileWriter;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            fileWriter.writeToFile(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
