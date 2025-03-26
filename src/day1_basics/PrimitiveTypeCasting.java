package day1_basics;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        /**
         * Allows us to assign one primitive type value to another primitive type
         * There are two types of primitive type castings: implicit and explicit castings
         * Cast Operator is needed to manually convert a value
         * Smallest to Largest Primitive data types which accepts casting
         * byte <--short <--int <--long <-- float <--double
         * */
        int number;
        double dVal = 3.14;
        number = (int) dVal;//Explicit Casting is needed as we are trying to assign larger data type to a smaller
    }
}
