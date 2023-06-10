package day05Stringmanipulations;

public class Practice02 {

    public static void main(String[] args) {

        String name = "sEnEm aYdIn";

        String secondChar = name.substring(0, 2).toLowerCase();
        String restOfTheFirstName = name.split(" ")[0].substring(1).toLowerCase();
        String restOfTheFirstChar = name.split(" ")[0].substring(0, 1).toUpperCase();
        System.out.println(restOfTheFirstName);

        String restOfTheSecondName = name.split(" ")[1].substring(0).toUpperCase();
        System.out.println(restOfTheSecondName);

        System.out.println(restOfTheFirstChar + restOfTheFirstName + " " + restOfTheSecondName);

        System.out.println();

    }
 }