import java.util.ArrayList;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class PiFinder implements Runnable {

    Random random = new Random();
    public PiFinder(long avalue) {
        this.value = avalue;
        File obj = new File("words.txt");
        try (Scanner wordFile = new Scanner(obj)) {
            while (wordFile.hasNextLine()) {
                words.add(wordFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }

    @Override
    public void run() {
        try {
            int index;
            int length;
            for (int i = 0; i < 1000; i++) {
                do {
                    index = random.nextInt((int) (Math.log10(value) + 1));
                    length = random.nextInt((int) (Math.log10(value) + 1) - index);
                } while (length != (int) (Math.log10(value) + 1));
            }


            
        } catch (InterruptedException e) {
            System.err.println(e.toString());
        }
    }

    private long value;
    private ArrayList<String> words = new ArrayList<>();
}
