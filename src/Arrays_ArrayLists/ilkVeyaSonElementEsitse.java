package Arrays_ArrayLists;

public class ilkVeyaSonElementEsitse {
    public static void main(String[] args) {
      /*  Given 2 arrays of ints, a and b,
       return true if they have the same first element or they have the same last element.
   Both arrays will be length 1 or more.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true
       */
        int []arr1={3,4,5,6};
        int []arr2={1,4,0,8,5,6,9};
        if(arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]){
            System.out.println("true");
        }else System.out.println("false");
    }
}
