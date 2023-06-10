package day03wrapperclasstypecastingmethodcreation;

public class PracticeMethodCreation01 {

    public static void main(String[] args) {

        //Using a method inside the "main method" is called "Method Call"
        System.out.println(add(34.56 ,87.65));
        System.out.println(multiplication(3,2,3));
        System.out.println(division(48.6F, 6.2F,2.2F));
        System.out.println(getPerimeterMultiplyOfRectangle(12.3, 3.3));

        printNameWithExclamationMark("Senem");
        printNameWithDot("HASAN");
        printNameWithSemiColon("Aydın");

    }

     public static double add(double a, double b){return a+b;}

    public static int multiplication(int a, int b, int c){return a*b*c;}

    public static float division(float a, float b, float c){return a/b/c;}

    public static double getPerimeterMultiplyOfRectangle(double a, double b){return 2*(a+b);}

    //Create a method prints the given name on the console with "!" at the end

    public static void printNameWithExclamationMark(String name){System.out.println(name + "!");}

    //Create a method prints the given name on the console with "." at the end

    public static void printNameWithDot(String name){System.out.println(name + ".");}


    //Create a method prints the given name on the console with ";" at the end

    public static void printNameWithSemiColon(String name){System.out.println(name + ";");}




}




