package day11forloop;

public class PracticeForLoop {

    public static void main(String[] args) {

        //Example 1: Type code to find the sum of the digits of an integer
        //         123==> 1+2+3=6

        int num = 123;
        int sum = 0;
        for (int i= num; i>0; i/=10){
            sum = sum + i%10;

        }
        System.out.println(sum);


        //Example 2: Type code to find the sum of the digits of an integer
        //         987==> 9+8+7=24

        int num1 =987;
        int sumOfDigits = 0;

        for (int k= num1; k>0; k/=10){
            sumOfDigits= sumOfDigits + k%10;
        }
        System.out.println(sumOfDigits);

        //Example 3: Type code to find the sum of the digits of an integer

        int num2 = -897;
        num2 = Math.abs(num2);
        int sum1 = 0;

       for (int r=num2; r>0; r/=10){
           sum1 = sum1 + r%10;
       }

        System.out.println(sum1);


        //Example 4: Type code to find the sum of the digits of an integer

        int num3 = -675;
        num3 = Math.abs(num3);
        int sum2 = 0;

        for (int e= num3; e>0; e/=10){
            sum2 = sum2 + e%10;
        }
        System.out.println(sum2);


        //Example 5: Type code to find the sum of the digits of an integer

        int number = -1234;
        number = Math.abs(number);
        int sumNumber = 0;

        for (int s= number; s>0; s/=10){
            sumNumber = sumNumber + s%10;
        }

        System.out.println(sumNumber);


    }
}
