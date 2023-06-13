package day25inheritanceoverriding;

public class AnimalRunner {
    public static void main(String[] args) {

        /*
        1)If a variable exists in a class Java uses the variable from the class itself
        2)If a class does not have the requested variable in it Java looks for the variable from the parent classes.
        3)If you use "this" inside the constructor it means you are calling a variable from the same class.
        4)If you use "super" inside the constructor it means you are calling a variable from the first level parent class.


        +++What is the difference between "this()" and "super()"?
                    this() is used call constructors from the class itself
                    super() is used call constructors from the first level parent class

         +++What is the difference between "this" and "this()"?
                     this() is used call constructors from the class itself
                     "this" for is calling a variable from the same class.

         +++What is the difference between "super" and "super()"?
                    super() is for calling constructors  from the first level parent class.
                    "super" is for calling variables from the first level parent class.


         */
        Cat myCat = new Cat();
        System.out.println(myCat.initial);  //A --> Cat class does not have variable initial it goes to parent class and
        // fetches the data from there

        System.out.println(myCat.age);
        //14 --> Cat class has the variable age already so need to parent class variable


        //When you create an object you can select the data type of the object from the class itself
        //from any parent class

        Object cat0 = new Cat();

        //When you select a variable in inheritance focus on the "data type" of the object.
        //The variable will be looked for starting from the class used "data type" object.

        Animal cat1 = new Cat();
        System.out.println("Data type is Animal : " + cat1.age); //4

        Mammal cat2 = new Cat();
        System.out.println("Data type is Mammal : " + cat2.age); // 6
        System.out.println(cat2.name); //Doggy

        Cat cat3 = new Cat();
        System.out.println("Data type is Cat : " + cat3.age); //14














    }
}
