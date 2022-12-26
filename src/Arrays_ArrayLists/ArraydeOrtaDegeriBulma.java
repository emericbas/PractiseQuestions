package Arrays_ArrayLists;

import java.util.Arrays;

public class ArraydeOrtaDegeriBulma {
    public static void main(String[] args) {
        //  Soru 36-)
        //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.

        //Örnek:
        //input arr[]=   {1,2,3,4,5,6,7}
        //output:   4
        int [] arr={1,2,3,4,5,6,7,8};
        System.out.println((OrtadakiSayi(arr)));

    }
    public static int  OrtadakiSayi(int[]arr) {
        int ortadakiDeger = 0;
        if (arr.length % 2 != 0) {
            ortadakiDeger = arr[arr.length / 2];
        }else{ System.out.println("Uzunlugu tek sayi olan bir array giriniz");
        }
        return  ortadakiDeger;
    }
}
