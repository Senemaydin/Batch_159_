package day15multimensionalarrys;

import java.util.Arrays;

public class Md02 {

    public static void main(String[] args) {

        //Example 1: Convert a multidimensional array to one dimensional array
        //            { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        String[][] words =  { {"learn", "java", "it"}, {"is", "easy"} };

    //1.Step: Create a one dimensional array
        // We need to calculate the number of elements in the multidimensional array
        int totalNumOfElements =0;

        for (String[] w: words){
            totalNumOfElements = totalNumOfElements + w.length;
        }
        String[] newWords = new String[totalNumOfElements];

        System.out.println(Arrays.toString(newWords));//[null, null, null, null, null]

        //2.Step : Transfer elements from multidimensional array to one dimensional array
        //          { {"learn", "java", "it"}, {"is", "easy"} }

        int idx = 0;

        for (String[] w: words){

            for (String u : w){

                newWords[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newWords));//[learn, java, it, is, easy]



        }

    }
