package arrays;

import java.util.Scanner;

public class ArrayElementRemover {
    public static void main(String[] args) {
        int[] numbers = {2,45,6,78,4,31,9,1};
        System.out.print("Please enter the index: ");
        int n = new Scanner(System.in).nextInt();

        int[] newArray = new int[numbers.length - 1];
        int idx = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i == n) continue;
            newArray[idx++] = numbers[i];
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }

    }
}
