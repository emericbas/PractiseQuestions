package EasyQuestions;

import java.util.ArrayList;
import java.util.List;

public class NthElements {
    public static void main(String[] args) {
       // Write a method that returns the nth odd element of a list.
        // If the index of the element exceeds the list size, then return -1
        list();
    }  public static void  list () {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        int temp=0;
        for (int i = 0; i < list.size(); i++) {
            if(temp%2==0){
                System.out.println(i+" ");
                temp++;
            }//if(list.size()){

            }
        }
    }


