package Arrays_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FarkliSayilariBulma {
    public static void main(String[] args) {
      /*  (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
       On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
                ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5

       */
        int [] arr={1,2,3,3,4,4,2,1,2,3};
        System.out.println(Arrays.toString(eliminateDuplicates(arr)));
    }
    public static int[] eliminateDuplicates(int[]arr){

        List<Integer>tekrarsizList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
           if(!tekrarsizList.contains(arr[i])){
               tekrarsizList.add(arr[i]);
           }
        }int[]uniqueArray=new int[tekrarsizList.size()];
        for (int i = 0; i <tekrarsizList.size() ; i++) {
            uniqueArray[i]=tekrarsizList.get(i);
        }
return uniqueArray;
    }
}
