package day07ifstatement;

import java.util.Scanner;

public class PracticeIfStatement01 {

    public static void main(String[] args) {

        //Example 1:

        Scanner input = new Scanner(System.in);
        System.out.println("Please the user, enter the month name");
        String monthName = input.next();

        if (monthName.equalsIgnoreCase("september") || monthName.equalsIgnoreCase("october") ||
                monthName.equalsIgnoreCase("november")){
            System.out.println("The season is" +"Fall");
        }else if (monthName.equalsIgnoreCase("december") || monthName.equalsIgnoreCase("january")
                || monthName.equalsIgnoreCase("february")){
                System.out.println("The season is" + "Winter");
        }else if(monthName.equalsIgnoreCase("march") ||monthName.equalsIgnoreCase("april") ||
                monthName.equalsIgnoreCase("may")){
            System.out.println("The season is" + "Spring");
        }else if(monthName.equalsIgnoreCase("june") || monthName.equalsIgnoreCase("july") ||
                monthName.equalsIgnoreCase("august")){
            System.out.println("The season is" + "Summer");
        }


        //Example 2: Type to password code
        // a) "Valid Password" if the password has at least 8 characters different from space character
        // b) "Do not use space character in password" if the password has any space character in any position
        // c) "Invalid Password" if a and b conditions are not satisfied


        System.out.println("Enter the password");
        String pwd = input.next();

        if (pwd.length()>=8 && !pwd.contains(" ")){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
    }

        //Example 3: Type code to print week day or weekend day

        System.out.println("Enter the please day");
        String dayName = input.next();

        if (dayName.equals("Monday") || dayName.equals("Tuesday") || dayName.equals("Wednesday") ||
                 dayName.equals("Thursday")|| dayName.equals("Friday")){
            System.out.println("Week day");
            if (dayName.equals("Saturday")|| dayName.equals("Sunday")){
                System.out.println("Weekend day ");
            }

        }
            //Example 4:
            //a) "Round up by last digit:" and print the rounded value if the last digit is greater than
            //or equal to 5
            //b) "Round down by last digit" and print the rounded value if the last digit is less than 5

            int i = 146;

            if(i%10>=5){
                System.out.println("Round up by last digit" + ((i/10+1)*10));
            }else{
                System.out.println("Round down by last digit" +((i/10)*10));
        }

            //Example 5: Type code to print the name of the month when you entered the number of the month.
            //           Example; For 1 output is "January", for 2 output is "February" etc.


            int monthNum = 5;
            if (monthNum==1){
                System.out.println("The month is" + "January");}else{if (monthNum==2){System.out.println("The month is" + "February");
                }else{if (monthNum==3){System.out.println("The month is" + "March");
                }else{if (monthNum==4){System.out.println("The month is" + "April");
                }else{if (monthNum==5){System.out.println("The month is" + "May");
                }else{if (monthNum==6){System.out.println("The month is" + "June");
                }else{if (monthNum==7){System.out.println("The month is" + "July");
                }else{if (monthNum==8){System.out.println("The month is" + "August");
                }else{if (monthNum==9){System.out.println("The month is" + "September");
                }else{if (monthNum==10){System.out.println("The month is" + "October");
                }else{if (monthNum==11){System.out.println("The month is" + "November");
                }else{if (monthNum==12){System.out.println("The month is" + "December");}
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }


    }
}