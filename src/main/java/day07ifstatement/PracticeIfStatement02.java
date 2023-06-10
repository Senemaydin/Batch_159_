package day07ifstatement;

import java.util.Scanner;

public class PracticeIfStatement02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Example 1: Type code to check if a number is even or odd.
        int num = 46;
        if (num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //Example 2: Type code to check if a number is even or odd.

        int num1= 89;
        if (num1%3==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //Example 3: Type code to check if a number is even or odd.

        int num2=45;
        if (num2%2==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }


        //Example 4: Type to code check if initial of a String is upper case or not

        String name = "Senem";
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            System.out.println("It is upper case");
        }else{
            System.out.println("It is lower case");
        }

        //Example  5: Type to code check if second of a String is upper case or not
        String name1= "hasan";
        if (name1.charAt(1)>='a' && name1.charAt(1)<='z'){
            System.out.println("It is lower case");
        }else{
            System.out.println("It is upper case");
        }

        //Example 6: Type code to check if a number is positive, negative or zero
        int num3= -8;
        if (num3>0){
            System.out.println("Positive");
        }else if (num3==0){
            System.out.println("Neutral");
        }else{
            System.out.println("Negative");
        }

        //Example 7: Ask user to enter his age, then print his situation according to the given table
        //        0-4 ==>Baby      5-12 ==> Kid   13-20 ==>Young 21-30 ==> Adult 31-? ==> Undefined

        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age<0){
            System.out.println("Negative ages are invalid");
        }else if (age<5){
            System.out.println("Baby");
        }else if (age<13){
            System.out.println("Kid");
        }else if (age<21){
            System.out.println("Young");
        }else if (age<31){
            System.out.println("Adult");
        }else{
            System.out.println("Undefined");
        }





}
}