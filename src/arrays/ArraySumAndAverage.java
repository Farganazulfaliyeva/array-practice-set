package arrays;

import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        System.out.print("Enter numbers separated by space: ");
        String line =  new Scanner(System.in).nextLine();
        String[] parts = line.split(" ");

        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        // Sum və average
        int sum = 0;
        for (int num : numbers) sum += num;
        double average = (double) sum / numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
