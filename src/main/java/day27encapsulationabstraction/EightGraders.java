package day27encapsulationabstraction;

public class EightGraders extends Courses{


    @Override
    public void math() {

        System.out.println("Learn logarithm");
    }

    @Override
    public void art() {

        super.art();
    }
}
