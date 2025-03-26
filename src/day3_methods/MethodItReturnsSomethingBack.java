package day3_methods;

import static day3_methods.MethodIntro.returnMeSumOfTwoNumbers;

public class MethodItReturnsSomethingBack {
    public static void main(String[] args) {
        //Called this method from the class Method Intro because it is a public method and return type declared as Integer
        System.out.println(returnMeSumOfTwoNumbers(5,5));
    }
}
