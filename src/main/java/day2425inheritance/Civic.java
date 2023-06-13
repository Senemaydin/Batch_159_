package day2425inheritance;

public class Civic extends Honda {

    public void ecoSystem(){
        System.out.println("Using Civic is not expensive");
    }
    public Civic() {
        super(2023);
        System.out.println("Civic Constructor...");
    }

    public Civic(boolean hybrid){
        this();//It takes me to the constructor with int parameter
              //in the Honda Class
        System.out.println("Civic constructor with boolean parameter...");

    }
}
