package day25inheritanceoverriding;

public class Cat extends Mammal{

    public int age = 14;
    public String name = "Tom";
    public boolean old = false;
    public double x = 2.3;

    public Cat(){
        System.out.println(this.age); //14

        System.out.println(super.age); //6 => Because mammal class in the get age.

    }
}
