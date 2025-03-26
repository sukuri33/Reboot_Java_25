package day2_String;

public class StringMethods {
    public static void main(String[] args) {

        //charAt(<index number>);
        System.out.println("***********charAt() method*************");
        String str = "Hello World";
        char ch = str.charAt(0);
        System.out.println(ch);//prints 1st character of the string value of Hello World as we used the index 0

        System.out.println("***********indexOf() & lastIndexOf() method*************");
        String strVal = "HELLO MOTTO";
        System.out.println(strVal.charAt(strVal.indexOf('M')));
        System.out.println(strVal.charAt(strVal.lastIndexOf('T')-1));

        System.out.println("***********length() method*************");
        System.out.println(str.length());//returns an int value which represents the length of the given String value

        //Example of usage: Please print 1st and last character of a string value
        String firstName, lastName;
        firstName = "Shukur";
        System.out.println(firstName.charAt(0) + " " + firstName.charAt(firstName.length()-1));

        System.out.println("***********toLoweCase() & toUpperCase() method*************");
        System.out.println(strVal.toLowerCase());//Converts to lower case
        System.out.println(strVal.toUpperCase());//Converts to upper case

        System.out.println("***********trim() method*************");
        String strValueWithWhiteSpace = " HELLO MOTTO ";
        System.out.println("Before trim method applied: "+strValueWithWhiteSpace.length());
        System.out.println("After trim method applied: "+strValueWithWhiteSpace.trim().length());

        System.out.println("***********replace() and replaceFirst method*************");
        System.out.println(strVal.replace('M', 'H')+"N");

        System.out.println("***********subString() method*************");
        String strSub = "I love Java Programming";
        System.out.println(strSub.substring(7, 11));

        String yahoo = "hello@yahoo.com";
        if (yahoo.substring(yahoo.indexOf("@")).equals("@yahoo.com")) {
            System.out.println(yahoo.substring(yahoo.indexOf("@")));
        } else {
            System.out.println("not a yahoo.com" );
        }

        System.out.println(yahoo.substring(yahoo.indexOf("@")+1,yahoo.lastIndexOf(".")));

        System.out.println("***********isEmpty() & isBlank() method*************");
        String strEmpty = "";//If there is a blank space between the double quotes it would return false because a blank space is not considered empty rather it is a value
        String strBlank = " ";
        System.out.println(strEmpty.isEmpty());
        System.out.println(strBlank.isBlank());

        System.out.println("***********startsWith() & endsWith() method*************");
        String strURL = "http://www.google.com";
        //Validate if the given URL is in a valid format
        System.out.println((strURL.substring(strURL.lastIndexOf("/")+1)).startsWith("www.") && strURL.substring(strURL.lastIndexOf("/")+1).endsWith(".com"));

    }



}
