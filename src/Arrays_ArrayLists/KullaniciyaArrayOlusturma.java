package Arrays_ArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("arrayin uzunlugunu giriniz");
        int arrayinUzunlugu=scan.nextInt();
        int[] arr=new int[arrayinUzunlugu];
        for (int i = 0; i < arrayinUzunlugu; i++) {
            System.out.println("Listenin "+i+" nci elemanini giriniz");
            int elementler=scan.nextInt();
            arr[i]=elementler;
        }
        System.out.println(Arrays.toString(arr));
    }
}
