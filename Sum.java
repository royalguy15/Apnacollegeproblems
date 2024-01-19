package Questions;

import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number a:");
        double a = sc.nextDouble();

        System.out.print("Enter a Number b:");
        double b = sc.nextDouble();

        System.out.print("Enter a Number c:");
        double c = sc.nextDouble();

        double sum = (a + b + c) / 3;

        System.out.println("Sum of the given Input:" + sum);

    }
}
