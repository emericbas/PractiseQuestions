package EasyQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        //   Write a method that
        //   returns the index of the first occurrence of given integer in a list.
        // Assume that the index of the first element in the list is zero.
        // If the number does not exist return -1.
        int n = 0;
        int[] arr = {2, 3, 5, 6, 7, 9, 8};
        System.out.println(list( arr,n));

    }

    public static int list( int arr[],int n) {
        int index=0 ;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]==(n)) {
                index = i;
            break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}