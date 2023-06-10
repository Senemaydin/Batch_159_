package day03wrapperclasstypecastingmethodcreation;

public class PracticeWrapper01 {

    public static void main(String[] args) {

        //Autoboxing
        short s = 4356;
        Short wrappers = s;
        System.out.println(wrappers);

        byte bit = 16;
        Byte wrapperBit = bit;
        System.out.println(wrapperBit);

        int age = 27;
        Integer wrapperAge = age;
        System.out.println(wrapperAge);

        long numberOfTheWorldBooks =  568722524778L;
        Long wrapperNumberOfTheWorldBooks = numberOfTheWorldBooks;
        System.out.println(wrapperNumberOfTheWorldBooks);


        //Unboxing

        Long l = 56735976476478L;
        long primitiveL = l;
        System.out.println(primitiveL);

        Integer book = 987;
        int primitiveBook = book;
        System.out.println(primitiveBook);

        Character name = 'A';
        char primitiveName = name;
        System.out.println(primitiveName);


    }






}
