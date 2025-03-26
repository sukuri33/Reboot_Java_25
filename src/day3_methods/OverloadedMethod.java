package day3_methods;
/*
• Allows us to have more than one method with the same name
• Parameters must be different (either the data type or the number of parameters)
• Improves the code readability and re-usability
• It’s easier to remember one method name instead of remembering multiple method
names

Things to keep in mind!
• Parameters of the overloaded method must be different
(number of parameters or data types of parameters)
• Return Type of the overloaded method can be same or
different
• Method can be overloaded any number of times
• Any method can be overloaded - including constructor and the main method - more to come on this.
* */
public class OverloadedMethod {
    public static void main(String[] args) {

     String myString = "Hello World";

     //As you can see below that substring() is a overloaded method.
     myString.substring(5);
     myString.substring(1, 3);

    }
    //overloaded MAIN method
    public static void main(int[] args) {

    }
}
