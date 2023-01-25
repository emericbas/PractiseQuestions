package Strings;

public class istenilenKelimeILeBaslayanCumle {
    public static void main(String[] args) {
        //kullanicidan aldigimiz cumlede "cok" ile baslayan ilk kelimeyi yazdirn
        String str="Java ile kodlama cok ama cok kolay";
        System.out.println(str.indexOf("cok"));//17.index
        System.out.println(str.substring(17));//cok ama cok kolay

        //2. cok'tan sonraki kismi yazdir
        System.out.println(str.indexOf("cok",18));//25. index
        System.out.println(str.substring(25)); //cok kolay
    }
}
