import java.util.ArrayList;
import java.util.Scanner;
public class average {

    static void print(String text) {
        System.out.println(text);
    }

    static void print(int text) {
        System.out.println(text);
    }

    static void print(float text) {
        System.out.println(text);
    }

    static void print(double text) {
        System.out.println(text);
    }

    static float averageFor() {
        try (Scanner input = new Scanner(System.in)) {
            print("Please enter the number of marks");
            int quantity = input.nextInt();
            ArrayList<Integer> numberOfMarks = new ArrayList<Integer>();
            for (int i = 0; i < quantity; i++) {
                print("Please enter the score");
                numberOfMarks.add(input.nextInt());
            }
            int sum = 0;
            for (int i : numberOfMarks) {
                sum += i;
            }
            float average = (float) sum / quantity;

            return average;
        }
    }

    static float averageWhile() {
        try (Scanner input = new Scanner(System.in)) {
            print("Please enter your mark, after your last mark please enter -1 to calculate the average...");
            ArrayList<Integer> scoreList = new ArrayList<Integer>();
            int score = input.nextInt();
            scoreList.add(score);
            while (score != -1) {
                print("Please enter your next mark");
                score = input.nextInt();
                scoreList.add(score);
            }
            int sum = 0;
            for (int i = 0; i < scoreList.size(); i++) {
                sum += (scoreList.get(i) > -1)? scoreList.get(i) : 0;
                /* 
                Iterate until the second last element for below
                sum += scoreList.get(i);
                */
            }
            float average = (float) sum / (scoreList.size() - 1);

            return average;
        }
    }

        static float averageDoWhile() {
            try(Scanner input = new Scanner(System.in)){
                ArrayList<Integer> scoreList = new ArrayList<Integer>();
                print("Please input marks as the average is being calculated, enter -1 to exit program");
                int score;
                int sum = 0;
                float average;
                do {
                    score = input.nextInt();
                    sum += (score > -1)? score : 0;
                    scoreList.add(score);
                    average = (score > -1)? (float) sum / (scoreList.size()) : (float) sum / (scoreList.size() - 1);
                    print("Average: " + average);
                } while (score > -1);
                average = (float) sum / (scoreList.size() - 1);
                print("Final Average");
                return average;
            }
        }

    public static void main(String[] args) {
        // print(averageFor());
        // print(averageWhile());
        print(averageDoWhile());
    }
}
