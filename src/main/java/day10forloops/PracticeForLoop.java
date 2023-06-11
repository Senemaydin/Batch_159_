package day10forloops;

public class PracticeForLoop {

    public static void main(String[] args) {

        //Example 1: Type code to print "How are you?" 7 times on the console


        for (int i = 1; i<8; i++){
            System.out.println("How are you?");
        }

        //Example 2: Type code to print integers from 15 to 7

        for (int s =15; s>6; s--){
            System.out.print(s + " ");
        }

        System.out.println();

        //Example 3: Type code to print "even" integers from 3 to 12

        for (int k=3; k<13; k++){
            if (k%2==0){
            System.out.print(k + " ");
        }
        }

        System.out.println();
        //Example 4: Type code to print "odd" integers from 2 to 15

        for (int r =2; r<=15; r++){
            if (r%2==1){
                System.out.print(r+" ");

            }
        }

        System.out.println();
        //Example 5: Put "*" between 2 consecutive characters and to the end in a String.
        // For example; Senem ==> S*e*n*e*m*

        String s = "Senem";
        for (int e =0; e<s.length(); e++){
            System.out.print(s.charAt(e) + "*");
        }

        System.out.println();
        //Example 6: Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        // with a space between two consecutive integers

        for (int v=120; v>11; v--){
            if (v%4==0 && v%6==0){
                System.out.print(v+ " ");
            }
        }

        System.out.println();

        //Example 7: Type code to print repeated characters in a String. For example; accessories ⇒ ces

        String b = "accessories";
        String d = "";

        for (int a=0; a<b.length(); a++){
            String c =b.substring(a,a+1);
            if (b.indexOf(c)!=b.lastIndexOf(c)){
                if (!d.contains(c)){
                 d = d +c;
                }
            }

        }
        System.out.println(d);

        //Example 8: Type code to check whether a String is palindrome or not. If a String is the same with its reverse then it is called palindrome.
        // For example; “anna”, “123321” are palindromes

        String x = "runnur";
        String r = "";

        for (int z=x.length()-1; z>-1; z-- ){
            String y = x.substring(z,z+1);
            r = r + y;
        }
        if (x.equals(r)){
            System.out.println(x +  "is palindrome");
        }else{
            System.out.println(x + "is not palindrome");
        }

        //Example 8.1:

        String m = "Senem";
        String p = "";

        for (int l=m.length()-1; l>-1; l--){
        String u = m.substring(l,l+1);
        p = p + u;
        }

        if (m.equals(p)){
            System.out.println(m + "is palindrome");
        }else{
            System.out.println(m+ "is not palindrome");
        }
        //Example 8.2:

        String name = "ada";
        String v = "";
        for (int g = name.length()-1;g>-1; g-- ){
            String o = name.substring(g,g+1);
            v = v + o;
        }
            if (name.equals(v)){
                System.out.println(name + "is palindrome");
            }else{
                System.out.println(name + "is not palindrome");
            }


}
}