package day1_basics;

public class UnaryOps {
    public static void main(String[] args) {
        //Pre increment/decrement
        System.out.println("******Pre increment/decrement***********");
        int iNum = 5;
        System.out.println(++iNum);
        System.out.println(--iNum);

        //Post increment/decrement
        System.out.println("******Post increment/decrement***********");
        int iNum2 = 5;
        System.out.println(iNum2++);
        System.out.println(iNum2);
        System.out.println(iNum2--);
        System.out.println(iNum2);
    }
}
