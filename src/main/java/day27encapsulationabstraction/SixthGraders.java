package day27encapsulationabstraction;

public class SixthGraders extends Courses {

    @Override
    public void math() {

        System.out.println("Learn +, -, :, x");

    }

    @Override
    public void art() {
        super.art();
    }
}
