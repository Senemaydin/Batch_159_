package day10forloops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Put "*" between 2 consecutive characters and to the end in a String.
        // For example; Java ==> J*a*v*a*

        String s = "Java";

        for (int i=0  ; i<s.length(); i++  ){
            System.out.print(s.charAt(i)+ "*");
        }

        System.out.println();

        //Example 2: Type code to print unique characters in a String. Hello ==> Heo

        String t ="Hello";
        for(int h=0; h<t.length();h++){

           char ch = t.charAt(h);
            if (t.indexOf(ch)==t.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }

        System.out.println();

        //Example 3: Type code to reverse a String
        //           For Example: Tom==> moT

        String u = "Mark";
        String rev = "";

        for (int r = u.length()-1;r>=0;r--){
            rev = rev + u.charAt(r);
        }
        System.out.println(rev);
    }
}
