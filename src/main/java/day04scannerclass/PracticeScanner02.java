package day04scannerclass;

import java.util.Scanner;

public class PracticeScanner02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number..");
        double num1 = input.nextDouble();
        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("The sum is " + (num1 + num2));
        System.out.println("The multiply is" + num1*num2);
        System.out.println("The division is" + num1/num2);
        System.out.println("The sum is" + num1 + num2);

        System.out.println("Please enter a 5 digit number");
       int num3 = input.nextInt();
       int num4 = input.nextInt();





        }


    }

