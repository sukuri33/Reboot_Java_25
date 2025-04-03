package Day6_Array;

import Day5_ClassAndObject.Car;

import java.util.Arrays;

/*
* Data Structures:
*   1.Array
*       a)A special type of Variable
*       b)Holds multiple values of the same data type - i.e. int/boolean/Obj
*       c)Size is fixed
*       d)Supports both primitive & non-primitive
*       e)Every stored element in an array would have an auto-assigned order index - NOTE: Index starts from 0 to N number based on the size length.
*           i.Array AKA Ordered Data Structure - 1st inserted Array element will be in the 1st order and the last element will be the in the last order. That order doesn't change.
*   2.Collection
*   3.Map
* */
public class ArrayIntro {
    public static void main(String[] args) {

        //Declariong an Array
        //1.Specify the type, and then specify square brackets [] and finally array variable name/signature
        int[] elementInt;
        String[] elementStr;
        Car[] cars;//Will be stored car objects from Car class in Day_5 package
        //How to instantiate an Array?
        elementInt = new int[2];//Use the 'new' keyword, followed by type and then finally specify the size within the square brackets[]
        //Single line instantiation
        boolean[] elementBln = new boolean[9];//NOTE: You must provide size once the creation is invoked as it has to initialize the Array. If you don't give size you would get compile time error - "Array initializer expected"

        //2.Specify the type, and then specify the array name/signature which follows by a square brackets []
        int elementAges[] = {18,19,21,25,35};//You may also initialize your array like this
        String elementNames[];
        Car elementCars[];

        System.out.println(Arrays.toString(elementInt));

    }
}
