package Day4_loops;
/*
* Branching Statement
*   break;
*   continue;
* */
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
        //This method is to demonstrate the usage of a return key word in a loop with the conjunction of a method.
        exampleForReturnKeyWordUsedInAloop("String");

        System.out.println(removeDupFromString("aaabbbcccddd"));

    }

    private static String removeDupFromString(String str) {
        String result = "";
        for(int i = 0; i < str.length();i++){

            if(result.contains(""+str.charAt(i))){
                continue;
            }
                result += str.charAt(i);

        }

        return result;
    }

    private static String exampleForReturnKeyWordUsedInAloop(String string) {

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 's'){
                return string.substring(i);
            }
        }
        return "null";
    }


}
