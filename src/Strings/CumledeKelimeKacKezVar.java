package Strings;

public class CumledeKelimeKacKezVar {
    public static void main(String[] args) {
        //KUllanicidan cumle ve metin al
        // 1)Cumle metini icermiyor
        // 2)Cumle metini sadece birkez iceriyor
        //3)Cumle metini 1'den fazla iceriyor  yazdirin
        String cumle="Java  guzeldir cok ama cok.";
        String metin="cok";
        int ilkIndex =cumle.indexOf(metin);
        int sonIndex=cumle.lastIndexOf(metin);
        if(!cumle.contains(metin)){
            System.out.println("Cumle metini icermiyor");
        }else if(ilkIndex==sonIndex) {
                System.out.println("Cumle metini sadece birkez iceriyor");
            }else System.out.println("Cumle metini 1'den fazla iceriyor");

            }
        }


