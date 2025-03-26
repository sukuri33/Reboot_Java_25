package day1_basics;

public class LogicalOps {
    public static void main(String[] args) {
        System.out.println("********Logical AND Operator Truth Table********");
        System.out.println(1 == 1 && 2==2);//true true = true
        System.out.println(1 > 10 && 2==2);//false true = false
        System.out.println(1 < 10 && 2>2);//true false = false
        System.out.println(1 == 2 && 1 == 2);//false false = false

        System.out.println("********Logical OR Operator Truth Table********");
        System.out.println(1 == 1 || 2==2);//true true = true
        System.out.println(1 > 10 || 2==2);//false true = true
        System.out.println(1 < 10 || 2>2);//true false = ture
        System.out.println(1 == 2 || 1 == 2);//false false = false

        System.out.println("********Logical NOT Operator Truth Table********");
        boolean falseTrue = !true;
        System.out.println(falseTrue);
        boolean trueFalse = !false;
        System.out.println(trueFalse);

    }
}
