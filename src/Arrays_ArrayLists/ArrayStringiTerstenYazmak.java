package Arrays_ArrayLists;

import java.util.Arrays;

public class ArrayStringiTerstenYazmak {
    public static void main(String[] args) {
        // Soru 33-)
        //   Array kullanarak String bir cümleyi Reverse eden (tersine çeviren)
        //   bir Java programı yazın (boşluklar ve özel karakterler dahil).
        //Örnek:
        //String str="Coding is great.";
        // String arr[]: ".taerg si gnidoC"
        // İpucu: Önce Split kullanarak Arraye çevirin
        // ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
        String str="Coding is great.";
        String[]arr=str.split("");
        String[]Ters=new String[arr.length];
        for (int i = 0; i <str.length(); i++) {
           Ters[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(Ters));

    }
}
