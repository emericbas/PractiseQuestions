package EasyQuestions;

public class Avarage0fElements {
    public static void main(String[] args) {
      //  Write a method that returns the average of a list of integers.
       int []arr={7,8,9,5,6,4,4} ;
        System.out.println(avarage(arr));
    }
    public static double avarage(int arr[]){
        double toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        }double avarage=toplam/arr.length;
        return avarage;
    }
}
