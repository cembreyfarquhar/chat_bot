package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Sage.");
        System.out.println("I was created in 2019.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String yourName = scanner.nextLine();

        System.out.println("What a great name you have, " + yourName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        String input = scanner.nextLine();

        String[] inputArr = input.split(" ");

        int[] remainderArr = new int[3];

        for (int i = 0; i < remainderArr.length; i++) {
            remainderArr[i] = Integer.parseInt(inputArr[i]);
        }

        // reading all remainders

        int yourAge = (remainderArr[0] * 70 + remainderArr[1] * 21 + remainderArr[2] * 15) % 105;

        System.out.println("Your age is " + yourAge + " that's a good time to start programming!");
    }
}
