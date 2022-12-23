package IfElse;

import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
                /*  Soru 10-)  Klasik Soru :slightly_smiling_face:
        Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın

                **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
                Kullanıcıya aşağıdaki gibi mesaj verin:

        Eğer VKİ 18.5'ten az ise --> zayıfsınız
        Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        VKİ 30'a eşit veya daha fazlaysa --> obez*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kilonuzu  (kg) giriniz");
        double agirlik= scan.nextDouble();
        System.out.println("Lutfen boyunuzu (m) giriniz");
        double boy= scan.nextDouble();
        double vki=agirlik/(boy*boy);
        if(vki<18.5) {
            System.out.println("zayifsiniz,yerinizde olmayi cok isterdim");
        }else if(vki>=18.5 &&vki<25){
            System.out.println("ideal kilo");
        }else if (vki>=25 && vki<30){
            System.out.println("sizi anliyorum ,uzulmeyin,.");
        }else if (vki>=30){
            System.out.println("obezsiniz");

        }
    }
}
