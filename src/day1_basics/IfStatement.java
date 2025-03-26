package day1_basics;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        /**
         1. Create a class named NumberOfDays.java
         2. An integer variable named month is declared and given, Write a
         program that can print the number of days in the given month
         Ex:
         Given:
         number = 1
         output:
         31 days
         Hints:
         Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
         Months that has 30 days are: 4, 6, 9, 11
         Month that has 28 days: 2
         */


        int a = 2;

        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            System.out.println("31 days");
        } else if (a == 4 || a == 6 || a == 9 || a == 11) {
            System.out.println("30 days");

        } else if (a == 2) {
            System.out.println("28 days");
        } else {
            System.out.println("Not a valid input");
        }

        System.out.println("******Ternary Operators*********");
        /**
         * Ternary Operators
         * variable = (Condition) ? Expression 1 : Expression 2;
         * ? means IF
         * : means ELSE
         * NOTE: Total number of question marks and colons must be even
         */

        String yesOrNo = (1 < 5) ? "Yes" : "No";
        System.out.println(yesOrNo);
    }
}
