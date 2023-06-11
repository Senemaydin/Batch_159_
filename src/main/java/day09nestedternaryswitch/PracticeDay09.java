package day09nestedternaryswitch;

public class PracticeDay09 {

    public static void main(String[] args) {


       //Example 1: Type java code by using nested ternary.
        //       Write a program to check if a year is “leap year” or not.
        //        i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
        //       ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-

          int year = 2005;

          String result = year%100==0 ? (year%400==0 ? "Leap year" : "Not leap year") : (year%4==0 ? "Leap year " :"Not leap year");
        System.out.println(result);

        //Example 2:Type code to check the password
        //         If it has more than 8 characters, initial should be 'T'
        //         If it has no more than 8 characters initial should be 'R'
        //         Solve the task by using nested-ternary
        //

        String pwd = "TH3521wfs";

        String isValid =  pwd.length()>8 ? (pwd.charAt(0)=='T' ? "Valid" : "Invalid") : (pwd.charAt(0)=='K' ? "Valid" : "Invalid");
        System.out.println(isValid);

         //Example 3:Type code to check the password
        //         If it has more than 7 characters, initial should be 'S'
        //         If it has  more than 7 characters last should be 'm'
        //         Solve the task by using nested-ternary

        String p = "SCewRKTym";
        String jk = p.length()>7 ? (p.charAt(0)=='S' ? "Valid" : "Invalid") : (p.charAt(8)=='m' ? "Valid" : "Invalid") ;
        System.out.println(jk);








    }
}
