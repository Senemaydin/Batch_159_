package day12whileloop;

import java.util.Scanner;

public class PracticeDoWhileLoop {
    public static void main(String[] args) {

       /*
         Example 1: Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"
        */

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Enter the number");
            int num =input.nextInt();
            num = Math.abs(num);
            if (num<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");
                break;
            }

        }while (true);


        //Example 2: Type all integers which are divisible by 4 and divisible by 6
        // from 120 to 11 in the same line with a space between two consecutive integers


        String s = "";
        int t = 120;
        do {
            if (t%4==0 && t%6==0){
                s = s + t + " ";
            }
            t--;
        }while (t>11);

        System.out.println(s);

        //Example 3: Type code to print repeated characters in a String. For example; accessories ⇒ ces

        String s1 = "accessories";
        String d = "";
        Integer f =0;

        do {
         String c = s1.substring(f,f+1);
         if (s1.indexOf(c)!=s1.lastIndexOf(c)){
             if (!d.contains(c)){
                 d=d+c;
             }
         }
         f++;
        }while (f<s1.length());
        System.out.println(d);

       //Example 4: Type code to print repeated characters in a String. For example; colour ⇒ o

        String e = "colour";
        String r = "";
        Integer b = 0;

        do {

            String a = e.substring(b,b+1);
            if (e.indexOf(a)!=e.lastIndexOf(a)){
                if (!r.contains(a)){
                    r = r+a;
                }
            }
            b++;
        }while (b<e.length());
        System.out.println(r);

    }

}
