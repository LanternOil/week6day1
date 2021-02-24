package com.company.dahms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter the first number: ");
            int number = input.nextInt();

            System.out.println("Please enter the second number: ");
            int number2 = input.nextInt();

            add(number, number2);
            divide(number, number2);

        }
        catch (InputMismatchException e){
            System.out.println("I'm sorry, but that is the incorrect data type: " + e.getLocalizedMessage());
        }
        catch (ArithmeticException e){
            System.out.println("Sorry, I cannot divide by zero.");
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }

    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void divide(int a, int b){
        System.out.println(a/b);
    }

}
