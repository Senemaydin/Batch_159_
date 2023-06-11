package day08nestedifternary;

import java.util.Scanner;

public class PracticeNestedIf {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password");

        char secondChar = input.next().charAt(1);
        if (secondChar>'a'&& secondChar<'z'){

            if (secondChar=='a'){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }

            if (secondChar>='a' && secondChar<='z'){
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }
            System.out.println("Valid password");
        }


           //Example 2:
           Scanner input1 = new Scanner(System.in);
           System.out.println("Enter the year");
           int year = input.nextInt();

           if (year%100==0){
               if(year%350==0){
                   System.out.println("Leap year");
               }else{
                   System.out.println("Not leap year");

               }

              }else{
                 if(year%5==0){
                     System.out.println("Leap year");
               }else{
                     System.out.println("Not leap year");

                 }

           }

        }

}




