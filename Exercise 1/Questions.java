import java.util.Scanner;

public class Questions {
    public static void sqroot() {
        for (int i = 0; i < 21; i++) {
            System.out.println(Math.sqrt(i));
        }
    }

    public static void PrintStarSquare() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j ++) {
                System.out.print("*");
            }
        }
    }
    
    public static void PrintStarRectangle() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please input the height");
            int height = input.nextInt();
            System.out.println("Please input the width");
            int width = input.nextInt();
            for (int i = 0; i < height; i++) {
                System.out.println();
                for (int j = 0; j < width; j ++) {
                    System.out.print("*");
                }
            }
        } 
    }
    public static void main(String[] args) {
        sqroot();
        System.out.println();
        PrintStarSquare();
        System.out.println();
        PrintStarRectangle();
    }
}
