package day32exceptions;

public class Exceptions03 {

    /*
       1)We sometimes need throw Exception for specific scenarios.
         To do that, use "throw" keyword in method body together with "new" keyword and "Exception Class Constructor"
       2)If you want to add message to your Exception  type it inside the "Exception Class Constructor" parenthesis
       Like; throw new IllegalArgumentException("Age can not be negative");
     */


    public static void main(String[] args) {


        printAge(12);
        //printAge(-23);

        printStudentsMathGrades(65);
        printStudentsMathGrades(120);
    }

    //Example 1: Create a method  print ages and throws Exception for negative ages.
    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age can not be negative");
        }
        System.out.println("Your age is " + age);
    }

    //Example 2: Create a method  prints the student's math grades and throws Exception for the values less than 0 and greater than 100
    public static void printStudentsMathGrades(int grade){
        if (grade<0 || grade>100){
            throw new IllegalArgumentException("Grade can not be less than zero or greater than hundred");
        }
        System.out.println("Your math grade is " + grade);

    }
}
