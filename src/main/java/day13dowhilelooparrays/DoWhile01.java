package day13dowhilelooparrays;

import java.util.Scanner;

public class DoWhile01 {


    public static void main(String[] args) {

/*
            Username is “admin”, Password is “pwd123"

            Ask user to enter username and password
            User should see “Enter your username and password” message

            If user enters correct credentials, he should get “You are in your account!” message

            Otherwise, he should see “Enter your username and password” message 3 times
            After 3 times he should get “Your account is blocked” message
	   */

        Scanner input = new Scanner(System.in);
        int counter = 0;

        do{
            if (counter==4){
                System.out.println("Your account was blocked!");
                break;
            }
            System.out.println("Enter your user name and password");
            String userName = input.next();
            String pwd = input.next();

            if (userName.equals("admin") && pwd.equals("pwd123")){
                System.out.println("You are in your account!");
                break;
            }else{
                System.out.println("Your password or username is wrong");
                System.out.println((4-counter) + "right left");
            }
            counter++;
        }while (true);























    }
}
