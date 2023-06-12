package day20methodoverloadingdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {


        //How to get current date
       LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // 2023-04-16

        //How to get components of the date
        currentDate.getYear();
        System.out.println(currentDate.getYear()); //2023

        System.out.println(currentDate.getMonth()); //April
        System.out.println(currentDate.getMonthValue()); //4

        System.out.println(currentDate.getDayOfMonth()); //15
        System.out.println(currentDate.getDayOfWeek()); //Saturday

        //How to get current date in a specific zone
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo"))); // 2023-04-17
        System.out.println(LocalDate.now(ZoneId.of("Europe/Sofia"))); //2023-04-16


        //How to go future and past

        System.out.println(currentDate.plusYears(3).plusMonths(2).plusDays(12)); // 2026-06-28

        System.out.println(currentDate.minusYears(4).minusMonths(23).minusDays(11)); //2017-05-05


       // Example 1: Jhon was born 12 years 5 months 11 days ago, type code to find the day name Jhon's birthdate

        System.out.println(currentDate.minusYears(12).minusMonths(5).minusDays(11).getDayOfWeek());

        //How to compare two dates
        LocalDate dobTom = LocalDate.of(2011, Month.JULY, 21);

        LocalDate dobJim = LocalDate.of(2007,3,13);

        System.out.println(dobTom.isAfter(dobJim)); //true
        System.out.println(dobJim.isBefore(dobTom)); //true

        //Example 2: Type code for a booking application.
        //          If booking date is before current date give an error message like "Booking date cannot be past date"
        //          If booking date is equals current date give  a message like "We will call you when we have availability"
        //          If booking date is after current date give  a message like "The ticket was booked"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year with 4 digits to book a ticket");
        int year = input.nextInt();

        System.out.println("Enter month number to book a ticket");
        int month = input.nextInt();

        System.out.println("Enter day number to book a ticket");
        int day = input.nextInt();

        LocalDate bookingDate = LocalDate.of(year, month, day);

        if (bookingDate.isBefore(currentDate)){
            System.out.println("Booking date can not be past date");
        }else if (bookingDate.equals(currentDate)){
            System.out.println("We will call you when we have availability");
        }else{
            System.out.println("The ticket was booked");
        }

        //Example 3: Type code to find the day name of your birth.
        LocalDate myDob =LocalDate.of(1994,2,11);

       DayOfWeek dayName = myDob.getDayOfWeek();
        System.out.println(dayName);

        //How to format date

        LocalDate current = LocalDate.now();

        System.out.println(current);// ==> 2023-04-14

        // m is reserved for minute, that is why use "M" for month
        //"M" makes the month number single digit if it is less than 10
        //"MM" makes the month number two digits if it is less than 10
        //"MMM" gives you first three characters of month name.
        //"MMMM" gives you full month name
        // "yyyy" gives you the year in 4 digits
        // "yy" gives you the last two digits of the year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        String myDate = dtf.format(current);
        System.out.println(myDate);






    }
}
