package day2425inheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.eat();
        myCat.drink();
        myCat.meow();


        Dog myDog = new Dog();
        myDog.drink();
        myDog.eat();
        myDog.bark();

        Bird myBird = new Bird();
        myBird.eat();
        myBird.drink();
        myBird.tweet();
    }
}
