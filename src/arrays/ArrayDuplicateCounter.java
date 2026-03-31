package arrays;

public class ArrayDuplicateCounter {
    public static void main(String[] args) {
        int[] numbers = {9, 54, 32, 45, 123, 90, 34, 23, 89, 45, 123,123};

        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }

           if (count>1){
               System.out.println(numbers[i] + " -> " + count);
           }

        }
    }
}
