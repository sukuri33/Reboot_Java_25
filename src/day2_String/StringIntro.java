package day2_String;

public class StringIntro {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);

        //There are two ways to create String object:
        //By String literal
        String str2 = "String literal";
        //By new keyword
        String str3 = new String("Used new keyword");
        /**
         * 1. String Pool Concept
             The String Pool is a pool of strings that the JVM maintains to avoid creating multiple string objects with the same value.
             When you create a string literal, Java checks the String Pool to see if an identical string already exists. If it does, Java reuses the existing string instead of creating a new one.
         * 2. How Strings are Stored
            When you declare a string using a literal (e.g., String s1 = "Hello";), the JVM first checks the String Pool.
             If "Hello" is already in the pool, s1 will reference the existing object.
             If "Hello" is not in the pool, it will be added, and s1 will reference the new object.
             If you use the new keyword (e.g., String s2 = new String("Hello");), the JVM will create a new String object in the heap even if an identical string exists in the String Pool.
         * 3. Benefits of the String Pool
             Memory Efficiency: Reusing strings with identical values reduces memory consumption.
             Faster Comparisons: String literals can be compared using == because they reference the same object if they come from the String Pool.*/
    }
}
