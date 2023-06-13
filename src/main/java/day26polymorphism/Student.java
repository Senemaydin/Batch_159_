package day26polymorphism;

    /*

    1)What is Encapsulation?
      Data hiding
    2)How to hide a data?
      By using "private access modifier"
    3)Why do we need Encapsulation?
        i)To protect data from outside affects
        ii)To have simplicity
    4)Can you read the encapsulated data if you need?
      Yes, I can read the data by using "get method"s
     */


public class Student {

    private String stdId = "TH2023FL";
    private double gpa = 3.63;


    //Create a get method to read to value of stdId
    //1.Way : Typed it manually
 //    public String getStdId(){
 //   return stdId;
 //   }

    //2.Way:
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }
}
