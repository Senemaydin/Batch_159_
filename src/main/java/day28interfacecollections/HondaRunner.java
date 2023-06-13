package day28interfacecollections;

public class HondaRunner {

    /*

    What is the difference between "abstract classes" and "interfaces"?
    1)"interface" can have just "abstract methods" but "abstract classes" can have both "abstract" and "concrete methods"
    In Java 8, Java lets us create methods "methods with body" by using "default" and "static" keywords
    In Java 9, Java lets us create methods "methods with body" by using "private" keyword

    2)"Interfaces" have "public", "static" and "final" variables, but "abstract" classes can have every type of variables.
    3)A class can have just a single "abstract class parent" but a class can have many "interface parents"
    4)Both "abstract class" and "interface" can not give you an object but "abstract class" have constructor,
    "interface" does not have constructor.
    5)To make "abstract class" parent of a concrete class we use "extends" keyword
    6)To make "interface" parent of a concrete class we use "implements" keyword

     */

    public static void main(String[] args) {


        System.out.println(Engine.volume); //6
        System.out.println(AC.volume); //8
        System.out.println(Brake.volume); //7

        Honda myHonda = new Honda();
        myHonda.eco(); //Honda uses hybrid eco engines...
        Brake.secure(); //Brakes work securely...






    }
}
