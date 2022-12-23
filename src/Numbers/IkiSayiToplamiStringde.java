package Numbers;

public class IkiSayiToplamiStringde {
    public static void main(String[] args) {

              /*  Soru 12-)
        Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
        Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
        Degilse sayilarin toplamini yazdiralim
               */
        int sayi1=2500;
        int sayi2=1234567891;
        if((sayi1+"").length()>=10 ||( (sayi2+sayi1)+"").length()>=10 ||(sayi2+"").length()>=10){
            System.out.println("Fazla Yüklenm");
        }else {
            System.out.println("Toplam= " + (sayi1 + sayi2));
        }
    }
}
