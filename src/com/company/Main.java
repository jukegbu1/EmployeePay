package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner keyboard = new Scanner (System.in);

    System.out.println("Enter Employee Number");
    double employeeNumber = keyboard.nextDouble();

    System.out.println("Enter User PayRate");
    double payRate = keyboard.nextDouble();

    System.out.println("Enter HoursWorked");
    int hours = keyboard.nextInt();

        double weeklyPay = 0;
    if(payRate >=25){
        System.out.println("Error");
    }
    else if (hours >=60) {
        System.out.println("Error");
    }
    else if (hours > 35 && hours < 60) {
        int overtimeHours;
        double overtimePay;
        overtimeHours =  hours - 35;
        overtimePay = (overtimeHours) * (payRate * 1.5);
         weeklyPay = (overtimePay) + (35 * payRate);
        }
    else{
         weeklyPay = (hours) * (payRate);
    }

        System.out.println("\nemployeeNumber " + employeeNumber +
                "\nweeklyPay " + weeklyPay + "\nhours " + hours);

    }
}
