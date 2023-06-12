package day21datetimestringbuilder;

public class StringBuilder01 {

    /*
       1)StringBuilder is a Class create Strings for you.
       2)Normally we create Strings by using String class, but Java gave us another class to create String because
         String Class gives you "immutable Strings" sometimes we need "mutable Strings" which StringBuilder gives.

     */

    public static void main(String[] args) {

       //To be able to use "updated String" you have to assignment in String Class
      String str = "Apex";
        System.out.println(str); //Apex
       str = str.concat("!");
        System.out.println(str); //Apex!

        StringBuilder sb = new StringBuilder("Apex");
        System.out.println(sb); //Apex

        sb.append("!");
        System.out.println(sb); //Apex!

        //append() method is for joining StringBuilders lik concat() method String class.

        StringBuilder sb1 = new StringBuilder("Mark");

        sb1.append(" Twain").append("!...");
        System.out.println(sb1); //Mark Twain!...

       //length() and capacity() methods

        StringBuilder sb2 = new StringBuilder("Brad");
        System.out.println(sb2.length());
        sb2.capacity(); //4
        System.out.println(sb2.capacity()); //20 ==> 16+4=20

        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb3.length()); //0
        System.out.println(sb3.capacity()); //16

        StringBuilder sb4 = new StringBuilder();
        sb4.append("Java").append("Python").append("Programming Language").append("!!!!!");
        System.out.println(sb4.length()); //30
        System.out.println(sb4.capacity()); //34 ==> 16x2 + 2 = 34 For  sb4.append("Java").append("Python").append("Programming Language")
       //For sb4.append("Java").append("Python").append("Programming Language").append("!!!!!"); ==> 34x2 + 2 = 70

        StringBuilder sb5 = new StringBuilder("Python");
        sb5.deleteCharAt(3);
        System.out.println(sb5);//Pyton

       sb5.delete(1,3);
       System.out.println(sb5); //Pon










    }
}
