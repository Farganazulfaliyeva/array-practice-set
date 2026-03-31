package arrays;

public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {8,9,7,6,14,10,0};
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers){
            if (max<num)max = num;
            if (min>num)min =num;
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
