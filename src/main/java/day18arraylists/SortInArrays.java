package day18arraylists;

import java.util.Arrays;

public class SortInArrays {

    public static void main(String[] args) {

        char[] arr = {'b', 'e', 'a', 'd'};

        //How to sort array elements in natural order
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); //[a, b, d, e]

        //How to check if a specific element exists in an array or not
        //To check if a specific element exist in an array or not use binarySearch()
        int[] brr = {12, 3, 5, 10, 2};

        //1.Step : sort the array elements
        Arrays.sort(brr);

        System.out.println(Arrays.toString(brr)); //[2, 3, 5, 10, 12]

        //2.Step : Use binarySearch() method
       int r1 =  Arrays.binarySearch(brr, 5);
        System.out.println(r1); //4 ==> If the output is valid index(from 0 to ...), it means the array has the element

      int r2 = Arrays.binarySearch(brr, 4);
        System.out.println(r2); // -3 ==> the element does not exist. If the element 4 exists in the array it would be in the fourth order




















    }
}
