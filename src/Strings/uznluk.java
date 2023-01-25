package Strings;

public class uznluk {
    public static void main(String[] args) {
        //  Question 5 : Get the user's first and last name separately.
        //          - if the name is longer, print the first letters of the name and surname as capitals and the rest
        //  should be lowercase
        //          - if the surname is longer, print the first letter of the name as capital and the rest of the name
        //  should be lowercase. And all of surname letters should be in capitals
        // esitse hepsi capital letter
        String name = "gULca";
        String surname = "bASAr";
if(name.length()>surname.length()){
    System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+
            " "+surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase());
}else if (name.length()<surname.length()){
    System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+
            " "+surname.toUpperCase());
}else System.out.println(name.toUpperCase()+" "+surname.toUpperCase());
    }
}
