package PracticeQuestions;

import java.util.Scanner;

/*
Question 2 -> Create a class Calculator with the following methods:
 -calculateSum(int number1, int number2) to calculate the sum of two numbers.
 -calculateDifference(int number1, int number2) to calculate the difference between two numbers.
 */
class Calculator{
    void calculateSum(int number1,int number2){
        System.out.println("Sum : " + (number1 + number2) );
    }

    void calculateDifference(int number1,int number2){
        System.out.println("Difference : " + (number1 - number2) );
    }
}
public class SimpleCalculator {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
        Calculator c1 = new Calculator();
        c1.calculateSum(4,5);
        c1.calculateDifference(4,9);
    }
}

/* ------------>>>>>>>>>>OUTPUT<<<<<<<<<<<<-----------------

       Sum : 9
       Difference : -5


 */
