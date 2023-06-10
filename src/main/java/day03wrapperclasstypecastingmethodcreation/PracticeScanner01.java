package day03wrapperclasstypecastingmethodcreation;

import java.util.Scanner;

public class PracticeScanner01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey user enter the age");

        int age = input.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Hey user enter the shirt price");

        double shirtPrice = input.nextDouble();
        System.out.println("Shirt price is "  +shirtPrice);

        System.out.println("Hey user did you married");

        boolean isMarried = input.nextBoolean();
        System.out.println("She is a" + isMarried);



        }


    }



