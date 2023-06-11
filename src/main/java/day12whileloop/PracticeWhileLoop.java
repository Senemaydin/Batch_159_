package day12whileloop;

import java.util.Scanner;

public class PracticeWhileLoop {

    public static void main(String[] args) {

        //Example 1: Type code to print integers from 3 to 6 on the console

        int i = 3;
        while (i<7){
            System.out.print( i + " ");
            i++;
        }

        System.out.println();

        //Example 2: Type code to print odd integers from 10 to 4 on the console

        int a = 10;
        while (a>3){
            if (a%2!=0){
                System.out.print(a + " ");
            }
            a--;
        }
        //Example 3: Type code to find the sum of the even integers from 10 to 13

        int b = 10;
        int sum =0;

        while (b<14){
            if (b%2==0){
               sum = sum + b;
                System.out.println(sum+ " ");
            }
            b++;
        }


        //Example 4: Type java code by using while loop,
        //          Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //          456 ==> 4+5+6 = 15

        Scanner input = new Scanner(System.in);
        System.out.println("Hey user enter the integer");
        int num = input.nextInt();
        num = Math.abs(num);
        int sum1 =0;

        while (num>0){
            sum1 = sum1 + num%10;
          num/=10;
        }
        System.out.println(sum1);

        /*
        Example 5: Type java code by using while loop,
        Write a program that prompts the user to input a number.
        It should then print the multiplication table of that number.
        3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user enter the number to see its multiplication table ");
        int number = scanner.nextInt();
        int n = 1;

        while (n<11){
            System.out.println(number + "*" + n + "="+ (number*n));
            n++;
        }









    }
}
