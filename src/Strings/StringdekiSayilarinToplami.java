package Strings;

public class StringdekiSayilarinToplami {
    public static void main(String[] args) {
        String str1="Price is 20000 euro";
        String str2="Price is 25000 euro";
// price'larin toplamini bulunuz
     String price1=   str1.replaceAll("\\D","");
     String price2=   str2.replaceAll("\\D","");
     int priceToplam=Integer.parseInt(price1)+Integer.parseInt(price2);
        System.out.println("priceToplam = " + priceToplam);
    }
}
