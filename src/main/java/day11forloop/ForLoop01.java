package day11forloop;

public class ForLoop01 {


    public static void main(String[] args) {

        //Example 1: Type code to find the sum of integers from 5 to 26

        int sum = 0;
        for (int i=5; i<27;i++){
            sum = sum + i;
        }

        System.out.println(sum);

        //Example 2: Type code to find the multiplication of integers from 5 to 9

        int multiply = 1;

        for (int m = 5; m<10; m++){
            multiply = multiply*m;
        }
        System.out.println(multiply);//15120

        //Example 2: Type code to find the sum of the digits of an integer
        //         587==> 5+8+7=20

        int num = 587;
        int sumOfDigits = 0;
        for (int i= num; i>0; i/=10){
           sumOfDigits= sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);

        //Example 3: Type code to find the sum of the digits of an integer

        int num1 = -675;
       num1 =  Math.abs(num1);
        int sumOfDigits1 = 0;

        for (int i= num1; i>0; i/=10){
            sumOfDigits1= sumOfDigits1 + i%10;
        }
        System.out.println(sumOfDigits1);
    }
}
