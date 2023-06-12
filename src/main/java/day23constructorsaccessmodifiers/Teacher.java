package day23constructorsaccessmodifiers;

public class Teacher {

    public static int counter = 0; //number of teachers starting to work

    public int age = 45;

    public Teacher(int age) {
        this.age = age;
        this.age++;
        counter++;

    }
}
