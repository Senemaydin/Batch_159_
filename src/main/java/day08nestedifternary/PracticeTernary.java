package day08nestedifternary;

import java.util.Scanner;

public class PracticeTernary {

    public static void main(String[] args) {

        //Example 1: Type code to check if a number is positive or not

        int num = 12;

        if (num>0){
            System.out.println("Positive");}else{System.out.println("Not positive");

        }

            // Use to ternary
            String result = num>0 ? "Positive" : "Not positive";
            System.out.println(result);

            //Example 2: Type code to check if a number is even or odd
            int num1 = 16;
            String r = num1%2==0 ? "Even" : "Odd";
            System.out.println(r);


            //Example 3: Type code to find the minimum of two integers

        int a = 14;
        int b = 45;

        int min = a<b ? a:b;
        System.out.println(min);

        int o = 35;
        int t = 78;

        int max = o>t ? o:t;
        System.out.println(max);

        //Example 4: Type code to calculate the "absolute value" of a number

        int f = -3;
        int abs = f>0 ?  f : -1*f;
        System.out.println(abs);

        int g = 8;
        int abs1 = g>0 ? g : -1*g;
        System.out.println(abs1);

        //Example 5: You have 2 integers;
        //            If both of the integers are positive do multiplication.
        //            Otherwise, return "I do not how to multiply"

        int y = 9;
        int e = 11;

        Object  v = y>0 && e >0 ? y*e : "I do not how to multiply";
        System.out.println(v);

        //Example 6: You have 2 integers
        //           If both are positive do addition
        //           Otherwise return the maximum one

        int d = 2;
        int s = 4;

        Object x = d>0 && s>0 ? (d+s) : (d>s ? d:s);
        System.out.println(x);



        //Example 7: You have 3 integers
        //           If all are positive do addition
        //           Otherwise return "I do not have addition"

        int q = 9;
        int z = 7;
        int m = 4;

        Object c = q>0 && z>0 && m>0 ? (q+z+m) :  "I do not have addition";
        System.out.println(c);










    }
}
