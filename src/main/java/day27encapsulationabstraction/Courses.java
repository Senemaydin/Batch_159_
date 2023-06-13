package day27encapsulationabstraction;


       /*
       1)Method without body is called "abstract method"
       2)Sometimes no child uses the body of a method in the parent class so
       no need to put body for the method.
       If you do not put body for the method it means you are creating "abstract method"
       3)To create an abstract method
         i)Do not type body of the method
         ii)Use "abstract" keyword between "access modifier" and return type
         iii)Make the class abstract
       4)What is the difference between "abstract method"s and "regular(concrete) method's?
         "abstract method"s from on "what to do", "concrete method"s focus on "what to do" and "how to do"
        5)"Abstract method"s must be overriding by the child classes, otherwise Java complains.
           Because of that, if we want some functionalities to be mandatory for the child classes we make them abstract.
        6)An "abstract class" can have "abstract method"s can an abstract class have "concrete method"?
        7)"Concrete method"s are not mandatory for the child classes to override.
        8)"abstract method"s must be overridden by the concrete child classes,
          if the child class is "abstract", it is optional to override abstract methods
        9)"abstract method"s can not be "private" because they must be overridden by the child classes.
          if you make it "private" child classes can not access to it can not override.
        10)"abstract method"s can not be "final" because they must be overridden by the child classes.
           but final methods can not be overridden
        11)"abstract methods"s have "abstract method"s, "abstract method"s do not have a body
         it means "abstract method"s are uncomplated methods.
         so abstract classes have uncompleted parts in them, so abstract classes are uncompleted templates.
         Because of that Java does not let us create objects from abstract classes.
        12)"abstract class" is a class that is why it has constructor but the constructor can not create an object

 */

    public abstract class Courses {

        public abstract void math();


        //Concrete method
        public void art(){
            System.out.println("Learn painting");

        }



    }

