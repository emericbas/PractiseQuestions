package Arrays_ArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        //  Soru 32-)
        //  Kullanıcıdan alacagınız bilgilerle oluşturdugunuz
        //  bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        // İpucu:  int arrReverse[] diye bir array oluşturun ve
        // kullancıya oluşturdugunuz arrayi buna tersten assign edin...
        Scanner scan=new Scanner(System.in);
        System.out.println("Dizinin uzunlugunu  giriniz");
        int uzunluk=scan.nextInt();
        int[] arr=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Arrayin "+i+" inci indexteki sayiyi giriniz");
            int element=scan.nextInt();
            arr[uzunluk-1-i]=element;
        }
        System.out.println(Arrays.toString(arr));

    }
}
