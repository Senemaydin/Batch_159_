package day33exceptions;

public class EnumRunner {

    public static void main(String[] args) {

        System.out.println(UsStates.UTAH.getCapital()); //Salt Lake City

        System.out.println(UsStates.WASHINGTON.getAbbreviation()); //WA

        System.out.println(UsStates.ALABAMA.getStateName()); //Alabama
    }
}
