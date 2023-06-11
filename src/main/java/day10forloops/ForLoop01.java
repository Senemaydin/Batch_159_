package day10forloops;

public class ForLoop01 {

    /*
            1)Loops are used for "repeated actions" in Java
            2)There are 4 loops in Java i)for-Loop ii)while loop iii)do- while loop iv)for -each loop
     */

    public static void main(String[] args) {

        //Example 1: Type code to print "Hi!" 5 times on the console


        //1.Way: Not recommended
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        System.out.println("=================");

        //2.Way:
        for(int i=1;i<6; i++){
            System.out.println("Hi!");

        }
            //Example 2: Type code to print integers from 12 to 9
            for (int s =12; s>9; s--){
                System.out.println(s);

            }

            //Example 3: Type code to print "even" integers from 7 to 12

             for (int y =8; y<13; y+=2){
                 System.out.println(y);
             }
             // 2.Way
        for (int u =7;u<13;u++){
            if (u%2==0){
                System.out.println(u);
            }
        }

}
}
