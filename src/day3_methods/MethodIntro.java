package day3_methods;
/*
* Methods in Java
*   1. Standard Library methods - Built-in or externally imported
*   2. User-defined methods
*       2.a)Static methods -> you can call the method directly right after the class.method(). This will make more sense later when we learn Instance method
*       2.b)Instance method -> Will cover the details later when the Class and Object concepts introduced
* */
public class MethodIntro {
    public static void main(String[] args) {

    simpleMathod();
    repeatAfterMe("Say my name!");
    System.out.println(returnMeSumOfTwoNumbers(5,5));
    odOrEven(12);
    printInitials("Shukur","Altay");

    }

    private static void printInitials(String fName, String lName) {
        System.out.println(fName.charAt(0)+"."+lName.charAt(0));

    }

    private static void odOrEven(int i) {
        if (i % 2 == 0) {
            System.out.println(i+" is an even number");
        }else{
            System.out.println(i+" is an odd number");
        }
    }

    //public
    //private
    //protected
    //default
    //Access    //Static    //Return  //Method name
    //Modifier  //Modifier  //Type    //Or Signature   //Parenthesis - either accepts arg(AKA Parameter) or non-arg like below example
    public      static      void      simpleMathod     () {
        System.out.println("This is a simple method and it prints \"Hello World!\"");
    }
                                     //accepts String value as an argument
    private static void repeatAfterMe(String word){
        System.out.println(word);
    }
    //This method return type is Integer not void. And likewise, a method can return String,boolean and many other data types. More to come....
    public static int returnMeSumOfTwoNumbers(int num1, int num2) {
        return num1+num2;
    };
}
