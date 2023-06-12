package day017arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    /*
    1) sort() method puts the list elements in "alphabetical order" if the elements String
    2) sort () method puts the list elements in "ascending order" if the elements are numbers
    3)"alphabetical order" and "ascending order" are called "Natural Order"
     */

    public static void main(String[] args) {

        //Example 1: Type code to check if the elements in a String ArrayList are in alphabetical order or not

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Tampa");
        cities.add("Albany");
        cities.add("Jacksonville");
        System.out.println(cities); // [Miami, Tampa, Albany, Jacksonville]

        ArrayList<String> newCities = new ArrayList<>();
        newCities.addAll(cities);
        System.out.println(newCities); // [Miami, Tampa, Albany, Jacksonville]

        Collections.sort(newCities);
        System.out.println(cities); //[Miami, Tampa, Albany, Jacksonville]
        System.out.println(newCities); //[Albany, Jacksonville, Miami, Tampa]

        if (cities.equals(newCities)){
            System.out.println("Elements are in alphabetical order");
        }else{
            System.out.println("Elements are not in alphabetical order");
        }

       //Example 2: Type code to find the closest values in an Integer List
        //          [12, 31, 15, 32, 54] ==> 12 and 15

        ArrayList<Integer>  num = new ArrayList<>();
        num.add(12);
        num.add(31);
        num.add(15);
        num.add(32);
        num.add(54);

        Collections.sort(num);
        System.out.println(num); // [12, 15, 31, 32 ,54]

        int minDiff = num.get(1) - num.get(0);

        for (int i=1; i< num.size(); i++){
           minDiff = Math.min(minDiff, num.get(i) - num.get(i-1));
        }
        System.out.println(minDiff); //1

       for (int i=1; i< num.size(); i++){

           if (minDiff == num.get(i) - num.get(i-1)){
               System.out.println(num.get(i-1) + " and " + num.get(i) ); // 31 and 32
           }

       }


        //Example 3: Type code to find the sum of the elements if they are different from 31 and 54
        //           [12, 31, 15, 32 ,54] ==> 12+ 15 + 32 =59

        ArrayList<Integer>  num1 = new ArrayList<>();
        num1.add(12);
        num1.add(31);
        num1.add(15);
        num1.add(32);
        num1.add(54);

         int sum = 0;

         for (Integer w: num1){
            if (w==31 || w==54){
                continue;
        }
            sum = sum + w;
        }
        System.out.println(sum);//59


        //Example 4: Type code to check if all elements are unique or not in a List
        //          [12, 31, 15, 32 ,54] ==> Unique       [12, 31, 15, 32 ,54] ==> Not Unique


        ArrayList<Integer>  num2 = new ArrayList<>();
        num2.add(12);
        num2.add(31);
        num2.add(15);
        num2.add(32);
        num2.add(54);

        //1.Way:
        int counter  = 0;

        for (Integer w : num2){
            if (num2.indexOf(w) !=num2.lastIndexOf(w)){
                System.out.println("All elements are not unique");
                break;
            }else{
                counter++;
            }
        }
            if (counter ==num2.size()){
                System.out.println("All elements are unique");
            }

    }
}
