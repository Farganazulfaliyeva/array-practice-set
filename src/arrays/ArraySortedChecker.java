package arrays;

public class ArraySortedChecker {
    public static void main(String[] args) {
      int[] numbers = {6,5,4,3,2,1};
        System.out.println(CheckSort(numbers));

    }
    public  static String CheckSort(int[] nums){
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i =0; i<nums.length -1; i++){
            if (nums[i] > nums[i+1]){
                isAscending =false;
            }
            if (nums[i] < nums[i+1]){
                isDescending =false;
            }
        }
        if (isAscending) return "Artan";
        if (isDescending) return "Azalan";
        return "Not sorted!";
    }
}
