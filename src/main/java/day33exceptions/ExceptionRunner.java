package day33exceptions;

public class ExceptionRunner {

     /*
        1)To declare your own strict rules on your application, you can create Your Own Exception Classes(Custom Exception Classes)
          For example, if using negative values for age is so dangerous, you can create "IllegalAgeException Class" and you can throw "IllegalAgeException"
          when the age is negative.
        2)When you name a Custom Exception Class use "Exception" word at the end of the name.
        3)If you want to create "Custom Checked Exception" extend to "Exception Class".
        4)Every Exception Class must have "Constructor" and the constructor should use the parent constructor as well

        5)If you want to create "Unchecked Exception" extend to "RuntimeException Class"
     */

    public static void main(String[] args) throws IllegalAgeException {

        printAge(12);
        printAge(-45);

        printAge2(32);
        //printAge2(-54);

        printMathGrades(78);
        printMathGrades(125);
    }


    //Example 1: Create a method to print user's age
    public static void printAge(int age){

        if (age<0){
            try {
                throw new IllegalAgeException("Age can not be negative");
            } catch (IllegalAgeException e) {
                System.out.println(e.getMessage());
            }
        }else{
        System.out.println("Your age is " + age);
    }
}

    //2.Way:

    public static void printAge2(int age) throws IllegalAgeException {
        if (age<0){
            throw new IllegalAgeException("Age can not be negative");

        }

        System.out.println("Your age is  " + age);
    }


    //Example 2: Create a method to print student's math grades
    public static void printMathGrades(int mathGrade){

        if (mathGrade<0 || mathGrade>100){
            throw new IllegalGradeException("Grade can not be less than zero or greater than hundred");

        }
        System.out.println("Your grade is " + mathGrade);
    }
}