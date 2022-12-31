package Arrays_ArrayLists;

import java.util.Arrays;

public class ArraydeMinMaxSayi {
    public static void main(String[] args) {
          /*  Soru-39)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve
         verilen bu (Arrayden) diziden minimum ve maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,-6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemni kullanabilirsiniz.
   */

        int[] arr = {3, 2, 5, 4, 1, -6};
        minMax(arr);
    }

    public static void minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("minimum sayi :" + min);
        System.out.println("max sayi : " + max);
        System.out.println("-------sortMethodu---------");
        Arrays.sort(arr);

        System.out.println("minimum sayi :" + arr[0]);
        System.out.println("maximum sayi :" + arr[arr.length-1]);

    }
}