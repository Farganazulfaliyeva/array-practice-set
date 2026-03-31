package arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {2,5,6,76,89,23,56,44,23,9,13};
        int start = 0;
        int end = numbers.length -1;
       while (start < end){
           int temp = numbers[start];
           numbers[start] = numbers[end];
            numbers[end] = temp;
            start ++;
            end --;
       }

        System.out.println(Arrays.toString(numbers));
    }
}
