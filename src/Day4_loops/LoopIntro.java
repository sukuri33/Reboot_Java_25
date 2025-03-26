package Day4_loops;
/*
* for(initialization; condition; Iteration){
*           //Statements
* }
*
*
* */
public class LoopIntro {
    public static void main(String[] args) {
//find the sum of all the even number between 0 ~ 10
        int result = 0;
        for (int i = 0; i < 11 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                result += i;
            }
        }
        System.out.println(result);
    }

}
