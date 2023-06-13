package day2425inheritance;

public class VehicleRunner {
    public static void main(String[] args) {

        Civic myCivic = new Civic(true);
        myCivic.ecoSystem();
        myCivic.brake();
        myCivic.engine();
        int hashCode =myCivic.hashCode();
        System.out.println("hashCode = " + hashCode);

        Accord myAcc = new Accord();
        myAcc.turboSystem();
        myAcc.brake();
        myAcc.move();








    }
}
