package day22stringbuilderstringbuffer;

public class Constructors {

   /*
    1)Constructor are for creating object from a class
    2)Java puts constructor behind every class as default, it invisible and called as "default constructor"
      "Default Constructors are" like "public Constructors(){ }"
      If you type any constructor manually, Java removes default constructor
    3)If you want you can create your own constructors
    4)Methods have "return type" but Constructors do not have return type
      Methods can use any name, Constructors must use class name as name.
   */

    public String stdName = "Tom";
    public int stdAge = 23;
    public boolean isSuccessful = true;

    //To create a constructor i)Use access modifier ii)Use class name as Constructor name iii)Put constructor body
     public Constructors(){
     }

     //Create Constructor with parameters

    public Constructors(String stdName, int stdAge, boolean isSuccessful){

         this.stdName =  stdName;

         this.stdAge = stdAge;

         this.isSuccessful = isSuccessful;



    }




















    }

