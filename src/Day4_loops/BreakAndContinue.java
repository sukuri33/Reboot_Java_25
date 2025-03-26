package Day4_loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("********break; example**************");
        int counter = 0;
        while(counter != 10){//looks for true condition and stops when the condition becomes false
            System.out.println((counter++)+" Hello World");

            if(counter == 2){
                break;
                //System.out.println("After a break statement you shouldn't place any code because it will not be reached due to the break; so compile error!");
            }
        }
        System.out.println("********continue; example**************");
        for (int i = 0; i < 5; i++) {

            if(i == 3){
                //skipped 3rd iteration
                continue;
                //System.out.println(); compile error because execution will not reach after continue; statement just like break;
            }
            System.out.println(i);
        }
        System.out.println("********print odd numbers only****************");

        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
