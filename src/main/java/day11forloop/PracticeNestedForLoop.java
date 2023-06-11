package day11forloop;

import java.util.Scanner;

public class PracticeNestedForLoop {

    public static void main(String[] args) {
         /*
          Example 1:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for (int i=1; i<=4; i++){
            System.out.println("Week" +i);
            for (int d=1; d<=7; d++){
                System.out.println(" Day" +d);
            }
        }
        //Example 2: Write a Java Program to Print Rectangle Star Pattern using For Loop
        //    ****
        //    ****
        //    ****
        //Note: Get the number of the rows and the columns from user

        Scanner input = new Scanner(System.in);
        System.out.println("Hey user enter the number of the rows and columns ");
        int numberRows = input.nextInt();
        int numberColumns = input.nextInt();

        for (int s=1; s<=numberRows; s++ ){
            for (int c=1; c<=numberColumns; c++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Example 3: Create a half pyramid.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user enter the 2 number for half pyramid");
        int row = scanner.nextInt();
        int column = scanner.nextInt();


        for (int r=1; r<=row; r++){
            for (int f=1; f<=r; f++){
                System.out.print(f + " ");
            }
            System.out.println(" ");
        }



    }





}
