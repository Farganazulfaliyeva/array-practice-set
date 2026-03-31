package arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {23,1,2,7,89,75,45,32,90,98};

        int max = numbers[0];
        int secondMax = numbers[0];
        for (int num : numbers){
            if (num > max) {
                secondMax = max;
                max = num;
            }
           else if (num > secondMax && num != max){
                    secondMax = num;
                }
        }
        System.out.println(secondMax);
    }
}
