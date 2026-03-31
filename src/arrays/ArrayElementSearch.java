package arrays;

import java.util.Scanner;

public class ArrayElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();

        int[] numbers = {2, 4, 5, 6, 3, 87, 34, 12, 78, 43, 21};

        if (searchArray(n, numbers)) {
            System.out.println("Find number");
        } else {
            System.out.println("Not Find number!");
        }
    }

    public static boolean searchArray(int a, int[] array) {
        for (int num : array) {
            if (num == a) {
                return true;
            }
        }
        return false;
    }
}
