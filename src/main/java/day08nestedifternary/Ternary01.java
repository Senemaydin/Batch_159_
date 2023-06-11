package day08nestedifternary;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a number is positive or not

        //Use if-else statement
        int num = -12;
        if (num>0){
            System.out.println("Positive");}else{System.out.println("Not positive");}

        //Use ternary statement
        String result =  num>0 ? "Positive" : "Not positive";
        System.out.println(result);

        //Example 2: Type code to check if a number is even or odd
        int number = 12;

      String r =  number%2==0 ? "Even" : "Odd";
        System.out.println(r);

        //Example 3: Type code to find the minimum of two integers
        int i = 12;
        int k = 16;

       int min =  i<k ?  i : k;
        System.out.println(min);

        int a = 12;
        int b = 12;

        int max =  a<b ?  a : b;
        System.out.println(max);

        //Example 4: Type code to calculate the "absolute value" of a number
        // 5==> 5     -5==> -1*-5       0==> 0

        int m = -5;
        int abs =  m>0 ? m : -1*m;
        System.out.println(abs);

        //Example 5: You have 2 integers;
        //            If both of the integers are positive do multiplication.
        //            Otherwise, return "I do not how to multiply"

        int t = 5;
        int u = 7;

        Object d = t>0 && u>0 ? t*u : "I do not know how to multiply";
        System.out.println(d);

        //Example 6: You have 2 integers
        //           If both are positive do addition
        //           Otherwise return the maximum one

        int e = 15;
        int s = -12;

       int es = e>0 && s>0 ? e+s : (e>s ? e : s);
        System.out.println(es);




    }
}
