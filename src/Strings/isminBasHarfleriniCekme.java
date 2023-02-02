package Strings;

import java.util.Scanner;

public class isminBasHarfleriniCekme {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz , 3 kelimeden olusan ismi
        // orn: Ahmet Emin Yilmaz==> A.E.Y. formatiyla yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.println("3 kelimelik bir isim giriniz");
        String isim=scan.nextLine();
        int indexOfBirinciBosluk=isim.indexOf(" ");

        System.out.println(isim.substring(0,1)+"."+isim.substring(indexOfBirinciBosluk+1,indexOfBirinciBosluk+2)+
                "."+isim.charAt(isim.lastIndexOf(" ")+1)+".");

        // 4 harfli bir kelimeyi tersten yazdirin
        System.out.println("4 harfli bir kelime giriniz");
        String kelime= scan.nextLine();
        String ters="";
        for (int i = kelime.length()-1; i >=0; i--) {
            ters+=kelime.charAt(i);

        }
        System.out.println(ters);
    }
}
