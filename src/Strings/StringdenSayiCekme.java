package Strings;

public class StringdenSayiCekme {
    public static void main(String[] args) {
        //Asagidaki arama sonucunun 10 binden fazla oldugunu test edin
        String sonuc= "1-16 of over 100,000 results for \"apple\"";
        int indexOfOver=sonuc.indexOf("over");
        int indexOfRes=sonuc.indexOf("res");
        String yuzBin=sonuc.substring(indexOfOver+5,indexOfRes-1);
        //,'den kurtul
        int yuzBIN=Integer.parseInt(yuzBin.replace(",",""));
        System.out.println(yuzBIN);
        if(yuzBIN>=10000) System.out.println("passed");
        else System.out.println("failed");
    }
}
