import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter();
        FileWriterThread fileWriterThread1 = new FileWriterThread(fileWriter,"message no 1");
        FileWriterThread fileWriterThread2 = new FileWriterThread(fileWriter,"message no 2");
        FileWriterThread fileWriterThread3 = new FileWriterThread(fileWriter,"message no 3");
        FileWriterThread fileWriterThread4 = new FileWriterThread(fileWriter,"message no 4");
        FileWriterThread fileWriterThread5 = new FileWriterThread(fileWriter,"message no 5");
        FileWriterThread fileWriterThread6 = new FileWriterThread(fileWriter,"message no 6");
        FileWriterThread fileWriterThread7 = new FileWriterThread(fileWriter,"message no 7");
        FileWriterThread fileWriterThread8 = new FileWriterThread(fileWriter,"message no 8");
        FileWriterThread fileWriterThread9 = new FileWriterThread(fileWriter,"message no 9");


        try {
            fileWriterThread1.start();
            fileWriterThread1.join();
            fileWriterThread2.start();
            fileWriterThread2.join();
            fileWriterThread3.start();
            fileWriterThread3.join();
            fileWriterThread4.start();
            fileWriterThread4.join();
            fileWriterThread5.start();
            fileWriterThread5.join();
            fileWriterThread6.start();
            fileWriterThread6.join();
            fileWriterThread7.start();
            fileWriterThread7.join();
            fileWriterThread8.start();
            fileWriterThread8.join();
            fileWriterThread9.start();
            fileWriterThread9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
