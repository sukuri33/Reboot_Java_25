package Day4_loops;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        while(true){
            counter++;
            System.out.println(counter);
            if(counter == 1){
                break;
            }

        }

        String words = "I love Java javA java jaja jaVA jAvA";

        int howMany = countTargetWord(words,"java");
        System.out.println("Count of Java repeated "+howMany+" times.");
    }
    static int countTargetWord(String str, String word){
        int counter = 0;
        while(str.toLowerCase().contains("java")){
            str = str.toLowerCase().replaceFirst("java","");
            counter++;
        }
        return counter;
    }
}
