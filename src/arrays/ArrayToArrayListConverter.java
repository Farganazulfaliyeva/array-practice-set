package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListConverter {
    public static void main(String[] args) {
        String [] array = {"java" , "c#", "c++", "phyton"};

        ArrayList<String> arrays = new ArrayList<>(Arrays.asList(array));
        arrays.add("css");
        arrays.remove("c#");
        System.out.println(arrays);
    }
}
