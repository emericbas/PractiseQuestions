package EasyQuestions;

import java.util.Arrays;
import java.util.List;

public class FindMaximum_Minimum {
    public static void main(String[] args) {
      //  Write a method that returns the largest and lowest  integer in the array  list.
      //  ilk ielementi min,ikinci elementi max olan bir arrayde sonucu yaziniz
        int []arr={2,6,-7,5,6,3,11,-4};
        System.out.println(Arrays.toString(maxMin(arr)));
    }
    public static int[] maxMin(int[]arr){
        int min=arr[0];
        int max=arr[0];
        int []minMax=new int[2];
        for (int i = 0; i <arr.length ; i++) {
           if(arr[i]>max) {
               max=arr[i];
               minMax[1]=max;
           }if(arr[i]<min){
              min=arr[i];
               minMax[0]=min;
            }
        }return minMax;

    }

}
