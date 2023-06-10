package day05Stringmanipulations;

public class Practice01 {

    public static void main(String[] args) {

        //Change all characters to lower cases first then make this initials upper cases

        String name = "sEnEm aYdIn";
        String nameInLowerCase = name.toLowerCase();

        String firstChar = name.substring(0,1).toUpperCase();
        String restOfTheFirstName = name.split(" ")[0].substring(1).toLowerCase();

        String firstCharOfLastName = name.split(" ")[1].substring(0,1).toUpperCase();
        String restOfTheLastName = name.split(" ")[1].substring(1).toLowerCase();

        System.out.println(firstChar + restOfTheFirstName + " " + firstCharOfLastName +restOfTheLastName );

        System.out.println();










    }


}
