package day1_basics;

public class Concatenation {
    public static void main(String[] args) {
        String sName = "Shukur";
        System.out.println("Hello "+ sName);

        int age = 18;
        String sNum = "2";
        System.out.println(sNum+age);//it would print 218 not 20 because former is a string value so the + sign will be treated as concatenation ops not arithmetic ops


/**
 * ava executes these operations from left to right.
 * In the first line, 1 + 2 is 3, and 3 + "Hello" is "3Hello". But in the second line,
 * "Hello" + 1 is "Hello1", and "Hello1" + 2 is "Hello12".
 * */
        System.out.println(1 + 2 + "Hello");
// the output is 3Hello

        System.out.println("Hello" + 1 + 2);
// the output is Hello12
    }
}
