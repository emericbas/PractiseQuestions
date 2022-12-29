package EasyQuestions;

public class SecondLarger {
    public static void main(String[] args) {
        // Find the second largest number in an integer array.
        // You can assume a minimum array length of two
        Integer[] arr = {2, 5, 3, 1, 7};
        System.out.println(find(arr));
    }


    public  static Integer find(Integer[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
    }

    if (arr[i] < max && arr[i] > secondMax) {
        secondMax = arr[i];
    }
}
return secondMax;
}}