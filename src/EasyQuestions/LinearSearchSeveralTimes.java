package EasyQuestions;

import java.util.ArrayList;
import java.util.List;

public class LinearSearchSeveralTimes {
    public static void main(String[] args) {
        //   Write a method that
        //   returns the indexes  of given integer in a list.
        // Assume that the index of the first element in the list is zero.

        int n = 5;
        int[] arr = {2, 3, 5, 6, 7, 5, 8};
        System.out.println(list(arr, n));
    }

    public static List<Integer> list(int arr[], int n) {
        int index = 0;
        List<Integer> sayi = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                sayi.add(i);
            }
        }
        return sayi;
    }
}