package practice01;

import java.util.Arrays;

public class Q03_ArraysAnagram {
    public static void main(String[] args) {
        /*
         Type code to check if two strings are Anagram or not.
         Anagram: A word or phrase made by using the letters of another word or phrase in a different order.
       Ex:
       dormitory → dirty room
       debit card → bad credit
       Eleven plus two → Twelve plus one
       A decimal point → I'm a dot in place
       Vacation time → I am not active
         */

        System.out.println(isAnagram("eleven plus two", "twelve plus one"));
  }
       public static boolean isAnagram(String str1, String str2){

       String [] arr1 = str1.toLowerCase().replaceAll("[^a-z]","").split("");
       String [] arr2 = str2.toLowerCase().replaceAll("[^a-z]","").split("");

           System.out.println(Arrays.toString(arr1));
           System.out.println(Arrays.toString(arr2));

           Arrays.sort(arr1);
           System.out.println(Arrays.toString(arr1));

           Arrays.sort(arr2);
           System.out.println(Arrays.toString(arr2));

           if (Arrays.equals(arr1,arr2)){
               return true;
           }else{
               return false;
           }
       }














}