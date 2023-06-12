package day23constructorsaccessmodifiers;

public class Student {

    /*
    Private Access Modifier
    1)If a class member(variable-method-constructor) is "private" it means
    it can not be visible(accessible) from other classes
    so by making class member "private" it means we are
    hiding the class member inside the class

     */
    private String stdId = "TH20211704";


    //Default Access Modifier
    //To make a class member "default" do not type  any access modifier
    //If you are in the same package with the default class member,
    // you can access to it.
    //If you are in the different package with the default class member,
    //you can not  access to it.
    int age = 13;

    //Public Access Modifier
    //If a class member is "public", you can access to it
    // from entire the project
    public boolean isSuccess = true;

    //Protected Access Modifier
    //If a class member is "protected", you can access to it
    //from the same package and child classes from other packages
    protected int grade = 11;

    //Note : A class can be just "public" or "default"
    //Do not use "private" and "protected" access modifiers for classes






}
